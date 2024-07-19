package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.converter.SlidesConverter;
import com.congquy.diamondshop.dto.SlidesDTO;
import com.congquy.diamondshop.entity.SlidesEntity;
import com.congquy.diamondshop.repository.SlidesRepository;
import com.congquy.diamondshop.service.ISlidesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SlidesService implements ISlidesService {

    @Autowired
    private SlidesRepository slidesRepository;

    @Autowired
    private SlidesConverter slidesConverter;

    @Override
    public List<SlidesDTO> getListSlides() {
        List<SlidesEntity> resultEntity = slidesRepository.findAll();
        List<SlidesDTO> resultDTO = new ArrayList<>();
        for(SlidesEntity item : resultEntity) {
            resultDTO.add(slidesConverter.toDTO(item));
        }
        return resultDTO;
    }
}
