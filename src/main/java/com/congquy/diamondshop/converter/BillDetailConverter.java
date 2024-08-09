package com.congquy.diamondshop.converter;

import com.congquy.diamondshop.dto.BillDetailDTO;
import com.congquy.diamondshop.entity.BillDetailEntity;
import com.congquy.diamondshop.entity.BillEntity;
import com.congquy.diamondshop.entity.ProductEntity;
import com.congquy.diamondshop.repository.BillRepository;
import com.congquy.diamondshop.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BillDetailConverter {

    @Autowired
    private BillRepository billRepository;

    @Autowired
    private ProductRepository productRepository;

    public BillDetailDTO toDTO(BillDetailEntity entity) {
        BillDetailDTO billDetailDTO = new BillDetailDTO();
        billDetailDTO.setBillId(entity.getBill().getId());
        billDetailDTO.setProductId(entity.getProduct().getId());
        billDetailDTO.setQuantity(entity.getQuantity());
        billDetailDTO.setTotalFee(entity.getTotalFee());
        return billDetailDTO;
    }

    public BillDetailEntity toEntity(BillDetailDTO dto) {
        BillDetailEntity billDetailEntity = new BillDetailEntity();

        // Thiết lập các thuộc tính cơ bản
        billDetailEntity.setTotalFee(dto.getTotalFee());
        billDetailEntity.setQuantity(dto.getQuantity());

        // Thiết lập liên kết với BillEntity
        if (dto.getBillId() != null) {
            BillEntity bill = billRepository.findOne(dto.getBillId());
            billDetailEntity.setBill(bill);
        }

        // Thiết lập liên kết với ProductEntity
        if (dto.getProductId() != null) {
            ProductEntity product = productRepository.findOne(dto.getProductId());
            billDetailEntity.setProduct(product);
        }

        return billDetailEntity;
    }
}
