package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.converter.ProductConverter;
import com.congquy.diamondshop.dto.ColorsDTO;
import com.congquy.diamondshop.dto.ProductDTO;
import com.congquy.diamondshop.entity.ColorsEntity;
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

    @Autowired
    private ColorsService colorsService;

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

    @Override
    public ProductDTO saveProduct(ProductDTO product) {
        int count = 0;

        // Lưu màu sắc trước
        for(ColorsDTO colorsDTO : product.getColors()) {
            colorsService.insertColors(colorsDTO);
            count++;
        }

        // Sau khi lưu xong thì màu sắc sẽ có id. Phải lấy về đúng cái số lượng vừa lưu để gắn trả
        // lại cho product (có id của colors)
        ProductEntity newProduct = productConverter.toEntity(product);
        newProduct.setColors(colorsService.getColorsStillInsert(count)); // Liên kết lại với ProductEntity


        // Lưu sản phẩm sau khi đã liên kết với màu sắc
        ProductEntity productEntity = productRepository.save(newProduct);
        return productConverter.toDTO(productEntity);
    }

    @Override
    public ProductDTO updateProduct(ProductDTO newProduct) {

        // Phải tìm ra product đem đi sửa
        ProductEntity existingProduct = productRepository.findOne(newProduct.getId());
        if(existingProduct == null) {
            return null;
        }

        // Tiến hành xóa bỏ liên kết với colors để nhằm mục đích tránh bị xung đột dữ liệu
        existingProduct.getColors().clear();

        // Gắn lại colors vừa xóa để đồng bộ với db (bảng product_colors sẽ mất id của sản phẩm này)
        productRepository.save(existingProduct);

        // Lưu mới colors (colors của newProduct sẽ được lưu vào bảng colors)
        for (ColorsDTO colorsDTO : newProduct.getColors()) {
            colorsService.insertColors(colorsDTO);
        }

        // Tiến hành cập nhật thông tin
        ProductEntity updateProduct = productConverter.toEntity(newProduct);
        updateProduct.setColors(colorsService.getColorsStillInsert(newProduct.getColors().size()));
        updateProduct.setCreatedBy(existingProduct.getCreatedBy());
        updateProduct.setCreatedDate(existingProduct.getCreatedDate());

        // Lưu sản phẩm vừa cập nhật vào db
        ProductEntity productUpdated = productRepository.save(updateProduct);
        return productConverter.toDTO(productUpdated);
    }

    @Override
    public void deleteProduct(Long id) {
        ProductEntity existingProduct = productRepository.findOne(id);
        if(existingProduct == null) {
            return;
        }

        existingProduct.getColors().clear();
        productRepository.save(existingProduct);

        productRepository.delete(existingProduct);
    }
}
