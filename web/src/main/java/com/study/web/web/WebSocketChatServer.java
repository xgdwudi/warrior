package com.study.web.web;

import com.alibaba.fastjson.JSON;
import com.styduy.common.websocket.Message;
import org.springframework.stereotype.Component;

import javax.websocket.*;
import javax.websocket.server.PathParam;
import javax.websocket.server.ServerEndpoint;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Component
@ServerEndpoint("/chat/{name}")
public class WebSocketChatServer {
    /**
     * 全部在线会话  PS: 基于场景考虑 这里使用线程安全的Map存储会话对象。
     * 以用户姓名为key
     */
    private static Map<String, Session> onlineSessions = new ConcurrentHashMap<>();

    /**
     * 当通信发生异常：打印错误日志
     */
    @OnError
    public void onError(Session session, Throwable error) {
        error.printStackTrace();
    }

    /**
     * 当客户端打开连接：1.添加会话对象 2.更新在线人数
     */
    @OnOpen
    public void onOpen(Session session, @PathParam("name") String name) {
        onlineSessions.put(name, session);
        sendMessageToAll(Message.jsonStr(Message.ENTER, "系统通知", "", "欢迎“" + name + "”加入群聊", onlineSessions.size(), listUser()));
    }

    /**
     * 当客户端发送消息：1.获取它的用户名和消息 2.发送消息给所有人
     * <p>
     * PS: 这里约定传递的消息为JSON字符串 方便传递更多参数！
     */
    @OnMessage
    public void onMessage(Session session, String jsonStr) {
        Message message = JSON.parseObject(jsonStr, Message.class);

        if (message.getToUser() != null) {
            sendMessageToUser(Message.jsonStr(Message.SPEAK, message.getFromUser(), message.getToUser(), message.getMsg(), onlineSessions.size()));
        } else {
            sendMessageToAll(Message.jsonStr(Message.SPEAK, message.getFromUser(), message.getToUser(), message.getMsg(), onlineSessions.size()));
        }
    }

    /**
     * 当关闭连接：1.移除会话对象 2.更新在线人数
     */
    @OnClose
    public void onClose(Session session, @PathParam("name") String name) {
        onlineSessions.remove(name);
        sendMessageToAll(Message.jsonStr(Message.QUIT, "系统通知", "", "“" + name + "”退出群聊", onlineSessions.size(), listUser()));
    }

    /**
     * 公共方法：发送信息给所有人
     */
    private static void sendMessageToAll(String msg) {
        onlineSessions.forEach((id, session) -> {
            try {
                session.getBasicRemote().sendText(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * 单独聊天方法：发送信息给指定的人
     */
    private static void sendMessageToUser(String msg) {
        Message message = JSON.parseObject(msg, Message.class);
        if (onlineSessions.get(message.getToUser()) != null) {
            try {
                onlineSessions.get(message.getToUser()).getBasicRemote().sendText(msg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } else {
            try {
                onlineSessions.get(message.getFromUser()).getBasicRemote().sendText(Message.jsonStr(Message.QUIT, "系统通知", message.getFromUser(), "用户不在线", onlineSessions.size()));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private List<String> listUser() {
        List<String> list = new ArrayList<>();

        for (Map.Entry<String, Session> s: onlineSessions.entrySet()) {
            list.add(s.getKey());
        }

        return list;
    }
}
