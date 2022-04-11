package com.laohu.Controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.laohu.Pojo.Type;
import com.laohu.Queryvo.FirstPageBlog;
import com.laohu.Service.BlogServiceImpl;
import com.laohu.Service.TypeServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @ClassName TypeShowController
 * @Description 首页展示所有分类
 * @Author 23757
 * @Date 2022/4/5 17:01
 * @Version 1.0
 */
@Controller
public class TypeShowController {
    @Autowired
    private TypeServiceImpl typeService;

    @Autowired
    private BlogServiceImpl blogService;

    // 分页查询分类
    @GetMapping("/types/{id}")
    public String types(@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum, @PathVariable Long id, Model model, HttpServletRequest request) {
        List<Type> types = typeService.getAllTypeAndBlog();
        //id为-1表示从首页导航栏点击进入分类页面
        if (id == -1) {
            id = types.get(0).getId();
        }
        if(request.getSession().getAttribute("user") != null){
            model.addAttribute("bool",true);
        }else {
            model.addAttribute("bool",false);
        }
        model.addAttribute("types", types);
        List<FirstPageBlog> blogs = blogService.getByTypeId(id);

        PageHelper.startPage(pageNum, 10000);
        PageInfo<FirstPageBlog> pageInfo = new PageInfo<>(blogs);
        model.addAttribute("pageInfo", pageInfo);
        model.addAttribute("activeTypeId", id);
        return "types";
    }
}
