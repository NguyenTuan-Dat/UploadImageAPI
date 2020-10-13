package com.example.ImageUploadAPI.DTO;

import org.bson.types.Binary;

import java.util.Base64;

public class ImageDTO {

    private String name;

    private String image;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
