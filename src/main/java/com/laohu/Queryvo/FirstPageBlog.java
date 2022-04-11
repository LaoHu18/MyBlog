package com.laohu.Queryvo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName FirstPageBlog
 * @Description 最新博客实体类
 * @Author 23757
 * @Date 2022/4/5 16:07
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class FirstPageBlog {
    //博客信息
    private Long id;
    private String title;
    private String firstPicture;
    private Integer views;
    private Integer commentCount;
    private Date createTime;
    private Date updateTime;
    private String description;

    //分类名称
    private String typeName;

    //用户名
    private String nickname;
    //用户头像
    private String avatar;
}
