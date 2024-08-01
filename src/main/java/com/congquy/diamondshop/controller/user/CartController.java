package com.congquy.diamondshop.controller.user;

import com.congquy.diamondshop.dto.CartDTO;
import com.congquy.diamondshop.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller(value = "cartItemControllerOfUser")
public class CartController extends BaseController {

    @Autowired
    private ICartService cartService;

    @RequestMapping(value = {"/trang-chu/gio-hang"})
    public ModelAndView cartList() {
        _mavShare.setViewName("user/cart-product");
        return _mavShare;
    }

    @RequestMapping(value = {"/them-gio-hang/{id}"})
    public String addCart(HttpServletRequest request, HttpSession session, @PathVariable Long id) {

        // Lấy ra trong phiên hiện tại để thao tác
        HashMap<Long, CartDTO> cart = (HashMap<Long, CartDTO>)  session.getAttribute("cart");
        if(cart == null) {
            cart = new HashMap<Long, CartDTO>();
        }
        cart = cartService.addCart(id, cart);

        // Sau khi đã thao tác xong thì trả lại cho session một cart mới, đồng thời gán luôn
        // tổng sản phẩm và tổng tiền đã tính được bên phía service
        session.setAttribute("cart", cart);
        session.setAttribute("totalPrice", cartService.getPriceOfCart(cart));
        session.setAttribute("totalQuantity", cartService.getQuantityOfCart(cart));

        String referer = request.getHeader("referer");
        return "redirect:" + referer;
    }

    @RequestMapping(value = {"/sua-gio-hang/{id}/{quantity}"})
    public String editCart(HttpServletRequest request, HttpSession session, @PathVariable Long id, @PathVariable int quantity) {
        HashMap<Long, CartDTO> cart = (HashMap<Long, CartDTO>)  session.getAttribute("cart");
        if(cart == null) {
            cart = new HashMap<Long, CartDTO>();
        }
        cart = cartService.editCart(id, quantity, cart);

        session.setAttribute("cart", cart);
        session.setAttribute("totalPrice", cartService.getPriceOfCart(cart));
        session.setAttribute("totalQuantity", cartService.getQuantityOfCart(cart));

        String referer = request.getHeader("referer");
        return "redirect:" + referer;
    }

    @RequestMapping(value = {"/xoa-gio-hang/{id}"})
    public String removeCart(HttpServletRequest request, HttpSession session, @PathVariable Long id) {
        HashMap<Long, CartDTO> cart = (HashMap<Long, CartDTO>)  session.getAttribute("cart");
        if(cart == null) {
            cart = new HashMap<Long, CartDTO>();
        }
        cart = cartService.deleteCart(id, cart);

        session.setAttribute("cart", cart);
        session.setAttribute("totalPrice", cartService.getPriceOfCart(cart));
        session.setAttribute("totalQuantity", cartService.getQuantityOfCart(cart));

        String referer = request.getHeader("referer");
        return "redirect:" + referer;
    }
}
