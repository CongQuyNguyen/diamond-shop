package com.congquy.diamondshop.converter;

import com.congquy.diamondshop.dto.ProductDTO;
import com.congquy.diamondshop.entity.ProductEntity;
import org.springframework.stereotype.Component;

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

            productDTO.setCategoryId(((Long) obj[1])); // categoryId
            productDTO.setName((String) obj[7]); // name
            productDTO.setPrice((Double) obj[5]); // price
            productDTO.setSize((String) obj[2]); // size
            productDTO.setHighlight((Integer) obj[8]); // highlight
            productDTO.setNewProduct((Integer) obj[6]); // newProduct
            productDTO.setSale((Integer) obj[4]); // sale
            productDTO.setQuantity((Integer) obj[3]); // quantity
            productDTO.setDescription((String) obj[9]); // description

            productDTO.setId((Long) obj[0]);
            productDTO.setCreatedBy((String) obj[10]);
            productDTO.setCreatedDate((Date) obj[11]);
            productDTO.setModifiedBy((String) obj[12]);
            productDTO.setModifiedDate((Date) obj[13]);

            productDTOList.add(productDTO);
        }

        return productDTOList;
    }

}
