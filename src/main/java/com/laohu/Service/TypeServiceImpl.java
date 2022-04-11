package com.laohu.Service;

import com.laohu.Mapper.TypeMapper;
import com.laohu.Pojo.Type;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName TypeServiceImpl
 * @Description 操作分类的接口
 * @Author 23757
 * @Date 2022/4/5 12:37
 * @Version 1.0
 */
@Service
public class TypeServiceImpl implements TypeService{
    @Autowired
    private TypeMapper typeMapper;

    @Override
    //储存新分类
    public int saveType(Type type) {
        int i = typeMapper.saveType(type);
        return i;
    }

    @Override
    //获取所有分类类名和id
    public List<Type> getAllType() {
        List<Type> allType = typeMapper.getAllType();
        return allType;
    }

    @Override
    //通过id获取分类
    public Type getType(Long id) {
        Type type = typeMapper.getType(id);
        return type;
    }

    @Override
    //通过类名获取分类
    public Type getTypeByName(String name) {
        Type typeByName = typeMapper.getTypeByName(name);
        return typeByName;
    }

    @Override
    //更新分类
    public int updateType(Type type) {
        int i = typeMapper.updateType(type);
        return i;
    }

    @Override
    //删除分类
    public void deleteById(Long id) {
        typeMapper.deleteById(id);
    }

    @Override
    //获取分类及对应的文章
    public List<Type> getAllTypeAndBlog() {
        return typeMapper.getAllTypeAndBlog();
    }
}
