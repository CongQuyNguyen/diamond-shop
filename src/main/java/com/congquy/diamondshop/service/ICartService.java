package com.congquy.diamondshop.service;

import com.congquy.diamondshop.dto.CartDTO;

import java.util.HashMap;

public interface ICartService {
    HashMap<Long, CartDTO> addCart(Long id, HashMap<Long, CartDTO> cart);

    HashMap<Long, CartDTO> editCart(Long id, int quantity, HashMap<Long, CartDTO> cart);

    HashMap<Long, CartDTO> deleteCart(Long id, HashMap<Long, CartDTO> cart);

    public int getQuantityOfCart(HashMap<Long, CartDTO> cart);

    public double getPriceOfCart(HashMap<Long, CartDTO> cart);
}
