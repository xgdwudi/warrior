package com.study.web.mapper.mapper01;


import com.styduy.common.entity.SysRole;

import java.util.List;


public interface SysRolemapper {

    List<SysRole> queryAll();

    int update(SysRole sysRole);
}
