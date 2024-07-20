package com.congquy.diamondshop.converter;

import com.congquy.diamondshop.dto.MenuDTO;
import com.congquy.diamondshop.entity.MenuEntity;
import org.springframework.stereotype.Component;

@Component
public class MenuConverter {
    public MenuDTO toDTO(MenuEntity menu) {
        MenuDTO menuDTO = new MenuDTO();
        menuDTO.setId(menu.getId());
        menuDTO.setName(menu.getName());
        menuDTO.setCode(menu.getCode());
        menuDTO.setUrl(menu.getUrl());
        menuDTO.setCreatedBy(menu.getCreatedBy());
        menuDTO.setCreatedDate(menu.getCreatedDate());
        menuDTO.setModifiedBy(menu.getModifiedBy());
        menuDTO.setModifiedDate(menu.getModifiedDate());
        return menuDTO;
    }

    public MenuEntity toEntity(MenuDTO menu) {
        MenuEntity menuEntity = new MenuEntity();
        menuEntity.setId(menu.getId());
        menuEntity.setName(menu.getName());
        menuEntity.setCode(menu.getCode());
        menuEntity.setUrl(menu.getUrl());
        return menuEntity;
    }
}
