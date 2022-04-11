package com.laohu.Queryvo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName ShowBlog
 * @Description 编辑文章修改实体类
 * @Author 23757
 * @Date 2022/4/5 14:51
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class ShowBlog {
    private Long id;
    private String flag;
    private String title;
    private String content;
    private Long typeId;
    private String firstPicture;
    private String description;
    private boolean recommend;
    private boolean published;
    private boolean shareStatement;
    private boolean appreciation;
    private boolean commentabled;
    private Date updateTime;
}
