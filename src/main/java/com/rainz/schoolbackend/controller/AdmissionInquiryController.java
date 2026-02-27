package com.rainz.schoolbackend.controller;

import com.rainz.schoolbackend.model.AdmissionInquiry;
import com.rainz.schoolbackend.repository.AdmissionInquiryRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/inquiries")
@CrossOrigin(origins = "*") // Allows cross-origin requests from the frontend HTML pages
public class AdmissionInquiryController {

    @Autowired
    private AdmissionInquiryRepository repository;

    // Create a new inquiry (Called by the frontend form)
    @PostMapping
    public ResponseEntity<Map<String, String>> createInquiry(@Valid @RequestBody AdmissionInquiry inquiry) {
        repository.save(inquiry);

        Map<String, String> response = new HashMap<>();
        response.put("status", "success");
        response.put("message", "Inquiry submitted successfully");

        return new ResponseEntity<>(response, HttpStatus.CREATED);
    }

    // Get all inquiries (For an admin dashboard in the future)
    @GetMapping
    public List<AdmissionInquiry> getAllInquiries() {
        return repository.findAll();
    }
}
