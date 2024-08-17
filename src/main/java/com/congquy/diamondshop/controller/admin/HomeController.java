package com.congquy.diamondshop.controller.admin;

import com.congquy.diamondshop.controller.user.BaseController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller(value = "homeControllerOfAdmin")
public class HomeController extends BaseController {

    @RequestMapping(value = {"/trang-quan-tri"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        _mavShare.setViewName("admin/home-page");
        return _mavShare;
    }
}
