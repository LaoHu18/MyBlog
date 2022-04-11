package com.laohu.Service;

import com.laohu.Pojo.Picture;

import java.util.List;

/*处理照片的Service层的接口*/
public interface PrictureService {
    //查询照片
    List<Picture> listPicture();

    //添加图片
    int savePicture(Picture picture);

    //根据id查询照片
    Picture getPicture(Long id);

    //编辑修改相册
    int updatePicture(Picture picture);

    //删除照片
    void deletePicture(Long id);

}
