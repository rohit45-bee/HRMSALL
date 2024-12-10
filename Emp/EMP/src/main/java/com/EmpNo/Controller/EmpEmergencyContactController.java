package com.EmpNo.Controller;


import com.EmpNo.Models.EmpEmergencyContact;
import com.EmpNo.Service.EmpEmergencyContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-emergency-contact")
public class EmpEmergencyContactController {

    private final EmpEmergencyContactService empEmergencyContactService;

    @Autowired
    public EmpEmergencyContactController(EmpEmergencyContactService empEmergencyContactService) {
        this.empEmergencyContactService = empEmergencyContactService;
    }

    @PostMapping
    public ResponseEntity<EmpEmergencyContact> createEmpEmergencyContact(@RequestBody EmpEmergencyContact empEmergencyContact) {
        return ResponseEntity.ok(empEmergencyContactService.createEmpEmergencyContact(empEmergencyContact));
    }

    @GetMapping
    public ResponseEntity<List<EmpEmergencyContact>> getAllEmpEmergencyContacts() {
        return ResponseEntity.ok(empEmergencyContactService.getAllEmpEmergencyContacts());
    }

    @GetMapping("/emp/{empNumber}")
    public ResponseEntity<List<EmpEmergencyContact>> getEmpEmergencyContactsByEmpNumber(@PathVariable Long empNumber) {
        return ResponseEntity.ok(empEmergencyContactService.getEmpEmergencyContactsByEmpNumber(empNumber));
    }

    @PutMapping("/emp/{empNumber}")
    public ResponseEntity<EmpEmergencyContact> updateEmpEmergencyContact(@PathVariable Long empNumber, @RequestBody EmpEmergencyContact empEmergencyContact) {
        return ResponseEntity.ok(empEmergencyContactService.updateEmpEmergencyContact(empNumber, empEmergencyContact));
    }

    @DeleteMapping("/emp/{empNumber}")
    public ResponseEntity<Void> deleteEmpEmergencyContact(@PathVariable Long empNumber) {
        empEmergencyContactService.deleteEmpEmergencyContactByEmpNumber(empNumber);
        return ResponseEntity.noContent().build();
    }
}
