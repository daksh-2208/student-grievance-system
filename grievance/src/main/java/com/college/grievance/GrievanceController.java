package com.college.grievance;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin("*")
public class GrievanceController {

    @Autowired
    private GrievanceRepository repo;

    // 1. Add a new grievance
    @PostMapping("/add")
    public Grievance addGrievance(@RequestBody Grievance grievance) {
        return repo.save(grievance);
    }

    // 2. Get all grievances (For Admin Dashboard)
    @GetMapping("/all")
    public List<Grievance> getAllGrievances() {
        return repo.findAll();
    }

    // 3. Track grievances by email (For Student Track Page)
    @GetMapping("/track/{email}")
    public List<Grievance> trackGrievance(@PathVariable String email) {
        return repo.findByEmail(email);
    }

    // 4. Update status (Safe version using Optional and @RequestParam)
    @PutMapping("/update/{id}")
    public Grievance updateStatus(@PathVariable String id, @RequestParam String status) {
        Optional<Grievance> optionalGrievance = repo.findById(id);
        
        if (optionalGrievance.isPresent()) {
            Grievance g = optionalGrievance.get();
            g.setStatus(status);
            return repo.save(g);
        } else {
            return null; // If ID not found, do nothing
        }
    }
}