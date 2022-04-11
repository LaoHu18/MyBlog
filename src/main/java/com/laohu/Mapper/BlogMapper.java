package com.laohu.Mapper;

import com.laohu.Pojo.Blog;
import com.laohu.Queryvo.*;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @ClassName BlogMapper
 * @Description 管理博客的mapper层接口
 * @Author 23757
 * @Date 2022/4/5 13:59
 * @Version 1.0
 */
@Mapper
@Repository
public interface BlogMapper {
    //保存新增博客
    int saveBlog(Blog blog);

    //查询文章管理列表
    List<BlogQuery> getAllBlogQuery();

    //删除博客
    void deleteBlog(Long id);

    //博客编辑修改
    int updateBlog(ShowBlog showBlog);

    //查询编辑修改的文章
    ShowBlog getBlogById(Long id);

    //博客的模糊查询
    List<BlogQuery> searchByTitleAndType(SearchBlog searchBlog);

    //查询首页最新博客列表信息
    List<FirstPageBlog> getFirstPageBlog();

    //查询首页最新推荐信息
    List<RecommendBlog> getAllRecommendBlog();

    //搜索博客列表
    List<FirstPageBlog> getSearchBlog(String query);

    //统计博客总数
    Integer getBlogTotal();

    //统计访问总数
    Integer getBlogViewTotal();

    //统计评论总数
    Integer getBlogCommentTotal();

    //统计留言总数
    Integer getBlogMessageTotal();

    //查询博客详情
    DetailedBlog getDetailedBlog(Long id);

    //文章访问更新
    int updateViews(Long id);

    //根据博客id查询出评论数量
    int getCommentCountById(Long id);

    //根据TypeId查询博客列表，显示在分类页面
    List<FirstPageBlog> getByTypeId(Long typeId);
}
