package com.congquy.diamondshop.controller.admin;

import com.congquy.diamondshop.constant.SystemConstant;
import com.congquy.diamondshop.controller.user.BaseController;
import com.congquy.diamondshop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller(value = "homeControllerOfAdmin")
public class HomeController extends BaseController {

    @RequestMapping(value = {"/trang-quan-ly"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        _mavShare.setViewName("admin/home-page");
        return _mavShare;
    }
}
