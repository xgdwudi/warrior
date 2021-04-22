package com.styduy.common.websocket;

import com.alibaba.fastjson.JSON;

import java.util.List;

public class Message {
    public static final String ENTER = "ENTER";
    public static final String SPEAK = "SPEAK";
    public static final String QUIT = "QUIT";

    private String type;  // 消息类型

    private String fromUser; // 发送人

    private String toUser;  // 接收人

    private String msg;  // 发送消息

    private int onlineCount;  // 在线用户数

    private List<String> list;

    /*
     * 聊天消息
     * 没有设置接收人 toUser ，视为群聊
     * 设置了接收人 toUser，视为私聊
     * */
    public static String jsonStr(String type, String fromUser, String toUser, String msg, int onlineCount) {
        return JSON.toJSONString(new Message(type, fromUser, toUser, msg, onlineCount));
    }

    public Message(String type, String fromUser, String toUser, String msg, int onlineCount) {
        this.type = type;
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.msg = msg;
        this.onlineCount = onlineCount;
    }

    public static String jsonStr(String type, String fromUser, String toUser, String msg, int onlineCount, List<String> list) {
        return JSON.toJSONString(new Message(type, fromUser, toUser, msg, onlineCount, list));
    }

    public Message(String type, String fromUser, String toUser, String msg, int onlineCount, List<String> list) {
        this.type = type;
        this.fromUser = fromUser;
        this.toUser = toUser;
        this.msg = msg;
        this.onlineCount = onlineCount;
        this.list = list;
    }

    public static String getENTER() {
        return ENTER;
    }

    public static String getSPEAK() {
        return SPEAK;
    }

    public static String getQUIT() {
        return QUIT;
    }

    public String getType() {
        return type;
    }

    public Message setType(String type) {
        this.type = type;
        return this;
    }

    public String getFromUser() {
        return fromUser;
    }

    public Message setFromUser(String fromUser) {
        this.fromUser = fromUser;
        return this;
    }

    public String getToUser() {
        return toUser;
    }

    public Message setToUser(String toUser) {
        this.toUser = toUser;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public Message setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public int getOnlineCount() {
        return onlineCount;
    }

    public Message setOnlineCount(int onlineCount) {
        this.onlineCount = onlineCount;
        return this;
    }

    public List<String> getList() {
        return list;
    }

    public Message setList(List<String> list) {
        this.list = list;
        return this;
    }
}
