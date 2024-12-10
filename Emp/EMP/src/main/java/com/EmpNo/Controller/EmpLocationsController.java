package com.EmpNo.Controller;


import com.EmpNo.Models.EmpLocations;
import com.EmpNo.Service.EmpLocationsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-locations")
public class EmpLocationsController {

    private final EmpLocationsService empLocationsService;

    @Autowired
    public EmpLocationsController(EmpLocationsService empLocationsService) {
        this.empLocationsService = empLocationsService;
    }

    @PostMapping
    public ResponseEntity<EmpLocations> createEmpLocation(@RequestBody EmpLocations empLocation) {
        return ResponseEntity.ok(empLocationsService.createEmpLocation(empLocation));
    }

    @GetMapping
    public ResponseEntity<List<EmpLocations>> getAllEmpLocations() {
        return ResponseEntity.ok(empLocationsService.getAllEmpLocations());
    }

    @GetMapping("/emp/{empNumber}")
    public ResponseEntity<List<EmpLocations>> getEmpLocationByEmpNumber(@PathVariable Long empNumber) {
        return ResponseEntity.ok(empLocationsService.getEmpLocationByEmpNumber(empNumber));
    }

    @PutMapping("/emp/{empNumber}")
    public ResponseEntity<EmpLocations> updateEmpLocation(@PathVariable Long empNumber, @RequestBody EmpLocations empLocation) {
        return ResponseEntity.ok(empLocationsService.updateEmpLocation(empNumber, empLocation));
    }

    @DeleteMapping("/emp/{empNumber}")
    public ResponseEntity<Void> deleteEmpLocation(@PathVariable Long empNumber) {
        empLocationsService.deleteEmpLocationByEmpNumber(empNumber);
        return ResponseEntity.noContent().build();
    }
}
