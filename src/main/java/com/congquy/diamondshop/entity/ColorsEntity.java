package com.congquy.diamondshop.entity;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "colors")
public class ColorsEntity extends BaseEntity {

    @ManyToMany(mappedBy = "colors")
    private List<ProductEntity> products = new ArrayList<>();

    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "image")
    private String image;

    public List<ProductEntity> getProducts() {
        return products;
    }

    public void setProducts(List<ProductEntity> products) {
        this.products = products;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
