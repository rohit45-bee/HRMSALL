package com.EmpNo.Controller;


import com.EmpNo.Models.EmpTermination;
import com.EmpNo.Service.EmpTerminationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-termination")
public class EmpTerminationController {

    @Autowired
    private EmpTerminationService empTerminationService;

    @PostMapping
    public ResponseEntity<EmpTermination> createEmpTermination(@RequestBody EmpTermination empTermination) {
        EmpTermination createdTermination = empTerminationService.createEmpTermination(empTermination);
        return new ResponseEntity<>(createdTermination, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmpTermination>> getAllEmpTerminations() {
        List<EmpTermination> terminations = empTerminationService.getAllEmpTerminations();
        return new ResponseEntity<>(terminations, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpTermination> getEmpTerminationById(@PathVariable Long id) {
        return empTerminationService.getEmpTerminationById(id)
                .map(termination -> new ResponseEntity<>(termination, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{id}")
    public ResponseEntity<EmpTermination> updateEmpTermination(@PathVariable Long id, @RequestBody EmpTermination empTermination) {
        EmpTermination updatedTermination = empTerminationService.updateEmpTermination(id, empTermination);
        if (updatedTermination != null) {
            return new ResponseEntity<>(updatedTermination, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpTermination(@PathVariable Long id) {
        empTerminationService.deleteEmpTermination(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
