package com.rainz.schoolbackend.model;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "admission_inquiries")
public class AdmissionInquiry {

    @Id
    private String id;

    @NotBlank(message = "Parent name is required")
    private String parentName;

    @NotBlank(message = "Phone number is required")
    private String phone;

    @Email(message = "Email should be valid")
    private String email;

    @NotBlank(message = "Child name is required")
    private String childName;

    @NotBlank(message = "Child age is required")
    private String childAge;

    @NotBlank(message = "Program is required")
    private String program;

    private String message;

    private LocalDateTime inquiryDate = LocalDateTime.now();
}
