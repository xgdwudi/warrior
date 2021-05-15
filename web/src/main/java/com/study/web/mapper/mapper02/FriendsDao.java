package com.study.web.mapper.mapper02;

import com.study.common.entity.Friends;
import com.study.common.entity.LTXX;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * (Friends)表数据库访问层
 *
 * @author makejava
 * @since 2021-04-23 18:37:47
 */
public interface FriendsDao {

    /**
     * 通过ID查询单条数据
     *
     * @param id 主键
     * @return 实例对象
     */
    Friends queryById(Object id);

    /**
     * 查询指定行数据
     *
     * @param offset 查询起始位置
     * @param limit  查询条数
     * @return 对象列表
     */
    List<Friends> queryAllByLimit(@Param("offset") int offset, @Param("limit") int limit);


    /**
     * 通过实体作为筛选条件查询
     *
     * @param friends 实例对象
     * @return 对象列表
     */
    List<Friends> queryAll(Friends friends);

    /**
     * 新增数据
     *
     * @param friends 实例对象
     * @return 影响行数
     */
    int insert(Friends friends);

    /**
     * 批量新增数据（MyBatis原生foreach方法）
     *
     * @param entities List<Friends> 实例对象列表
     * @return 影响行数
     */
    int insertBatch(@Param("entities") List<Friends> entities);

    /**
     * 批量新增或按主键更新数据（MyBatis原生foreach方法）
     *
     * @param entities List<Friends> 实例对象列表
     * @return 影响行数
     */
    int insertOrUpdateBatch(@Param("entities") List<Friends> entities);

    /**
     * 修改数据
     *
     * @param friends 实例对象
     * @return 影响行数
     */
    int update(Friends friends);

    /**
     * 通过主键删除数据
     *
     * @param id 主键
     * @return 影响行数
     */
    int deleteById(Object id);
    /**
     * 通过用户id去查宅用户数据
     */
    LTXX selectbyid(@Param("id") Long id);

}

