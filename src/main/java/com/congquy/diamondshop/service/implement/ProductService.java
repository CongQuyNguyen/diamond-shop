package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.converter.ProductConverter;
import com.congquy.diamondshop.dto.ProductDTO;
import com.congquy.diamondshop.entity.ProductEntity;
import com.congquy.diamondshop.repository.ProductRepository;
import com.congquy.diamondshop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService implements IProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductConverter productConverter;

    @Override
    public List<ProductDTO> getProductByNewProduct(int newProduct) {
        List<Object[]> objs = productRepository.getProductByNew(newProduct);
        List<ProductDTO> result = productConverter.toDTO(objs);
        return result;
    }

    @Override
    public List<ProductDTO> getProductByHighlightProduct(int highlight) {
        List<Object[]> objs = productRepository.getProductByHighlight(highlight);
        List<ProductDTO> result = productConverter.toDTO(objs);
        return result;
    }
}
