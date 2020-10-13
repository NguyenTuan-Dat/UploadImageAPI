package com.example.ImageUploadAPI.services;

import com.example.ImageUploadAPI.entities.Image;
import com.example.ImageUploadAPI.repositories.ImageRepository;
import org.bson.types.Binary;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Base64;
import java.util.List;

@Service
public class ImageService {
    @Autowired
    private ImageRepository imageRepository;

    public String addImage(String name, String image){
        Image image1 = new Image();
        image1.setName(name);
        image1.setImage(image);
        imageRepository.insert(image1);

        return image1.getId();
    }

    public Image getImageById(String id){
        return imageRepository.findById(id).get();
    }

    public List<Image> getAllImage(){
        return imageRepository.findAll();
    }

    public boolean deleteImageById(String id){
        if(imageRepository.findById(id) != null) {
            imageRepository.deleteById(id);
            return true;
        }
        else return false;
    }

    public boolean updateImage(Image image){
        if(imageRepository.findById(image.getId()) != null) {
            imageRepository.insert(image);
            return true;
        }
        else return false;
    }
}
