package com.congquy.diamondshop.service;

import com.congquy.diamondshop.dto.ProductDTO;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProductService {
    List<ProductDTO> getProductByNewProduct(int newProduct);

    List<ProductDTO> getProductByHighlightProduct(int highlight);

    List<ProductDTO> getProductByCategory(Long id);

    List<ProductDTO> getProductByPagination(int start, int totalPage, Long id);

    ProductDTO getProductById(Long id);

    List<ProductDTO> getAllProduct();

    Page<ProductDTO> getAllProductPaging(Pageable pageable);

    ProductDTO saveProduct(ProductDTO product);

    ProductDTO updateProduct(ProductDTO newProduct);

    void deleteProduct(Long id);
}
