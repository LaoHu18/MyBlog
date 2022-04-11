package com.laohu.Util;

import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

//上传图片的工具类
@Component
public class UploadUntil {
    //注入七牛云工具类
    @Autowired
    private QiNiuYunUntil qiNiuYunUntil;

    public String upload(MultipartFile file){
        //原始文件名称 比如aa.png
        String originalFilename = file.getOriginalFilename();
        //唯一文件名称
        String fileName = UUID.randomUUID().toString() + "." + StringUtils.substringAfterLast(file.getOriginalFilename(), ".");
        //上传文件到七牛云
        boolean bool = qiNiuYunUntil.upload(file, fileName);
        if(bool){
            return "http://"+QiNiuYunUntil.url + "/" + fileName;
        }else {
           return "上传失败";
        }
    }
}
