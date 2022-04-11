package com.laohu.Mapper;

import com.laohu.Pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

@Repository
@Mapper
/*用户Mapper*/
public interface UserMapper {

    public User selectByUsernameAndPassword(@Param("username") String username, @Param("password") String password);

}
