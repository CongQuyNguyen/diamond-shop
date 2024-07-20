package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.converter.CategoryConverter;
import com.congquy.diamondshop.dto.CategoryDTO;
import com.congquy.diamondshop.entity.CategoryEntity;
import com.congquy.diamondshop.repository.CategoryRepository;
import com.congquy.diamondshop.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoryService implements ICategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CategoryConverter categoryConverter;


    @Override
    public List<CategoryDTO> getCategories() {
        List<CategoryEntity> categories = categoryRepository.findAll();
        List<CategoryDTO> categoryDTOList = new ArrayList<>();
        for(CategoryEntity item : categories) {
            categoryDTOList.add(categoryConverter.toDTO(item));
        }
        return categoryDTOList;
    }
}
