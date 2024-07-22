package com.congquy.diamondshop.dto;


public class ColorsDTO extends AbstractDTO<ColorsDTO> {

    private String name;

    private String code;

    private String image;

    public ColorsDTO(Long id, String code, String name) {
        super(id);
        this.name = name;
        this.code = code;
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
