package com.laohu.Service;

import com.laohu.Pojo.User;

public interface UserService {
    //核对用户名和密码
    User checkUser(String username, String password);
}
