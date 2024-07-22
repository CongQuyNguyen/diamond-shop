package com.congquy.diamondshop.controller.user;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller(value = "productControllerOfUser")
public class ProductController extends BaseController {


    @RequestMapping(value = {"/trang-chu"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = init();
        mav.setViewName("user/home-page");

        mav.addObject("slides", _slidesService.getListSlides());
        mav.addObject("products", _productService.getAllProduct());
        return mav;
    }

//    @RequestMapping(value = {"/san-pham/danh-sach-grid"}, method = RequestMethod.GET)
//    public ModelAndView gridProductPage() {
//        ModelAndView mav = new ModelAndView("user/grid-view");
//        mav.addObject("categories", categoryService.getCategories());
//        mav.addObject("menus", menuService.getListMenu());
//        return mav;
//    }
//
//    @RequestMapping(value = {"/san-pham/danh-sach-list"}, method = RequestMethod.GET)
//    public ModelAndView listProductPage() {
//        ModelAndView mav = new ModelAndView("user/list-view");
//        mav.addObject("categories", categoryService.getCategories());
//        mav.addObject("menus", menuService.getListMenu());
//        return mav;
//    }
//
//    @RequestMapping(value = {"/san-pham/danh-sach-4-col"}, method = RequestMethod.GET)
//    public ModelAndView fourColProductPage() {
//        ModelAndView mav = new ModelAndView("user/four-columns-view");
//        mav.addObject("menus", menuService.getListMenu());
//        return mav;
//    }

    @RequestMapping(value = {"/san-pham/chi-tiet-san-pham"}, method = RequestMethod.GET)
    public ModelAndView productDetailPage() {
        ModelAndView mav = init();
        mav.setViewName("user/product-detail");
        return mav;
    }
}
