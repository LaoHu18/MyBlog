package com.laohu.Controller;

import com.laohu.Service.FriendLinkServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName FriendsShowController
 * @Description 友人账
 * @Author 23757
 * @Date 2022/4/5 17:07
 * @Version 1.0
 */
@Controller
public class FriendsShowController {

    @Autowired
    private FriendLinkServiceImpl friendLinkService;

    @GetMapping("/friends")
    public String friends(Model model, HttpServletRequest request) {
        if(request.getSession().getAttribute("user") != null){
            model.addAttribute("bool",true);
        }else {
            model.addAttribute("bool",false);
        }
        model.addAttribute("friendlinks",friendLinkService.listFriendLink());
        return "friends";
    }

}