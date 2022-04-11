package com.laohu.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName 友链
 * @Description 友链id、友链名称blogname、友链地址blogaddress、友链图片pictureaddress、友链创建时间createTime
 * @Author 23757
 * @Date 2022/4/5 12:14
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FriendLink {
    private Long id;
    private String blogname;
    private String blogaddress;
    private String pictureaddress;
    private Date createTime;
}
