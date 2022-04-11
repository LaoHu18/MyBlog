package com.laohu.Service;

import com.laohu.Mapper.BlogMapper;
import com.laohu.NotFoundException;
import com.laohu.Pojo.Blog;
import com.laohu.Queryvo.*;
import com.laohu.Util.MarkDownUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @ClassName BlogServiceImpl
 * @Description 管理博客的Service层实现类
 * @Author 23757
 * @Date 2022/4/5 14:01
 * @Version 1.0
 */
@Service
public class BlogServiceImpl implements BlogService{
    @Autowired
    private BlogMapper blogMapper;

    @Override
    //存储文章
    public int saveBlog(Blog blog) {
        blog.setCreateTime(new Date());
        blog.setUpdateTime(new Date());
        blog.setViews(0);
        blog.setCommentCount(0);
        int i = blogMapper.saveBlog(blog);
        return i;
    }

    @Override
    //查询所有文章
    public List<BlogQuery> getAllBlog() {
        List<BlogQuery> allBlogQuery = blogMapper.getAllBlogQuery();
        return allBlogQuery;
    }

    @Override
    //删除博客
    public void deleteBlog(Long id) {
       blogMapper.deleteBlog(id);
    }

    @Override
    //查询编辑修改的文章
    public ShowBlog getBlogById(Long id) {
        return blogMapper.getBlogById(id);
    }

    @Override
    //编辑修改的文章
    public int updateBlog(ShowBlog showBlog) {
        return blogMapper.updateBlog(showBlog);
    }

    @Override
    //博客管理页面搜索
    public List<BlogQuery> searchByTitleAndType(SearchBlog searchBlog) {
        return blogMapper.searchByTitleAndType(searchBlog);
    }

    //查询首页最新博客列表信息
    @Override
    public List<FirstPageBlog> getAllFirstPageBlog() {
        return blogMapper.getFirstPageBlog();
    }

    //查询首页最新推荐信息
    @Override
    public List<RecommendBlog> getRecommendedBlog() {
        List<RecommendBlog> allRecommendBlog = blogMapper.getAllRecommendBlog();
        return allRecommendBlog;
    }

    //搜索博客列表
    @Override
    public List<FirstPageBlog> getSearchBlog(String query) {
        return blogMapper.getSearchBlog(query);
    }

    //统计博客总数
    @Override
    public Integer getBlogTotal() {
        return blogMapper.getBlogTotal();
    }

    //统计访问总数
    @Override
    public Integer getBlogViewTotal() {
        return blogMapper.getBlogViewTotal();
    }

    //统计评论总数
    @Override
    public Integer getBlogCommentTotal() {
        return blogMapper.getBlogCommentTotal();
    }

    //统计留言总数
    @Override
    public Integer getBlogMessageTotal() {
        return blogMapper.getBlogMessageTotal();
    }

    @Override
    //查询博客详情
    public DetailedBlog getDetailedBlog(Long id) {
        DetailedBlog detailedBlog = blogMapper.getDetailedBlog(id);
        if (detailedBlog == null) {
            throw new NotFoundException("该博客不存在");
        }
        String content = detailedBlog.getContent();
        detailedBlog.setContent(MarkDownUtils.markdownToHtmlExtensions(content));
        //文章访问数量自增
        blogMapper.updateViews(id);
        //文章评论数量更新
        blogMapper.getCommentCountById(id);
        return detailedBlog;
    }

    //分类页面查询
    @Override
    public List<FirstPageBlog> getByTypeId(Long typeId) {
        return blogMapper.getByTypeId(typeId);
    }
}
