package com.EmpNo.Controller;


import com.EmpNo.Models.EmpDirectDebit;
import com.EmpNo.Service.EmpDirectDebitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-direct-debit")
public class EmpDirectDebitController {

    private final EmpDirectDebitService empDirectDebitService;

    @Autowired
    public EmpDirectDebitController(EmpDirectDebitService empDirectDebitService) {
        this.empDirectDebitService = empDirectDebitService;
    }

    @PostMapping
    public ResponseEntity<EmpDirectDebit> createEmpDirectDebit(@RequestBody EmpDirectDebit empDirectDebit) {
        return ResponseEntity.ok(empDirectDebitService.createEmpDirectDebit(empDirectDebit));
    }

    @GetMapping
    public ResponseEntity<List<EmpDirectDebit>> getAllEmpDirectDebits() {
        return ResponseEntity.ok(empDirectDebitService.getAllEmpDirectDebits());
    }

    @GetMapping("/salary/{salaryId}")
    public ResponseEntity<List<EmpDirectDebit>> getEmpDirectDebitsBySalaryId(@PathVariable Long salaryId) {
        return ResponseEntity.ok(empDirectDebitService.getEmpDirectDebitsBySalaryId(salaryId));
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpDirectDebit> getEmpDirectDebitById(@PathVariable Long id) {
        return ResponseEntity.ok(empDirectDebitService.getEmpDirectDebitById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmpDirectDebit> updateEmpDirectDebit(@PathVariable Long id, @RequestBody EmpDirectDebit empDirectDebit) {
        return ResponseEntity.ok(empDirectDebitService.updateEmpDirectDebit(id, empDirectDebit));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpDirectDebit(@PathVariable Long id) {
        empDirectDebitService.deleteEmpDirectDebitById(id);
        return ResponseEntity.noContent().build();
    }
}
