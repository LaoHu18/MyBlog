package com.laohu.Service;

import com.laohu.Mapper.UserMapper;
import com.laohu.Pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    /**
     * @Description: 根据用户名和密码返回用户对象
     * @Param: username:用户名；password:密码
     * @Return: 返回用户对象
     */
    @Override
    public User checkUser(String username, String password) {
        User user = userMapper.selectByUsernameAndPassword(username, password);
        return user;
    }
}
