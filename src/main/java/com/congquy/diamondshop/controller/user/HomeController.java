package com.congquy.diamondshop.controller.user;

import com.congquy.diamondshop.constant.SystemConstant;
import com.congquy.diamondshop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller(value = "homeControllerOfUser")
public class HomeController extends BaseController {

    @Autowired
    private IProductService productService;

    @RequestMapping(value = {"/trang-chu"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        _mavShare.setViewName("user/home-page");
        _mavShare.addObject("productsNew", productService.getProductByNewProduct(SystemConstant.NEW_PRODUCT));
        _mavShare.addObject("productsHighlight", productService.getProductByHighlightProduct(SystemConstant.HIGHLIGHT_PRODUCT));
        return _mavShare;
    }
}
