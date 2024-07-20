package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.converter.MenuConverter;
import com.congquy.diamondshop.dto.MenuDTO;
import com.congquy.diamondshop.entity.MenuEntity;
import com.congquy.diamondshop.repository.MenuRepository;
import com.congquy.diamondshop.service.IMenuService;
import com.sun.org.glassfish.gmbal.InheritedAttribute;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MenuService implements IMenuService {

    @Autowired
    private MenuRepository menuRepository;

    @Autowired
    private MenuConverter menuConverter;

    @Override
    public List<MenuDTO> getListMenu() {
        List<MenuEntity> menus = menuRepository.findAll();
        List<MenuDTO> menuDTOList = new ArrayList<>();
        for(MenuEntity item : menus) {
            menuDTOList.add(menuConverter.toDTO(item));
        }
        return menuDTOList;
    }
}
