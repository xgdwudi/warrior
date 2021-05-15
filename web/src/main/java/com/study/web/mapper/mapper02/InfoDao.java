package com.study.web.mapper.mapper02;

import com.study.common.entity.Info;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Info)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-23 18:37:54
 */
public interface InfoDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Info queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Info> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param info 实例对象
     * @return 对象列表
     */
    List<Info> queryAll(Info info);

    /**
     * 新增数据
     *
     * @param info 实例对象
     * @return 影响行数
     */
    int insert(Info info);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Info> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Info> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Info> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Info> entities);

    /**
     * 修改数据
     *
     * @param info 实例对象
     * @return 影响行数
     */
    int update(Info info);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);

    /**
     *    根据 spid 和 rpid 去查询所有的聊天记录
     */
    List<Info> querybyspidandrpid(@Param("spid")Long id,@Param("list")List<Long> list);
}

