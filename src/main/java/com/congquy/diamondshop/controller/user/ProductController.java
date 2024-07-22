package com.congquy.diamondshop.controller.user;

import com.congquy.diamondshop.service.ICategoryService;
import com.congquy.diamondshop.service.IMenuService;
import com.congquy.diamondshop.service.IProductService;
import com.congquy.diamondshop.service.ISlidesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller(value = "productControllerOfUser")
public class ProductController {

    @Autowired
    private ISlidesService slidesService;

    @Autowired
    private ICategoryService categoryService;

    @Autowired
    private IMenuService menuService;

    @Autowired
    private IProductService productService;

    @RequestMapping(value = {"/trang-chu"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("user/home-page");

        mav.addObject("slides", slidesService.getListSlides());
        mav.addObject("categories", categoryService.getCategories());
        mav.addObject("menus", menuService.getListMenu());
        mav.addObject("products", productService.getAllProduct());
        return mav;
    }

    @RequestMapping(value = {"/san-pham/danh-sach-grid"}, method = RequestMethod.GET)
    public ModelAndView gridProductPage() {
        ModelAndView mav = new ModelAndView("user/grid-view");
        mav.addObject("categories", categoryService.getCategories());
        mav.addObject("menus", menuService.getListMenu());
        return mav;
    }

    @RequestMapping(value = {"/san-pham/danh-sach-list"}, method = RequestMethod.GET)
    public ModelAndView listProductPage() {
        ModelAndView mav = new ModelAndView("user/list-view");
        mav.addObject("categories", categoryService.getCategories());
        mav.addObject("menus", menuService.getListMenu());
        return mav;
    }

    @RequestMapping(value = {"/san-pham/danh-sach-4-col"}, method = RequestMethod.GET)
    public ModelAndView fourColProductPage() {
        ModelAndView mav = new ModelAndView("user/four-columns-view");
        mav.addObject("menus", menuService.getListMenu());
        return mav;
    }

    @RequestMapping(value = {"/san-pham/chi-tiet-san-pham"}, method = RequestMethod.GET)
    public ModelAndView productDetailPage() {
        ModelAndView mav = new ModelAndView("user/product-detail");
        mav.addObject("categories", categoryService.getCategories());
        mav.addObject("menus", menuService.getListMenu());
        return mav;
    }
}
