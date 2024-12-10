package com.EmpNo.Controller;


import com.EmpNo.Models.EmpPassport;
import com.EmpNo.Service.EmpPassportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-passport")
public class EmpPassportController {

    @Autowired
    private EmpPassportService empPassportService;

    @PostMapping
    public ResponseEntity<EmpPassport> createEmpPassport(@RequestBody EmpPassport empPassport) {
        return new ResponseEntity<>(empPassportService.createEmpPassport(empPassport), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmpPassport>> getAllEmpPassports() {
        return new ResponseEntity<>(empPassportService.getAllEmpPassports(), HttpStatus.OK);
    }

    @GetMapping("/emp/{empNumber}")
    public ResponseEntity<EmpPassport> getEmpPassportByEmpNumber(@PathVariable Long empNumber) {
        return new ResponseEntity<>(empPassportService.getEmpPassportByEmpNumber(empNumber), HttpStatus.OK);
    }

    @PutMapping("/emp/{empNumber}")
    public ResponseEntity<EmpPassport> updateEmpPassportByEmpNumber(@PathVariable Long empNumber, @RequestBody EmpPassport updatedEmpPassport) {
        return new ResponseEntity<>(empPassportService.updateEmpPassportByEmpNumber(empNumber, updatedEmpPassport), HttpStatus.OK);
    }

    @DeleteMapping("/emp/{empNumber}")
    public ResponseEntity<Void> deleteEmpPassportByEmpNumber(@PathVariable Long empNumber) {
        empPassportService.deleteEmpPassportByEmpNumber(empNumber);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
