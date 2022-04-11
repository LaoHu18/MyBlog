package com.laohu.Service;

import com.laohu.Mapper.FriendLinkMapper;
import com.laohu.Pojo.FriendLink;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName FriendServiceImpl
 * @Description 操作友链的Service的实现类
 * @Author 23757
 * @Date 2022/4/5 15:26
 * @Version 1.0
 */
@Service
public class FriendLinkServiceImpl implements FriendLinkService{
    @Autowired
    private FriendLinkMapper friendLinkMapper;

    @Override
    //查询所有友链
    public List<FriendLink> listFriendLink() {
        return friendLinkMapper.listFriendLink();
    }

    @Override
    //储存友链
    public int saveFriendLink(FriendLink friendLink) {
        return friendLinkMapper.saveFriendLink(friendLink);
    }

    @Override
    //通过友链链接地址得到友链信息
    public FriendLink getFriendLinkByBlogaddress(String blogaddress) {
        return friendLinkMapper.getFriendLinkByBlogaddress(blogaddress);
    }

    @Override
    //通过id得到友链信息
    public FriendLink getFriendLink(Long id) {
        return friendLinkMapper.getFriendLink(id);
    }

    @Override
    //更新友链
    public int updateFriendLink(FriendLink friendLink) {
        return friendLinkMapper.updateFriendLink(friendLink);
    }

    @Override
    //删除友链
    public void deleteFriendLink(Long id) {
        friendLinkMapper.deleteFriendLink(id);
    }
}
