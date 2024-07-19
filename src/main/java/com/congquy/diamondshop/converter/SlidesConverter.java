package com.congquy.diamondshop.converter;

import com.congquy.diamondshop.dto.SlidesDTO;
import com.congquy.diamondshop.entity.SlidesEntity;
import org.springframework.stereotype.Component;

@Component
public class SlidesConverter {

    public SlidesDTO toDTO(SlidesEntity slides) {
        SlidesDTO slidesDTO = new SlidesDTO();
        slidesDTO.setId(slides.getId());
        slidesDTO.setDescription(slides.getDescription());
        slidesDTO.setImage(slides.getImage());
        slidesDTO.setTitle(slides.getTitle());
        return slidesDTO;
    }

    public SlidesEntity toEntity(SlidesDTO slides) {
        SlidesEntity slidesEntity = new SlidesEntity();
        slidesEntity.setId(slides.getId());
        slidesEntity.setDescription(slides.getDescription());
        slidesEntity.setImage(slides.getImage());
        slidesEntity.setTitle(slides.getTitle());
        return slidesEntity;
    }
}
