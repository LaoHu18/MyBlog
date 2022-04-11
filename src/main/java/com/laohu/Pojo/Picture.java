package com.laohu.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName 相册
 * @Description 图片id，图片名称picturename，图片创建时间picturetime，图片地址pictureaddress，图片描述picturedescription
 * @Author 23757
 * @Date 2022/4/5 12:17
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Picture {
    private Long id;
    private String picturename;
    private String picturetime;
    private String pictureaddress;
    private String picturedescription;
}
