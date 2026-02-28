package com.rainz.schoolbackend.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "gallery_images")
public class GalleryImage {

    @Id
    private String id;

    private String imageUrl;
    private String caption;
    private String category;

    private LocalDateTime uploadDate = LocalDateTime.now();
}
