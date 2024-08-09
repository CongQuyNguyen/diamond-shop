package com.congquy.diamondshop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "bill")
public class BillEntity extends BaseEntity {

    @OneToMany(mappedBy = "bill")
    private List<BillDetailEntity> listBillDetail = new ArrayList<>();

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id")
    private UserEntity user;


    @Column(name = "total_fee")
    private double totalFee;

    @Column(name = "quantity")
    private int quantity;

    @Column(name = "contact")
    private String contact;

    @Column(name = "note", columnDefinition = "TEXT")
    private String note;

    @Column(name = "address" ,columnDefinition = "TEXT")
    private String address;


    public List<BillDetailEntity> getListBillDetail() {
        return listBillDetail;
    }

    public void setListBillDetail(List<BillDetailEntity> listBillDetail) {
        this.listBillDetail = listBillDetail;
    }


    public UserEntity getUser() {
        return user;
    }

    public void setUser(UserEntity user) {
        this.user = user;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public double getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(double totalFee) {
        this.totalFee = totalFee;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
