package com.EmpNo.Controller;


import com.EmpNo.Models.EmpEducation;
import com.EmpNo.Service.EmpEducationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-education")
public class EmpEducationController {

    @Autowired
    private EmpEducationService empEducationService;

    @PostMapping
    public ResponseEntity<EmpEducation> createEmpEducation(@RequestBody EmpEducation empEducation) {
        EmpEducation createdEmpEducation = empEducationService.createEmpEducation(empEducation);
        return new ResponseEntity<>(createdEmpEducation, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmpEducation>> getAllEmpEducation() {
        List<EmpEducation> empEducationList = empEducationService.getAllEmpEducation();
        return new ResponseEntity<>(empEducationList, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpEducation> getEmpEducationById(@PathVariable Long id) {
        return empEducationService.getEmpEducationById(id)
                .map(empEducation -> new ResponseEntity<>(empEducation, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmpEducation> updateEmpEducation(@PathVariable Long id, @RequestBody EmpEducation empEducation) {
        EmpEducation updatedEmpEducation = empEducationService.updateEmpEducation(id, empEducation);
        if (updatedEmpEducation != null) {
            return new ResponseEntity<>(updatedEmpEducation, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpEducation(@PathVariable Long id) {
        empEducationService.deleteEmpEducation(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
