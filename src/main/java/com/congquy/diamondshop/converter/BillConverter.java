package com.congquy.diamondshop.converter;

import com.congquy.diamondshop.dto.BillDTO;
import com.congquy.diamondshop.entity.BillEntity;
import com.congquy.diamondshop.entity.UserEntity;
import com.congquy.diamondshop.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillConverter {

    @Autowired
    private UserRepository userRepository;


    public BillDTO toDTO(BillEntity entity) {
        BillDTO billDTO = new BillDTO();
        billDTO.setUserId(entity.getUser().getId());
        billDTO.setContact(entity.getContact());
        billDTO.setNote(entity.getNote());
        billDTO.setQuantity(entity.getQuantity());
        billDTO.setAddress(entity.getAddress());
        return billDTO;
    }

    public BillEntity toEntity(BillDTO dto) {
        BillEntity billEntity = new BillEntity();
        billEntity.setTotalFee(dto.getTotalFee());
        billEntity.setQuantity(dto.getQuantity());
        billEntity.setContact(dto.getContact());
        billEntity.setNote(dto.getNote());
        billEntity.setAddress(dto.getAddress());

        // Thiết lập liên kết với UserEntity
        if (dto.getUserId() != null) {
            UserEntity user = userRepository.findOne(dto.getUserId());
            billEntity.setUser(user);
        }

        return billEntity;
    }
}
