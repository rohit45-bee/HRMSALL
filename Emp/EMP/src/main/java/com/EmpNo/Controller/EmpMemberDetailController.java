package com.EmpNo.Controller;


import com.EmpNo.Models.EmpMemberDetail;
import com.EmpNo.Service.EmpMemberDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-member-detail")
public class EmpMemberDetailController {

    private final EmpMemberDetailService empMemberDetailService;

    @Autowired
    public EmpMemberDetailController(EmpMemberDetailService empMemberDetailService) {
        this.empMemberDetailService = empMemberDetailService;
    }

    @PostMapping
    public ResponseEntity<EmpMemberDetail> createEmpMemberDetail(@RequestBody EmpMemberDetail empMemberDetail) {
        return ResponseEntity.ok(empMemberDetailService.createEmpMemberDetail(empMemberDetail));
    }

    @GetMapping
    public ResponseEntity<List<EmpMemberDetail>> getAllEmpMemberDetails() {
        return ResponseEntity.ok(empMemberDetailService.getAllEmpMemberDetails());
    }

    @GetMapping("/emp/{empNumber}")
    public ResponseEntity<List<EmpMemberDetail>> getEmpMemberDetailByEmpNumber(@PathVariable Long empNumber) {
        return ResponseEntity.ok(empMemberDetailService.getEmpMemberDetailByEmpNumber(empNumber));
    }

    @PutMapping("/emp/{empNumber}")
    public ResponseEntity<EmpMemberDetail> updateEmpMemberDetail(@PathVariable Long empNumber, @RequestBody EmpMemberDetail empMemberDetail) {
        return ResponseEntity.ok(empMemberDetailService.updateEmpMemberDetail(empNumber, empMemberDetail));
    }

    @DeleteMapping("/emp/{empNumber}")
    public ResponseEntity<Void> deleteEmpMemberDetail(@PathVariable Long empNumber) {
        empMemberDetailService.deleteEmpMemberDetailByEmpNumber(empNumber);
        return ResponseEntity.noContent().build();
    }
}
