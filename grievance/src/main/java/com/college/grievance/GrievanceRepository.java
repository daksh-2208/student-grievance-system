package com.college.grievance;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface GrievanceRepository extends MongoRepository<Grievance, String> {
    
    // This automatically searches the database for complaints matching the email
    List<Grievance> findByEmail(String email);
}