package com.laohu.Queryvo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName RecommendBlog
 * @Description 最新推荐实体类
 * @Author 23757
 * @Date 2022/4/5 16:10
 * @Version 1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RecommendBlog {
    private Long id;
    private String title;
    private String firstPicture;
    private boolean recommend;
}
