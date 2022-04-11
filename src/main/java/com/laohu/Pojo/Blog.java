package com.laohu.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName Blog
 * @Description 主键（id）、博客标题（title）、博客内容（content）、首图地址（firstPicture）、
 * 标记是否原创（flag）、浏览次数（views）、评论次数（commentCount）、是否开启赞赏（appreciation）、
 * 是否开启版权（shareStatement）、是否开启评论（commentabled）、是否发布（published）、是否推荐（recommend）、
 * 创建时间（createTime）、更新时间（updateTime）、博客描述（description）
 * 分类（type）、用户（user）、评论集合（comments）以及分类id（typeId）、用户id（userId）
 * @Author 23757
 * @Date 2022/4/5 12:03
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Blog {
    private Long id;
    private String title;
    private String content;
    private String firstPicture;
    private String flag;
    private Integer views;
    private Integer commentCount;
    private boolean appreciation;
    private boolean shareStatement;
    private boolean commentabled;
    private boolean published;
    private boolean recommend;
    private Date createTime;
    private Date updateTime;
    private String description;

    private Type type;
    private User user;
    private Long typeId;
    private Long userId;
    private List<Comment> comments = new ArrayList<>();
}
