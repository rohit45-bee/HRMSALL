package com.EmpNo.Controller;


import com.EmpNo.Models.EmpWorkExperience;
import com.EmpNo.Service.EmpWorkExperienceService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/emp-work-experience")
public class EmpWorkExperienceController {

    @Autowired
    private EmpWorkExperienceService empWorkExperienceService;

    @PostMapping
    public ResponseEntity<EmpWorkExperience> createOrUpdate(@RequestBody EmpWorkExperience empWorkExperience) {
        EmpWorkExperience savedEmpWorkExperience = empWorkExperienceService.saveOrUpdate(empWorkExperience);
        return new ResponseEntity<>(savedEmpWorkExperience, HttpStatus.CREATED);
    }

    @GetMapping("/{empNumber}")
    public ResponseEntity<EmpWorkExperience> getByEmpNumber(@PathVariable Long empNumber) {
        Optional<EmpWorkExperience> empWorkExperience = empWorkExperienceService.getByEmpNumber(empNumber);
        return empWorkExperience.map(exp -> new ResponseEntity<>(exp, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @GetMapping
    public List<EmpWorkExperience> getAll() {
        return empWorkExperienceService.getAll();
    }

    @PutMapping("/{empNumber}")
    public ResponseEntity<EmpWorkExperience> updateEmpWorkExperience(
            @PathVariable Long empNumber,
            @RequestBody EmpWorkExperience empWorkExperience) {
        try {
            EmpWorkExperience updatedEmpWorkExperience = empWorkExperienceService.updateEmpWorkExperience(empNumber, empWorkExperience);
            return new ResponseEntity<>(updatedEmpWorkExperience, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{empNumber}")
    public ResponseEntity<Void> deleteByEmpNumber(@PathVariable Long empNumber) {
        empWorkExperienceService.deleteByEmpNumber(empNumber);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
