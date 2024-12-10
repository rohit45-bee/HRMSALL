package com.EmpNo.Controller;

import com.EmpNo.Models.EmpUsTax;
import com.EmpNo.Service.EmpUsTaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/taxes")
public class EmpUsTaxController {

    @Autowired
    private EmpUsTaxService empUsTaxService;

    @GetMapping("/{empNumber}")
    public EmpUsTax getByEmpNumber(@PathVariable Long empNumber) {
        return empUsTaxService.getByEmpNumber(empNumber);
    }

    @GetMapping
    public List<EmpUsTax> getAll() {
        return empUsTaxService.getAll();
    }

    @PostMapping
    public EmpUsTax createOrUpdate(@RequestBody EmpUsTax empUsTax) {
        return empUsTaxService.saveOrUpdate(empUsTax);
    }

    @PutMapping("/{empNumber}")
    public ResponseEntity<EmpUsTax> updateEmpUsTax(@PathVariable Long empNumber, @RequestBody EmpUsTax empUsTax) {
        EmpUsTax updatedEmpUsTax = empUsTaxService.updateEmpUsTax(empNumber, empUsTax);
        return ResponseEntity.ok(updatedEmpUsTax);
    }

    @DeleteMapping("/{empNumber}")
    public void deleteByEmpNumber(@PathVariable Long empNumber) {
        empUsTaxService.deleteByEmpNumber(empNumber);
    }
}
