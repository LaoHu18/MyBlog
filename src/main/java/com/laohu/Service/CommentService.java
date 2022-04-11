package com.laohu.Service;

import com.laohu.Pojo.Comment;

import java.util.List;

/*评论管理的Service接口*/
public interface CommentService {
    //根据博客id查询评论信息
    List<Comment> listCommentByBlogId(Long blogId);

    //添加保存评论
    int saveComment(Comment comment);

    //删除评论
    void deleteComment(Comment comment,Long id);
}
