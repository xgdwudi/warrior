package com.study.web.controller;

import com.study.common.constant.Result;
import com.study.common.entity.User;
import com.study.web.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表控制层
 *
 * @author makejava
 * @since 2021-04-23 18:38:02
 */
@RestController
@RequestMapping("user")
public class UserController {
    /**
     * 服务对象
     */
    @Resource
    private UserService userService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public User selectOne(Object id) {
        return this.userService.queryById(id);
    }


    /**
     * 根据手机号查询
     */
    @GetMapping("/do/{phone}")
    public Result selectByPhone(@PathVariable("phone")String phone){
        User user = new User();
        user.setPhone(phone);
        return Result.OK(userService.queryAll(user));
    }

    /**
     * 登錄接口
     */
    @PostMapping
    public Result login(@RequestBody User user){
        List<User> users = userService.queryAll(user);
        if(users.size()>0){
            return Result.OK(users.get(0));
        }else {
            return Result.Fail();
        }
    }
    /**
     * insert
     */
    @PostMapping("/dos")
    public Result insert(@RequestBody User user){
        return Result.OK(userService.insert(user));
    }

}
