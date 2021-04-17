package com.styduy.common.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * (TabIncreate)实体类
 *
 * @author makejava
 * @since 2021-04-16 09:27:09
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class TabIncreate implements Serializable {
    private static final long serialVersionUID = -61122131694609775L;

    private Integer id;

    private String name;

}
