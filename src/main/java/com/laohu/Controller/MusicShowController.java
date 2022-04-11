package com.laohu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName MusicShowController
 * @Description 音乐盒
 * @Author 23757
 * @Date 2022/4/5 17:06
 * @Version 1.0
 */
@Controller
public class MusicShowController {

    @GetMapping("/music")
    public String about(HttpServletRequest request, Model model) {
        if(request.getSession().getAttribute("user") != null){
            model.addAttribute("bool",true);
        }else {
            model.addAttribute("bool",false);
        }
        return "music";
    }

}
