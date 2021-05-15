package com.study.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.Date;

/**
 * (Info)实体类
 *
 * @author makejava
 * @since 2021-04-23 18:31:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Info implements Serializable {
    private static final long serialVersionUID = -81684523416581059L;
    /**
     * 唯一标识
     */
    private Object id;
    /**
     * 发送方id
     */
    private Long spid;
    /**
     * 接收方id
     */
    private Long rpid;
    /**
     * 主体内容
     */
    private String context;
    /**
     * 消息时间
     */
    private Date time;
    /**
     * 消息类型 文本消息 0
     */
    private String type;
    /**
     * 消息状态 未读 0 已读 1
     */
    private String status;
    /**
     * 是否是自己发送的消息
     */
    private Boolean isone;


}
