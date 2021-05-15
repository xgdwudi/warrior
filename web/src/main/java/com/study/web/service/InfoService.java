package com.study.web.service;

import com.study.common.entity.Info;
import com.study.web.mapper.mapper02.InfoDao;
import org.apache.catalina.core.ApplicationContext;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Info)表服务实现类
 *
 * @author makejava
 * @since 2021-04-23 18:37:56
 */
@Service("infoService")
public class InfoService {
    @Resource
    private InfoDao infoDao;


    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    public Info queryById(Object id) {
        return this.infoDao.queryById(id);
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    public List<Info> queryAllByLimit(int offset, int limit) {
        return this.infoDao.queryAllByLimit(offset, limit);
    }

    /**
     * 新增数据
     *
     * @param info 实例对象
     * @return 实例对象
     */
    public Info insert(Info info) {
        this.infoDao.insert(info);
        return info;
    }

    /**
     * 修改数据
     *
     * @param info 实例对象
     * @return 实例对象
     */
    public Info update(Info info) {
        this.infoDao.update(info);
        return this.queryById(info.getId());
    }

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 是否成功
     */
    public boolean deleteById(Object id) {
        return this.infoDao.deleteById(id) > 0;
    }
}
