package com.congquy.diamondshop.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "cartItemControllerOfUser")
public class CartController {
    @RequestMapping(value = {"/dang-nhap/gio-hang"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("user/cart-product");
        return mav;
    }
}
