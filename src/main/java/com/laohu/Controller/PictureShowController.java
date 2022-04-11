package com.laohu.Controller;

import com.laohu.Service.PictureServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @ClassName PictureShowController
 * @Description 照片墙
 * @Author 23757
 * @Date 2022/4/5 17:09
 * @Version 1.0
 */
@Controller
public class PictureShowController {

    @Autowired
    private PictureServiceImpl pictureService;

    @GetMapping("/picture")
    public String friends(Model model, HttpServletRequest request) {
        if(request.getSession().getAttribute("user") != null){
            model.addAttribute("bool",true);
        }else {
            model.addAttribute("bool",false);
        }
        System.out.println(pictureService.listPicture());
        model.addAttribute("pictures",pictureService.listPicture());
        return "picture";
    }

}
