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
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @RequestMapping(value = "/xac-thuc", method = RequestMethod.POST)
    public String sendVerificationCode(@RequestParam("email") String email, HttpSession session, Model model) {
        try {
            String code = userService.generateAndSendVerificationCode(email);
            session.setAttribute("email", email); // Lưu email vào session
            model.addAttribute("success", "Verify code is send for you.");
        } catch (Exception e) {
            model.addAttribute("error", e.getMessage());
        }
        return "redirect:/dang-ky";
    }

    @RequestMapping(value = {"/dang-ky"}, method = RequestMethod.POST)
    public String registerPage(@RequestParam("email") String email,
                               @RequestParam("fullName") String fullName,
                               @RequestParam("password") String password,
                               @RequestParam("address") String address,
                               @RequestParam("code") String code,
                               HttpSession session, Model model) {
        email = session.getAttribute("email").toString();
        if (userService.verifyUser(email, code)) {
            userService.addUser(email, fullName, password, address);
            return "redirect:/dang-nhap";
        } else {
            model.addAttribute("error", "Incorrect code.");
            return "redirect:/dang-ky";
        }
    }
}
