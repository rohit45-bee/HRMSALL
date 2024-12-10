package com.EmpNo.Controller;


import com.EmpNo.Models.EmpLicense;
import com.EmpNo.Service.EmpLicenseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-license")
public class EmpLicenseController {

    @Autowired
    private EmpLicenseService empLicenseService;

    @PostMapping
    public ResponseEntity<EmpLicense> createEmpLicense(@RequestBody EmpLicense empLicense) {
        EmpLicense createdEmpLicense = empLicenseService.createEmpLicense(empLicense);
        return new ResponseEntity<>(createdEmpLicense, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmpLicense>> getAllEmpLicenses() {
        List<EmpLicense> empLicenseList = empLicenseService.getAllEmpLicenses();
        return new ResponseEntity<>(empLicenseList, HttpStatus.OK);
    }

    @GetMapping("/{empNumber}")
    public ResponseEntity<EmpLicense> getEmpLicenseById(@PathVariable Long empNumber) {
        return empLicenseService.getEmpLicenseById(empNumber)
                .map(empLicense -> new ResponseEntity<>(empLicense, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{empNumber}")
    public ResponseEntity<EmpLicense> updateEmpLicense(@PathVariable Long empNumber, @RequestBody EmpLicense empLicense) {
        EmpLicense updatedEmpLicense = empLicenseService.updateEmpLicense(empNumber, empLicense);
        if (updatedEmpLicense != null) {
            return new ResponseEntity<>(updatedEmpLicense, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{empNumber}")
    public ResponseEntity<Void> deleteEmpLicense(@PathVariable Long empNumber) {
        empLicenseService.deleteEmpLicense(empNumber);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
