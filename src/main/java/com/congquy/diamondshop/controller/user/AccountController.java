package com.congquy.diamondshop.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "accountControllerOfUser")
public class AccountController {

    @RequestMapping(value = {"/dang-nhap"}, method = RequestMethod.GET)
    public ModelAndView loginPage() {
        ModelAndView mav = new ModelAndView("login/login");
        return mav;
    }

    @RequestMapping(value = {"/dang-nhap/tao-tai-khoan"}, method = RequestMethod.GET)
    public ModelAndView registerPage() {
        ModelAndView mav = new ModelAndView("login/register");
        return mav;
    }

    @RequestMapping(value = {"/dang-nhap/quen-mat-khau"}, method = RequestMethod.GET)
    public ModelAndView forgotPassPage() {
        ModelAndView mav = new ModelAndView("login/forgot-password");
        return mav;
    }
}
