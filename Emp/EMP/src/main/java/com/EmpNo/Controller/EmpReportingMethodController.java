package com.EmpNo.Controller;


import com.EmpNo.Models.EmpReportingMethod;
import com.EmpNo.Service.EmpReportingMethodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-reporting-method")
public class EmpReportingMethodController {

    @Autowired
    private EmpReportingMethodService empReportingMethodService;

    @PostMapping
    public ResponseEntity<EmpReportingMethod> createEmpReportingMethod(@RequestBody EmpReportingMethod empReportingMethod) {
        EmpReportingMethod createdMethod = empReportingMethodService.createEmpReportingMethod(empReportingMethod);
        return new ResponseEntity<>(createdMethod, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmpReportingMethod>> getAllEmpReportingMethods() {
        List<EmpReportingMethod> methods = empReportingMethodService.getAllEmpReportingMethods();
        return new ResponseEntity<>(methods, HttpStatus.OK);
    }

    @GetMapping("/{reportingMethodId}")
    public ResponseEntity<EmpReportingMethod> getEmpReportingMethodById(@PathVariable Long reportingMethodId) {
        return empReportingMethodService.getEmpReportingMethodById(reportingMethodId)
                .map(method -> new ResponseEntity<>(method, HttpStatus.OK))
                .orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PutMapping("/{reportingMethodId}")
    public ResponseEntity<EmpReportingMethod> updateEmpReportingMethod(@PathVariable Long reportingMethodId, @RequestBody EmpReportingMethod empReportingMethod) {
        EmpReportingMethod updatedMethod = empReportingMethodService.updateEmpReportingMethod(reportingMethodId, empReportingMethod);
        if (updatedMethod != null) {
            return new ResponseEntity<>(updatedMethod, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{reportingMethodId}")
    public ResponseEntity<Void> deleteEmpReportingMethod(@PathVariable Long reportingMethodId) {
        empReportingMethodService.deleteEmpReportingMethod(reportingMethodId);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
