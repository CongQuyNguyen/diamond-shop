package com.congquy.diamondshop.service;

import com.congquy.diamondshop.dto.ProductDTO;

import java.util.List;

public interface IProductService {
    List<ProductDTO> getProductByNewProduct(int newProduct);

    List<ProductDTO> getProductByHighlightProduct(int highlight);

    List<ProductDTO> getProductByCategory(Long id);
}
