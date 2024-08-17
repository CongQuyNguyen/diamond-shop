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
import javax.servlet.http.HttpSession;

@Controller(value = "accountControllerOfUser")
public class AccountController extends BaseController {

    @Autowired
    private UserService userService;


    @RequestMapping(value = {"/dang-nhap", "/dang-ky"}, method = RequestMethod.GET)
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

    @RequestMapping(value = "/dang-ky/xac-thuc", method = RequestMethod.POST)
    public ModelAndView sendVerificationCode(@RequestParam("email") String email, HttpSession session) {
        _mavShare.setViewName("login/login");
        try {
            String code = userService.generateAndSendVerificationCode(email);
            session.setAttribute("email", email); // Lưu email vào session
            _mavShare.addObject("success", "Mã xác minh đã được gửi.");
        } catch (Exception e) {
            _mavShare.addObject("error", e.getMessage());
        }
        return _mavShare;
    }

    @RequestMapping(value = {"/dang-ky"}, method = RequestMethod.POST)
    public ModelAndView registerPage(@RequestParam("email") String email,
                               @RequestParam("fullName") String fullName,
                               @RequestParam("password") String password,
                               @RequestParam("address") String address,
                               @RequestParam("code") String code,
                               HttpSession session) {
        _mavShare.setViewName("login/login");
        email = session.getAttribute("email").toString();
        if (userService.verifyUser(email, code)) {
            userService.addUser(email, fullName, password, address);
            _mavShare.setViewName("redirect:/dang-nhap");
        } else {
            _mavShare.addObject("error", "Mã xác minh hoặc email không hợp lệ.");
        }
        return _mavShare;
    }
}
