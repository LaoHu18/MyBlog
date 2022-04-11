package com.laohu.Service;

import com.laohu.Mapper.PictureMapper;
import com.laohu.Pojo.Picture;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName PictureServiceImpl
 * @Description 处理照片的Service实现类
 * @Author 23757
 * @Date 2022/4/5 15:55
 * @Version 1.0
 */
@Service
public class PictureServiceImpl implements PrictureService{
    @Autowired
    private PictureMapper pictureMapper;

    @Override
    //查询所有照片
    public List<Picture> listPicture() {
        return pictureMapper.listPicture();
    }

    @Override
    //储存新的照片
    public int savePicture(Picture picture) {
        return pictureMapper.savePicture(picture);
    }

    @Override
    //根据id获取照片
    public Picture getPicture(Long id) {
        return pictureMapper.getPicture(id);
    }

    @Override
    //更新照片
    public int updatePicture(Picture picture) {
        return pictureMapper.updatePicture(picture);
    }

    @Override
    //删除照片
    public void deletePicture(Long id) {
        pictureMapper.deletePicture(id);
    }
}
