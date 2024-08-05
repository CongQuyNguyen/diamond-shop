package com.congquy.diamondshop.controller.user;

import com.congquy.diamondshop.service.implement.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@Controller(value = "accountControllerOfUser")
public class AccountController extends BaseController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = {"/dang-nhap"}, method = RequestMethod.GET)
    public ModelAndView loginPage() {
        _mavShare.setViewName("login/login");
        return _mavShare;
    }

    @RequestMapping(value = "/dang-xuat", method = RequestMethod.GET)
    public ModelAndView logout(HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null) {
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        _mavShare.setViewName("redirect:/trang-chu");
        return _mavShare;
    }

    @RequestMapping(value = "/accessDenied", method = RequestMethod.GET)
    public ModelAndView accessDenied() {
        _mavShare.setViewName("redirect:/dang-nhap?accessDenied");
        return _mavShare;
    }

    @RequestMapping(value = {"/dang-ky"}, method = RequestMethod.POST)
    public String registerPage(@RequestParam("email") String email,
                                     @RequestParam("fullName") String fullName,
                                     @RequestParam("password") String password,
                                     @RequestParam("address") String address,
                                     Model model) {
        try {
            userService.addUser(email, fullName, password, address);
            return "redirect:/dang-nhap?success";
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
            return "redirect:/dang-nhap?error";
        }
    }

    @RequestMapping(value = {"/dang-nhap/quen-mat-khau"}, method = RequestMethod.GET)
    public ModelAndView forgotPassPage() {
        ModelAndView mav = new ModelAndView("login/forgot-password");
        return mav;
    }
}
