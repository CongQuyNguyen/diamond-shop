package com.congquy.diamondshop.converter;

import com.congquy.diamondshop.dto.ColorsDTO;
import com.congquy.diamondshop.dto.ProductDTO;
import com.congquy.diamondshop.entity.CategoryEntity;
import com.congquy.diamondshop.entity.ColorsEntity;
import com.congquy.diamondshop.entity.ProductEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductConverter {

    @Autowired
    private ColorsConverter colorsConverter;

    public ProductDTO toDTO(ProductEntity product) {
        ProductDTO productDTO = new ProductDTO();

        if(product.getCategory() != null) {
            productDTO.setCategoryId(product.getCategory().getId());
        }

        // Sẽ lấy ra được 1 list colors entity do 1 sản có nhiều màu
        if(product.getColors() != null) {
            productDTO.setColors(colorsConverter.toDTO(product.getColors()));
        }

        productDTO.setName(product.getName());
        productDTO.setPrice(product.getPrice());
        productDTO.setSize(product.getSize());
        productDTO.setHighlight(product.getHighlight());
        productDTO.setNewProduct(product.getNewProduct());
        productDTO.setSale(product.getSale());
        productDTO.setQuantity(product.getQuantity());
        productDTO.setDescription(product.getDescription());
        productDTO.setContent(product.getContent());

        productDTO.setId(product.getId());
        productDTO.setCreatedBy(product.getCreatedBy());
        productDTO.setCreatedDate(product.getCreatedDate());
        productDTO.setModifiedBy(product.getModifiedBy());
        productDTO.setModifiedDate(product.getModifiedDate());

        return productDTO;
    }

    public List<ProductDTO> toDTO(List<Object[]> results) {
        List<ProductDTO> productDTOList = new ArrayList<>();

        for (Object[] obj : results) {
            ProductDTO productDTO = new ProductDTO();

            productDTO.setId(((BigInteger) obj[0]).longValue());
            productDTO.setCategoryId(((BigInteger) obj[1]).longValue());
            productDTO.setSize((String) obj[2]);
            productDTO.setQuantity((Integer) obj[3]);
            productDTO.setSale((Integer) obj[4]);
            productDTO.setPrice((Double) obj[5]);
            productDTO.setNewProduct((Integer) obj[6]);
            productDTO.setName((String) obj[7]);
            productDTO.setHighlight((Integer) obj[8]);
            productDTO.setDescription((String) obj[9]);
            productDTO.setContent((String) obj[10]);

            if(obj[11] != null && obj[12] != null && obj[13] != null && obj[14] != null) {
                List<ColorsDTO> colors = new ArrayList<>();
                colors.add(new ColorsDTO((((BigInteger) obj[11]).longValue()),
                        (String) obj[12], (String) obj[13], (String) obj[14]));
                productDTO.setColors(colors);
            }

            productDTOList.add(productDTO);
        }

        return productDTOList;
    }

    public ProductEntity toEntity(ProductDTO productDTO) {
        ProductEntity productEntity = new ProductEntity();

        // Set category if it exists
        if (productDTO.getCategoryId() != null) {
            CategoryEntity category = new CategoryEntity();
            category.setId(productDTO.getCategoryId());
            productEntity.setCategory(category);
        }

        // Set colors if they exist
        if (productDTO.getColors() != null) {
            productEntity.setColors(colorsConverter.toEntity(productDTO.getColors()));
        }

        productEntity.setName(productDTO.getName());
        productEntity.setPrice(productDTO.getPrice());
        productEntity.setSize(productDTO.getSize());
        productEntity.setHighlight(productDTO.getHighlight());
        productEntity.setNewProduct(productDTO.getNewProduct());
        productEntity.setSale(productDTO.getSale());
        productEntity.setQuantity(productDTO.getQuantity());
        productEntity.setDescription(productDTO.getDescription());
        productEntity.setContent(productDTO.getContent());

        productEntity.setId(productDTO.getId());
        productEntity.setCreatedBy(productDTO.getCreatedBy());
        productEntity.setCreatedDate(productDTO.getCreatedDate());
        return productEntity;
    }

}
