package com.congquy.diamondshop.entity;

import javax.persistence.*;

@Entity
@Table(name = "slides")
public class SlidesEntity extends BaseEntity {

    @Column(name = "image")
    private String image;

    @Column(name = "title")
    private String title;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
