package com.congquy.diamondshop.converter;

import com.congquy.diamondshop.dto.ColorsDTO;
import com.congquy.diamondshop.entity.ColorsEntity;
import org.springframework.stereotype.Component;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
public class ColorsConverter {
    public ColorsDTO toDTO(ColorsEntity entity) {
         ColorsDTO colorsDTO = new ColorsDTO();
         colorsDTO.setId(entity.getId());
         colorsDTO.setCode(entity.getCode());
         colorsDTO.setName(entity.getName());
         colorsDTO.setImage(entity.getImage());
         colorsDTO.setCreatedBy(entity.getCreatedBy());
         colorsDTO.setCreatedDate(entity.getCreatedDate());
         colorsDTO.setModifiedDate(entity.getModifiedDate());
         colorsDTO.setModifiedBy(entity.getModifiedBy());
         return colorsDTO;
    }

    public ColorsEntity toEntity(ColorsDTO colorsDTO) {
        ColorsEntity colorsEntity = new ColorsEntity();
        colorsEntity.setId(colorsDTO.getId());
        colorsEntity.setCode(colorsDTO.getCode());
        colorsEntity.setName(colorsDTO.getName());
        colorsEntity.setImage(colorsDTO.getImage());
        return colorsEntity;
    }


    public List<ColorsDTO> toDTO(List<ColorsEntity> entities) {
        List<ColorsDTO> colorsDTOS = new ArrayList<>();
        for(ColorsEntity entity : entities) {
            colorsDTOS.add(toDTO(entity));
        }
        return colorsDTOS;
    }

    public List<ColorsEntity> toEntity(List<ColorsDTO> colors) {
        List<ColorsEntity> colorsEntities = new ArrayList<>();
        for (ColorsDTO colorDTO : colors) {
            colorsEntities.add(toEntity(colorDTO));
        }
        return colorsEntities;
    }

    public List<ColorsEntity> toEntityFromObj(List<Object[]> colors) {
        List<ColorsEntity> colorsEntities = new ArrayList<>();
        for (Object[] colorData : colors) {
            ColorsEntity colorsEntity = new ColorsEntity();

            if (colorData.length >= 7) {
                colorsEntity.setId(((BigInteger) colorData[0]).longValue());
                colorsEntity.setCreatedBy((String) colorData[1]);
                colorsEntity.setCreatedDate((Date) colorData[2]);
                colorsEntity.setModifiedBy((String) colorData[3]);
                colorsEntity.setModifiedDate((Date) colorData[4]);
                colorsEntity.setName((String) colorData[7]);
                colorsEntity.setCode((String) colorData[5]);
                colorsEntity.setImage((String) colorData[6]);
            }

            colorsEntities.add(colorsEntity);
        }
        return colorsEntities;
    }


}
