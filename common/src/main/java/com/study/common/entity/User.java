package com.study.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (User)实体类
 *
 * @author makejava
 * @since 2021-04-23 18:31:27
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User implements Serializable {
    private static final long serialVersionUID = 277157755824916402L;
    /**
     * 唯一标识
     */
    private Object id;
    /**
     * 昵称
     */
    private String name;
    /**
     * 电话
     */
    private String phone;
    /**
     * 密码
     */
    private String password;
}
