package com.congquy.diamondshop.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "menu")
public class MenuEntity extends BaseEntity {
    @Column(name = "name")
    private String name;

    @Column(name = "code")
    private String code;

    @Column(name = "url")
    private String url;

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

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
