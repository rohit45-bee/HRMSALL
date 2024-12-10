package com.EmpNo.Controller;


import com.EmpNo.Models.EmpChildren;
import com.EmpNo.Service.EmpChildrenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-children")
public class EmpChildrenController {

    @Autowired
    private EmpChildrenService empChildrenService;

    @PostMapping
    public ResponseEntity<EmpChildren> createEmpChildren(@RequestBody EmpChildren empChildren) {
        return new ResponseEntity<>(empChildrenService.createEmpChildren(empChildren), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmpChildren>> getAllEmpChildren() {
        return new ResponseEntity<>(empChildrenService.getAllEmpChildren(), HttpStatus.OK);
    }

    @GetMapping("/emp/{empNumber}")
    public ResponseEntity<List<EmpChildren>> getEmpChildrenByEmpNumber(@PathVariable Long empNumber) {
        List<EmpChildren> children = empChildrenService.getEmpChildrenByEmpNumber(empNumber);
        if (children.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(children, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpChildren> getEmpChildrenById(@PathVariable Long id) {
        return new ResponseEntity<>(empChildrenService.getEmpChildrenById(id), HttpStatus.OK);
    }

    @PutMapping("/emp/{empNumber}")
    public ResponseEntity<EmpChildren> updateEmpChildrenByEmpNumber(@PathVariable Long empNumber, @RequestBody EmpChildren updatedEmpChildren) {
        return new ResponseEntity<>(empChildrenService.updateEmpChildrenByEmpNumber(empNumber, updatedEmpChildren), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpChildrenById(@PathVariable Long id) {
        empChildrenService.deleteEmpChildrenById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/emp/{empNumber}")
    public ResponseEntity<Void> deleteEmpChildrenByEmpNumber(@PathVariable Long empNumber) {
        empChildrenService.deleteEmpChildrenByEmpNumber(empNumber);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
