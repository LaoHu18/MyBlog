package com.laohu.Pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
/*用户实体类*/
public class User {
    private Long id;                //用户id
    private String nickname;          //用户昵称
    private String username;          //用户名
    private String password;          //用户密码
    private String email;          //用户邮箱
    private String avatar;          //用户头像
    private Integer type;          //用户类型
    private Date createTime;          //用户创建时间
    private Date updateTime;          //用户更新时间
}
