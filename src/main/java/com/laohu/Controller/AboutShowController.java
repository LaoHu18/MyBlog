package com.laohu.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName AboutShowController
 * @Description 关于我
 * @Author 23757
 * @Date 2022/4/5 17:10
 * @Version 1.0
 */
@Controller
public class AboutShowController {

    @GetMapping("/about")
    public String about(HttpServletRequest request, Model model) {
        if(request.getSession().getAttribute("user") != null){
            model.addAttribute("bool",true);
        }else {
            model.addAttribute("bool",false);
        }
        return "about";
    }

}
