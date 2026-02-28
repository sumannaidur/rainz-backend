package com.rainz.schoolbackend.repository;

import com.rainz.schoolbackend.model.GalleryImage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GalleryImageRepository extends MongoRepository<GalleryImage, String> {
}
