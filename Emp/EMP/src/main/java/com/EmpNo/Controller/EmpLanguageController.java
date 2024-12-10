package com.EmpNo.Controller;


import com.EmpNo.Models.EmpLanguage;
import com.EmpNo.Service.EmpLanguageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-language")
public class EmpLanguageController {

    private final EmpLanguageService empLanguageService;

    @Autowired
    public EmpLanguageController(EmpLanguageService empLanguageService) {
        this.empLanguageService = empLanguageService;
    }

    @PostMapping
    public ResponseEntity<EmpLanguage> createEmpLanguage(@RequestBody EmpLanguage empLanguage) {
        return ResponseEntity.ok(empLanguageService.createEmpLanguage(empLanguage));
    }

    @GetMapping
    public ResponseEntity<List<EmpLanguage>> getAllEmpLanguages() {
        return ResponseEntity.ok(empLanguageService.getAllEmpLanguages());
    }

    @GetMapping("/emp/{empNumber}")
    public ResponseEntity<List<EmpLanguage>> getEmpLanguageByEmpNumber(@PathVariable Long empNumber) {
        return ResponseEntity.ok(empLanguageService.getEmpLanguageByEmpNumber(empNumber));
    }

    @PutMapping("/emp/{empNumber}")
    public ResponseEntity<EmpLanguage> updateEmpLanguage(@PathVariable Long empNumber, @RequestBody EmpLanguage empLanguage) {
        return ResponseEntity.ok(empLanguageService.updateEmpLanguage(empNumber, empLanguage));
    }

    @DeleteMapping("/emp/{empNumber}")
    public ResponseEntity<Void> deleteEmpLanguage(@PathVariable Long empNumber) {
        empLanguageService.deleteEmpLanguageByEmpNumber(empNumber);
        return ResponseEntity.noContent().build();
    }
}
