package com.laohu.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @ClassName 评论
 * @Description 主键（id）、昵称（nickname）、邮箱（email）、头像（avatar）、评论内容（content）、
 *              创建时间（createTime）、博客id（blogId）、父评论id（parentCommentId）、是否为管理员评论（adminComment）
 * @Author 23757
 * @Date 2022/4/5 12:08
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Comment {
    private Long id;
    private String nickname;
    private String email;
    private String content;
    private String avatar;
    private Date createTime;
    private Long blogId;
    private Long parentCommentId;
    private boolean adminComment;

    /*回复评论集合（replyComments）用来存储回复信息、父评论昵称（parentNickname）用来设置父级评论的id以及父评论（parentComment）用来显示父级评论姓名
     */
    private List<Comment> replyComments = new ArrayList<>();
    private Comment parentComment;
    private String parentNickname;
}
