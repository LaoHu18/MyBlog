package com.laohu.Service;

import com.laohu.Pojo.Type;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/*分类接口*/
public interface TypeService {
    //新增保存分类
    int saveType(Type type);

    //查询所有分类
    List<Type> getAllType();

    //根据id查询分类
    Type getType(Long id);

    //根据分类名称查询分类
    Type getTypeByName(String name);

    //编辑修改分类
    int updateType(Type type);

    //删除分类
    void deleteById(Long id);

    //查询所有分类
    List<Type>getAllTypeAndBlog();
}
