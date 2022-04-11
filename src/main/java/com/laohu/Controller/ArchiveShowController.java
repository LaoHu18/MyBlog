package com.laohu.Controller;

import com.laohu.Queryvo.BlogQuery;
import com.laohu.Service.BlogServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName ArchiveShowController
 * @Description 时间轴页面显示Controller
 * @Author 23757
 * @Date 2022/4/5 17:05
 * @Version 1.0
 */
@Controller
public class ArchiveShowController {

    @Autowired
    private BlogServiceImpl blogService;

    @GetMapping("/archives")
    public String archive(Model model, HttpServletRequest request){
        if(request.getSession().getAttribute("user") != null){
            model.addAttribute("bool",true);
        }else {
            model.addAttribute("bool",false);
        }
        List<BlogQuery> blogs = blogService.getAllBlog();
        model.addAttribute("blogs", blogs);
        return "archives";
    }
}
