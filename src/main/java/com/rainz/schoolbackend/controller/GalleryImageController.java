package com.rainz.schoolbackend.controller;

import com.rainz.schoolbackend.model.GalleryImage;
import com.rainz.schoolbackend.repository.GalleryImageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/api/gallery")
@CrossOrigin(origins = "*")
public class GalleryImageController {

    @Autowired
    private GalleryImageRepository repository;

    @PostMapping
    public ResponseEntity<GalleryImage> addImage(@RequestBody GalleryImage image) {
        image.setUploadDate(LocalDateTime.now());
        GalleryImage savedImage = repository.save(image);
        return new ResponseEntity<>(savedImage, HttpStatus.CREATED);
    }

    @GetMapping
    public List<GalleryImage> getAllImages() {
        return repository.findAll();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteImage(@PathVariable String id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}
