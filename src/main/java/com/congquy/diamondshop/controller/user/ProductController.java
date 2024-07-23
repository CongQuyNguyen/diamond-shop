package com.congquy.diamondshop.controller.user;

import com.congquy.diamondshop.constant.SystemConstant;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller(value = "productControllerOfUser")
public class ProductController extends BaseController {

    @RequestMapping(value = {"/trang-chu"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = init();
        mav.setViewName("user/home-page");
        mav.addObject("productsNew", _productService.getProductByNewProduct(SystemConstant.NEW_PRODUCT));
        mav.addObject("productsHighlight", _productService.getProductByHighlightProduct(SystemConstant.HIGHLIGHT_PRODUCT));
        return mav;
    }

    @RequestMapping(value = {"/san-pham/danh-sach-grid/{id}"}, method = RequestMethod.GET)
    public ModelAndView gridProductPage(@PathVariable String id) {
        ModelAndView mav = init();
        mav.setViewName("user/product-category");

        // Lấy ra tất cả các sản phẩm theo id
        mav.addObject("productsCategory", _productService.getProductByCategory(Long.parseLong(id)));

        return mav;
    }

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
