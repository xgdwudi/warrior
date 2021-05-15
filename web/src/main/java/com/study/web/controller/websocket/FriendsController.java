package com.study.web.controller.websocket;

import com.study.common.constant.Result;
import com.study.web.service.FriendsService;
import com.study.common.entity.Friends;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Friends)表控制层
 *
 * @author makejava
 * @since 2021-04-23 18:37:53
 */
@RestController
@RequestMapping("friends")
public class FriendsController {
    /**
     * 服务对象
     */
    @Resource
    private FriendsService friendsService;

    /**
     * 通过pid查找好友列表
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("do/{pid}")
    public Result selectOne(@PathVariable("pid")Long id) {
        Friends friends = new Friends();
        friends.setPid(id);
        return Result.OK(this.friendsService.queryAll(friends));
    }
    @GetMapping("dos/{id}")
    public Result selectOnes(@PathVariable("id")Long id) {
        return Result.OK(this.friendsService.selectbyid(id));
    }

}
