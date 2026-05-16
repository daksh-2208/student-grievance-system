package com.college.grievance;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document(collection = "grievances")
public class Grievance {
    @Id
    private String id;
    
    private String name;
    private String email;
    private String phone;
    private String title;
    private String category;
    private String location;
    private String description;
    
    private String status = "Pending"; // Default status when submitted
}