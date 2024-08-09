package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.converter.BillConverter;
import com.congquy.diamondshop.dto.BillDTO;
import com.congquy.diamondshop.repository.BillRepository;
import com.congquy.diamondshop.service.IBillService;
import com.congquy.diamondshop.utils.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BillService implements IBillService {

    @Autowired
    private BillRepository billRepository;

    @Autowired
    private BillConverter billConverter;

    @Override
    public long addBill(BillDTO bill) {
        // Lấy ra id của user đang đăng nhập trong hệ thống từ SpringSecurityContext
        bill.setUserId(SecurityUtils.getPrincipal().getId());

        return billRepository.save(billConverter.toEntity(bill)).getId();
    }
}
