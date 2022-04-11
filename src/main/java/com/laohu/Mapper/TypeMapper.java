package com.laohu.Mapper;

import com.laohu.Pojo.Type;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 分类管理有查询分类、保存分类、修改编辑分类、删除分类、因此需要有getAllType、saveType、updateType、deleteType接口
 */
@Mapper
@Repository
public interface TypeMapper {
    //保存新增分类
    int saveType(@Param("type")Type type);

    //获取所有分类id和类名
    List<Type> getAllType();

    //根据id查询分类
    Type getType(@Param("id")Long id);

    //根据分类名查询分类
    Type getTypeByName(@Param("name") String name);

    //编辑修改分类
    int updateType(@Param("type")Type type);

    //删除分类
    void deleteById(@Param("id")Long id);

    //查询所有分类及对应的文章
    List<Type> getAllTypeAndBlog();
}
