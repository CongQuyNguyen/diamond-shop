package com.congquy.diamondshop.controller.user;

import com.congquy.diamondshop.constant.SystemConstant;
import com.congquy.diamondshop.dto.PaginateDTO;
import com.congquy.diamondshop.service.IPaginateService;
import com.congquy.diamondshop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "categoryControllerOfUser")
public class CategoryController extends BaseController {

    @Autowired
    private IProductService productService;

    @Autowired
    private IPaginateService paginateService;


    @RequestMapping(value = {"/san-pham/danh-sach-grid/{id}/{currentPage}"}, method = RequestMethod.GET)
    public ModelAndView gridProductPage(@PathVariable String id, @PathVariable String currentPage) {
        _mavShare.setViewName("user/product-category");

        // Lấy sản phẩm theo từng pagination
        int totalData = productService.getProductByCategory(Long.parseLong(id)).size();
        PaginateDTO paginateDTO = paginateService.getInfoPaginate(totalData,
                SystemConstant.LIMIT_ITEM_IN_PAGE, Integer.parseInt(currentPage));
        _mavShare.addObject("idPaginate", id);
        _mavShare.addObject("paginateDTO", paginateDTO);
        _mavShare.addObject("productsPagination", productService.getProductByPagination(paginateDTO.getStart() - 1, SystemConstant.LIMIT_ITEM_IN_PAGE, Long.parseLong(id)));
        return _mavShare;
    }
}
