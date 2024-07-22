package com.congquy.diamondshop.converter;

import com.congquy.diamondshop.dto.ColorsDTO;
import com.congquy.diamondshop.dto.ProductDTO;
import com.congquy.diamondshop.entity.ProductEntity;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class ProductConverter {

    public ProductDTO toDTO(ProductEntity product) {
        ProductDTO productDTO = new ProductDTO();

        if (product.getCategory() != null) {
            productDTO.setCategoryId(product.getCategory().getId());
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

            if(obj[11] != null && obj[12] != null && obj[13] != null) {
                productDTO.setColors(new ColorsDTO((((BigInteger) obj[11]).longValue()),
                        (String) obj[12], (String) obj[13]));
            }

            productDTOList.add(productDTO);
        }

        return productDTOList;
    }

}
