package com.laohu.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName 分类
 * @Description 分类id 分类名 分类下的博客集合
 * @Author 23757
 * @Date 2022/4/5 12:06
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Type {
    private Long id;
    private String name;
    private List<Blog> blogs = new ArrayList<>();
}
