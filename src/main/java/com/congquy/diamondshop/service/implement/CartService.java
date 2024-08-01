package com.congquy.diamondshop.service.implement;

import com.congquy.diamondshop.converter.ProductConverter;
import com.congquy.diamondshop.dto.CartDTO;
import com.congquy.diamondshop.dto.ProductDTO;
import com.congquy.diamondshop.repository.ProductRepository;
import com.congquy.diamondshop.service.ICartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class CartService implements ICartService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductConverter productConverter;

    @Override
    public HashMap<Long, CartDTO> addCart(Long id, HashMap<Long, CartDTO> cart) {
        CartDTO cartItem = new CartDTO();
        ProductDTO productDTO = productConverter.toDTO(productRepository.findOne(id));
        if(productDTO != null && cart.containsKey(id)) {
            cartItem = cart.get(id);
            cartItem.setQuantity(cartItem.getQuantity() + 1);
            cartItem.setTotalPrice(cartItem.getQuantity() * cartItem.getProductDetail().getPrice());
        } else {
            cartItem.setProductDetail(productDTO);
            cartItem.setQuantity(1);
            cartItem.setTotalPrice(productDTO.getPrice());
        }
        cart.put(id, cartItem);
        return cart;
    }

    @Override
    public HashMap<Long, CartDTO> editCart(Long id, int quantity, HashMap<Long, CartDTO> cart) {
        if(cart == null) {
            return cart;
        }
        ProductDTO productDTO = productConverter.toDTO(productRepository.findOne(id));
        CartDTO cartItem = new CartDTO();
        if(cart.containsKey(id)) {
            cartItem = cart.get(id);
            cartItem.setQuantity(quantity);
            cartItem.setTotalPrice(quantity * productDTO.getPrice());
        }
        return cart;
    }

    @Override
    public HashMap<Long, CartDTO> deleteCart(Long id, HashMap<Long, CartDTO> cart) {
        if(cart == null) {
            return cart;
        }

        if(cart.containsKey(id)) {
            cart.remove(id);
        }
        return cart;
    }

    // Lấy ra tổng số sản phẩm trong giỏ hàng và tổng giá đang sẵn có
    @Override
    public int getQuantityOfCart(HashMap<Long, CartDTO> cart) {
        int totalQuantity = 0;
        for(Map.Entry<Long, CartDTO> itemCart : cart.entrySet()) {
            totalQuantity += itemCart.getValue().getQuantity();
        }
        return totalQuantity;
    }

    @Override
    public double getPriceOfCart(HashMap<Long, CartDTO> cart) {
        double totalPrice = 0;
        for(Map.Entry<Long, CartDTO> itemCart : cart.entrySet()) {
            totalPrice += itemCart.getValue().getTotalPrice();
        }
        return totalPrice;
    }
}
