package com.study.web.controller.websocket;

import com.study.web.service.InfoService;
import com.study.common.entity.Info;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Info)表控制层
 *
 * @author makejava
 * @since 2021-04-23 18:37:57
 */
@RestController
@RequestMapping("info")
public class InfoController {
    /**
     * 服务对象
     */
    @Resource
    private InfoService infoService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Info selectOne(Object id) {
        return this.infoService.queryById(id);
    }

}
