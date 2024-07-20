package com.congquy.diamondshop.converter;

import com.congquy.diamondshop.dto.CategoryDTO;
import com.congquy.diamondshop.entity.CategoryEntity;
import org.springframework.stereotype.Component;

@Component
public class CategoryConverter {
    public CategoryDTO toDTO(CategoryEntity category) {
        CategoryDTO categoryDTO = new CategoryDTO();
        categoryDTO.setCode(category.getCode());
        categoryDTO.setName(category.getName());
        categoryDTO.setId(category.getId());
        categoryDTO.setCreatedBy(category.getCreatedBy());
        categoryDTO.setCreatedDate(category.getCreatedDate());
        categoryDTO.setModifiedBy(category.getModifiedBy());
        categoryDTO.setCreatedDate(category.getCreatedDate());
        return categoryDTO;
    }

    public CategoryEntity toEntity(CategoryDTO category) {
        CategoryEntity categoryEntity = new CategoryEntity();
        categoryEntity.setCode(category.getCode());
        categoryEntity.setName(category.getName());
        categoryEntity.setId(category.getId());
        return categoryEntity;
    }
}
