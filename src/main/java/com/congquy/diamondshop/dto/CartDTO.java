package com.congquy.diamondshop.dto;

public class CartDTO {

    private ProductDTO productDetail;

    private int quantity;

    private double totalPrice;

    public CartDTO() {
    }

    public CartDTO(ProductDTO productDetail, int quantity, double totalPrice) {
        this.productDetail = productDetail;
        this.quantity = quantity;
        this.totalPrice = totalPrice;
    }

    public ProductDTO getProductDetail() {
        return productDetail;
    }

    public void setProductDetail(ProductDTO productDetail) {
        this.productDetail = productDetail;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
