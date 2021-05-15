package com.study.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.io.Serializable;
import java.util.List;

/**
 * (Friends)实体类
 *
 * @author makejava
 * @since 2021-04-23 18:31:22
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Friends implements Serializable {
    private static final long serialVersionUID = -71040397284235736L;
    /**
     * 唯一标识
     */
    private Object id;
    /**
     * 个人id
     */
    private Long pid;
    /**
     * 好友id
     */
    private Long fpid;
    /**
     * 状态 0 添加 1 已添加
     */
    private String status;
    /**
     * 申请时间
     */
    private Date stime;
    /**
     * 添加时间
     */
    private Date ttime;

    private List<Info> info;
    /**
     * 昵称
     */
    private String name;
}
