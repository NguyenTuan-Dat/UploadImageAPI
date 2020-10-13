package com.example.ImageUploadAPI.repositories;

import com.example.ImageUploadAPI.entities.Image;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ImageRepository extends MongoRepository<Image, String> { }
