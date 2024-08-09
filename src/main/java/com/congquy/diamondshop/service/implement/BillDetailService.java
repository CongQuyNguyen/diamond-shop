package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.converter.BillDetailConverter;
import com.congquy.diamondshop.dto.BillDetailDTO;
import com.congquy.diamondshop.dto.CartDTO;
import com.congquy.diamondshop.repository.BillDetailRepository;
import com.congquy.diamondshop.repository.BillRepository;
import com.congquy.diamondshop.service.IBillDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class BillDetailService implements IBillDetailService {

    @Autowired
    private BillDetailRepository billDetailRepository;

    @Autowired
    private BillRepository billRepository;

    @Autowired
    private BillDetailConverter billDetailConverter;

    @Override
    public void addBillDetail(HashMap<Long, CartDTO> cart) {

        Object[] temp = billRepository.getLastBill();

        if (temp != null) {

            // BillID nằm ở vị trí đầu tiên trong Object[]
            Long billId = ((BigInteger) temp[0]).longValue();

            // Lấy được bill rồi thì bắt đầu thêm từng bill detail
            for(Map.Entry<Long, CartDTO> itemCart : cart.entrySet()) {
                // Sẽ tạo mới đối tượng bill detail và thêm vào theo dữ liệu đã lấy được
                BillDetailDTO billDetail = new BillDetailDTO();
                billDetail.setBillId(billId); // Sử dụng billId lấy từ Object[]
                billDetail.setProductId(itemCart.getValue().getProductDetail().getId());
                billDetail.setQuantity(itemCart.getValue().getQuantity());
                billDetail.setTotalFee(itemCart.getValue().getTotalPrice());

                billDetailRepository.save(billDetailConverter.toEntity(billDetail));
            }
        } else {
            // Xử lý trường hợp không tìm thấy Bill nào trong temp
            throw new IllegalStateException("No bill found to add details to.");
        }
    }
}
