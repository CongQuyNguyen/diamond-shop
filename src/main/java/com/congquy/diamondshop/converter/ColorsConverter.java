package com.congquy.diamondshop.converter;

import com.congquy.diamondshop.dto.ColorsDTO;
import com.congquy.diamondshop.entity.ColorsEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ColorsConverter {
    public ColorsDTO toDTO(ColorsEntity entity) {
         ColorsDTO colorsDTO = new ColorsDTO();
         colorsDTO.setCode(entity.getCode());
         colorsDTO.setName(entity.getName());
         colorsDTO.setImage(entity.getImage());
         return colorsDTO;
    }

    public List<ColorsDTO> toDTO(List<ColorsEntity> entities) {
        List<ColorsDTO> colorsDTOS = new ArrayList<>();
        for(ColorsEntity entity : entities) {
            colorsDTOS.add(toDTO(entity));
        }
        return colorsDTOS;
    }
}
