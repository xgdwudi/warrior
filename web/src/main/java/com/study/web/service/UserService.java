package com.study.web.service;


import com.study.common.entity.User;
import com.study.web.mapper.mapper02.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (User)表服务实现类
 *
 * @author makejava
 * @since 2021-04-23 18:38:02
 */
@Service("userService")
public class UserService {
    @Resource
    private UserDao userDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public User queryById(Object id) {
        return this.userDao.queryById(id);
    }

    /**
     * 根据条件查询多条数据
     *
     */
    public List<User> queryAll(User user) {
        return this.userDao.queryAll(user);
    }

    /**
     * 新增数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    public User insert(User user) {
        int insert = this.userDao.insert(user);
        user.setId(insert);
        return user;
    }

    /**
     * 修改数据
     *
     * @param user 实例对象
     * @return 实例对象
     */
    public User update(User user) {
        this.userDao.update(user);
        return this.queryById(user.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Object id) {
        return this.userDao.deleteById(id) > 0;
    }

}
