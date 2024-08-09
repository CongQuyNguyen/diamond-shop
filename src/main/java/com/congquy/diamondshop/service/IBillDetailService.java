package com.congquy.diamondshop.service;

import com.congquy.diamondshop.dto.CartDTO;

import java.util.HashMap;

public interface IBillDetailService {
    void addBillDetail(HashMap<Long, CartDTO> cart);
}
