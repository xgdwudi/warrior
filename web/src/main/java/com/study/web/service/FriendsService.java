package com.study.web.service;

import com.study.common.entity.Friends;
import com.study.common.entity.LTXX;
import com.study.web.mapper.mapper02.FriendsDao;
import com.study.web.mapper.mapper02.InfoDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Friends)表服务实现类
 *
 * @author makejava
 * @since 2021-04-23 18:37:52
 */
@Service("friendsService")
public class FriendsService {
    @Resource
    private FriendsDao friendsDao;

    @Resource
    private InfoDao infoDao;

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public Friends queryById(Object id) {
        return this.friendsDao.queryById(id);
    }

    /**
     *
     */
    public List<Friends> queryAll(Friends friends) {
        return this.friendsDao.queryAll(friends);
    }

    /**
     * 增加好友信息
     */
    public Friends insert(Friends friends) {
        this.friendsDao.insert(friends);
        return friends;
    }

    /**
     * 修改数据
     *
     * @param friends 实例对象
     * @return 实例对象
     */
    public Friends update(Friends friends) {
        this.friendsDao.update(friends);
        return this.queryById(friends.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Object id) {
        return this.friendsDao.deleteById(id) > 0;
    }

    /**
     * 查寻所有聊天信息
     */
    public LTXX selectbyid(Long id){
        return friendsDao.selectbyid(id);
    }
}
