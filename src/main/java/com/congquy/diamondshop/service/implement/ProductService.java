package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.converter.ProductConverter;
import com.congquy.diamondshop.dto.ProductDTO;
import com.congquy.diamondshop.entity.ProductEntity;
import com.congquy.diamondshop.repository.ProductRepository;
import com.congquy.diamondshop.service.IProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
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
        List<Object[]> objs = productRepository.findAllByNew(newProduct);
        List<ProductDTO> result = productConverter.toDTO(objs);
        return result;
    }

    @Override
    public List<ProductDTO> getProductByHighlightProduct(int highlight) {
        List<Object[]> objs = productRepository.findAllByHighlight(highlight);
        List<ProductDTO> result = productConverter.toDTO(objs);
        return result;
    }

    @Override
    public List<ProductDTO> getProductByCategory(Long id) {
        List<Object[]> entities = productRepository.findAllByCategory(id);
        return productConverter.toDTO(entities);
    }

    @Override
    public List<ProductDTO> getProductByPagination(int start, int totalProductInPage, Long id) {
        List<Object[]> entities = productRepository.findAllByPagination(start, totalProductInPage, id);
        return productConverter.toDTO(entities);
    }

    @Override
    public ProductDTO getProductById(Long id) {
        return productConverter.toDTO(productRepository.findOne(id));
    }

    @Override
    public List<ProductDTO> getAllProduct() {
        List<ProductEntity> entities = productRepository.findAll();
        List<ProductDTO> result = new ArrayList<>();
        for(ProductEntity entity : entities) {
            result.add(productConverter.toDTO(entity));
        }
        return result;
    }

    @Override
    public Page<ProductDTO> getAllProductPaging(Pageable pageable) {
        Page<ProductEntity> pageEntity = productRepository.findAll(pageable);
        Page<ProductDTO> pageDTO = pageEntity.map(entity -> productConverter.toDTO(entity));
        return pageDTO;
    }
}
