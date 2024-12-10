package com.EmpNo.Controller;


import com.EmpNo.Models.EmpBasicSalary;
import com.EmpNo.Service.EmpBasicSalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-basicsalaries")
public class EmpBasicSalaryController {

    @Autowired
    private EmpBasicSalaryService empBasicSalaryService;

    @PostMapping
    public ResponseEntity<EmpBasicSalary> createEmpBasicSalary(@RequestBody EmpBasicSalary empBasicSalary) {
        return ResponseEntity.ok(empBasicSalaryService.createEmpBasicSalary(empBasicSalary));
    }

    @GetMapping("/{empNumber}")
    public ResponseEntity<EmpBasicSalary> getEmpBasicSalaryByEmpNumber(@PathVariable("empNumber") String empNumber) {
        return ResponseEntity.ok(empBasicSalaryService.getEmpBasicSalaryByEmpNumber(empNumber));
    }

    @GetMapping
    public ResponseEntity<List<EmpBasicSalary>> getAllEmpBasicSalaries() {
        return ResponseEntity.ok(empBasicSalaryService.getAllEmpBasicSalaries());
    }

    @PutMapping("/{empNumber}")
    public ResponseEntity<EmpBasicSalary> updateEmpBasicSalary(@PathVariable("empNumber") String empNumber, @RequestBody EmpBasicSalary empBasicSalary) {
        return ResponseEntity.ok(empBasicSalaryService.updateEmpBasicSalary(empNumber, empBasicSalary));
    }

    @DeleteMapping("/{empNumber}")
    public ResponseEntity<Void> deleteEmpBasicSalary(@PathVariable("empNumber") String empNumber) {
        empBasicSalaryService.deleteEmpBasicSalary(empNumber);
        return ResponseEntity.noContent().build();
    }
}
