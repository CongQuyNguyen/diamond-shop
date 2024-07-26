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

import javax.annotation.PostConstruct;

@Controller(value = "baseControllerOfUser")
public class BaseController {

    @Autowired
    public ISlidesService _slidesService;

    @Autowired
    public IMenuService _menuService;

    @Autowired
    public ICategoryService _categoryService;

    public ModelAndView _mavShare = new ModelAndView();


    @PostConstruct
    public ModelAndView init() {
        _mavShare.addObject("slides", _slidesService.getListSlides());
        _mavShare.addObject("menus", _menuService.getListMenu());
        _mavShare.addObject("categories", _categoryService.getCategories());
        return _mavShare;
    }
}
