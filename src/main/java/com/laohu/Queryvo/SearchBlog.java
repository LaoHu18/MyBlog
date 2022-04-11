package com.laohu.Queryvo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName SearchBlog
 * @Description 博客模糊查询
 * @Author 23757
 * @Date 2022/4/5 14:58
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class SearchBlog {
    private String title;
    private Long typeId;
}
