package com.laohu.Mapper;

import com.laohu.Pojo.Picture;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
/*处理相册的mapper层*/
public interface PictureMapper {
    //查询所有照片
    List<Picture> listPicture();

    //添加图片
    int savePicture(@Param("picture") Picture picture);

    //根据id查询照片
    Picture getPicture(@Param("id") Long id);

    //编辑修改相册
    int updatePicture(@Param("picture")Picture picture);

    //删除照片
    void deletePicture(@Param("id") Long id);
}
