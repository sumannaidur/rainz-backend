package com.rainz.schoolbackend.repository;

import com.rainz.schoolbackend.model.AdmissionInquiry;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AdmissionInquiryRepository extends MongoRepository<AdmissionInquiry, String> {
}
