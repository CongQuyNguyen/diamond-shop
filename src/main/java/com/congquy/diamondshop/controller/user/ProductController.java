package com.congquy.diamondshop.controller.user;

import com.congquy.diamondshop.dto.ColorsDTO;
import com.congquy.diamondshop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "productControllerOfUser")
public class ProductController extends BaseController {

    // Nhận vào id của sản phẩm để load ra sản phẩm đó
    @Autowired
    private IProductService productService;

    @RequestMapping(value = {"/san-pham/chi-tiet-san-pham-{id}"}, method = RequestMethod.GET)
    public ModelAndView productDetailPage(@PathVariable Long id) {
        _mavShare.setViewName("user/product-detail");
        _mavShare.addObject("productDetail", productService.getProductById(id));

        // Lấy ra danh sách các sản phẩm cùng loại bằng cách dựa vào id category có sẵn của thằng vua lấy
        Long idCategory = productService.getProductById(id).getCategoryId();
        _mavShare.addObject("productByCategory", productService.getProductByCategory(idCategory));
        return _mavShare;
    }

    @RequestMapping(value = {"/danh-sach-san-pham"}, method = RequestMethod.GET)
    public ModelAndView listProductPage() {
        _mavShare.setViewName("user/list-produdct");
        _mavShare.addObject("listProduct", productService.getAllProduct());
        return _mavShare;
    }
}
