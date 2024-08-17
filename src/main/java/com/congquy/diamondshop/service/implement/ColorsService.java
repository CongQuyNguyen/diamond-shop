package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.converter.ColorsConverter;
import com.congquy.diamondshop.dto.ColorsDTO;
import com.congquy.diamondshop.entity.ColorsEntity;
import com.congquy.diamondshop.repository.ColorsRepository;
import com.congquy.diamondshop.service.IColorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ColorsService implements IColorsService {

    @Autowired
    private ColorsRepository colorsRepository;

    @Autowired
    private ColorsConverter colorsConverter;

    public ColorsEntity insertColors(ColorsDTO colorsDTO) {
        ColorsEntity colorsEntity = colorsConverter.toEntity(colorsDTO);
        return colorsRepository.save(colorsEntity);
    }

    @Override
    public List<ColorsEntity> getColorsStillInsert(int count) {
        List<Object[]> result = colorsRepository.getColorsStillInsert(count);
        return colorsConverter.toEntityFromObj(result);
    }

}
