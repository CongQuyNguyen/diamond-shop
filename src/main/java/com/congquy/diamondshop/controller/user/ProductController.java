package com.congquy.diamondshop.controller.user;

import com.congquy.diamondshop.dto.SlidesDTO;
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

    @RequestMapping(value = {"/trang-chu", "/"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView mav = new ModelAndView("user/home-page");

        // Lấy lên các slide để chạy tự động
        mav.addObject("slides", slidesService.getListSlides());

        return mav;
    }

    @RequestMapping(value = {"/san-pham/danh-sach-grid"}, method = RequestMethod.GET)
    public ModelAndView gridProductPage() {
        ModelAndView mav = new ModelAndView("user/grid-view");
        return mav;
    }

    @RequestMapping(value = {"/san-pham/danh-sach-list"}, method = RequestMethod.GET)
    public ModelAndView listProductPage() {
        ModelAndView mav = new ModelAndView("/user/list-view");
        return mav;
    }

    @RequestMapping(value = {"/san-pham/danh-sach-4-col"}, method = RequestMethod.GET)
    public ModelAndView fourColProductPage() {
        ModelAndView mav = new ModelAndView("/user/list-view");
        return mav;
    }
}
