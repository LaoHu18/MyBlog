package com.laohu.Queryvo;

import com.laohu.Pojo.Type;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

/**
 * @ClassName BlogQuery
 * @Description 用于博客查询、后台显示所有博客的实体类
 * @Author 23757
 * @Date 2022/4/5 14:05
 * @Version 1.0
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class BlogQuery {
    private Long id;
    private String title;
    private Date updateTime;
    private Boolean recommend;
    private Boolean published;
    private Long typeId;
    private Type type;
}
