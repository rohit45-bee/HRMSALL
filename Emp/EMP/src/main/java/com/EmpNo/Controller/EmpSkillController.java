package com.EmpNo.Controller;


import com.EmpNo.Models.EmpSkill;
import com.EmpNo.Service.EmpSkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/api/emp-skill")
public class EmpSkillController {

    @Autowired
    private EmpSkillService empSkillService;

    @PostMapping
    public ResponseEntity<EmpSkill> createEmpSkill(@RequestBody EmpSkill empSkill) {
        EmpSkill savedEmpSkill = empSkillService.saveEmpSkill(empSkill);
        return new ResponseEntity<>(savedEmpSkill, HttpStatus.CREATED);
    }

    @GetMapping("/{empNumber}")
    public ResponseEntity<EmpSkill> getEmpSkillByEmpNumber(@PathVariable Long empNumber) {
        Optional<EmpSkill> empSkill = empSkillService.getEmpSkillByEmpNumber(empNumber);
        return empSkill.map(skill -> new ResponseEntity<>(skill, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{empNumber}")
    public ResponseEntity<EmpSkill> updateEmpSkill(
            @PathVariable Long empNumber,
            @RequestBody EmpSkill empSkillDetails) {
        try {
            EmpSkill updatedEmpSkill = empSkillService.updateEmpSkill(empNumber, empSkillDetails);
            return new ResponseEntity<>(updatedEmpSkill, HttpStatus.OK);
        } catch (RuntimeException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{empNumber}")
    public ResponseEntity<Void> deleteEmpSkill(@PathVariable Long empNumber) {
        empSkillService.deleteEmpSkill(empNumber);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
