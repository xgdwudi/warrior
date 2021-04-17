package com.study.web.mapper.mapper02;


import com.styduy.common.entity.TabIncreate;

import java.util.List;


public interface TestMapper {
    List<TabIncreate> queryAll();

    int update(TabIncreate tabIncreate);
}
