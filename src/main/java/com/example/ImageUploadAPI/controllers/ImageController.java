package com.example.ImageUploadAPI.controllers;

import com.example.ImageUploadAPI.DTO.ImageDTO;
import com.example.ImageUploadAPI.entities.Image;
import com.example.ImageUploadAPI.services.ImageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/images")
public class ImageController {
    @Autowired
    private ImageService imageService;

    @GetMapping
    public List<Image> getAllImages(){
        return imageService.getAllImage();
    }

    @GetMapping("/{id}")
    public Image getImageById(@PathVariable("id") String id){
        return imageService.getImageById(id);
    }

    @PostMapping
    public void postImage(@RequestBody @Validated ImageDTO image){
        imageService.addImage(image.getName(), image.getImage());
    }

    @DeleteMapping("/{id}")
    public void deleteImage(@PathVariable("id") String id){
        imageService.deleteImageById(id);
    }

    @PutMapping
    public void updateImage(@RequestBody @Validated Image image){
        imageService.updateImage(image);
    }
}
