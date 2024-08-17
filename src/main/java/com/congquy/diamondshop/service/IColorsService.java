package com.congquy.diamondshop.service;

import com.congquy.diamondshop.dto.ColorsDTO;
import com.congquy.diamondshop.entity.ColorsEntity;

import java.util.List;

public interface IColorsService {
    ColorsEntity insertColors(ColorsDTO color);

    List<ColorsEntity> getColorsStillInsert(int count);
}
