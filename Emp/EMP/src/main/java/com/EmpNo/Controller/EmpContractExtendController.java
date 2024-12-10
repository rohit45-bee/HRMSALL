package com.EmpNo.Controller;


import com.EmpNo.Models.EmpContractExtend;
import com.EmpNo.Service.EmpContractExtendService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-contract-extend")
public class EmpContractExtendController {

    @Autowired
    private EmpContractExtendService empContractExtendService;

    @PostMapping
    public ResponseEntity<EmpContractExtend> createEmpContractExtend(@RequestBody EmpContractExtend empContractExtend) {
        return new ResponseEntity<>(empContractExtendService.createEmpContractExtend(empContractExtend), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<EmpContractExtend>> getAllEmpContractExtends() {
        return new ResponseEntity<>(empContractExtendService.getAllEmpContractExtends(), HttpStatus.OK);
    }

    @GetMapping("/emp/{empNumber}")
    public ResponseEntity<List<EmpContractExtend>> getEmpContractExtendsByEmpNumber(@PathVariable Long empNumber) {
        List<EmpContractExtend> contracts = empContractExtendService.getEmpContractExtendsByEmpNumber(empNumber);
        if (contracts.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(contracts, HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<EmpContractExtend> getEmpContractExtendById(@PathVariable Long id) {
        return new ResponseEntity<>(empContractExtendService.getEmpContractExtendById(id), HttpStatus.OK);
    }

    @PutMapping("/emp/{empNumber}")
    public ResponseEntity<EmpContractExtend> updateEmpContractExtendByEmpNumber(@PathVariable Long empNumber, @RequestBody EmpContractExtend updatedEmpContractExtend) {
        return new ResponseEntity<>(empContractExtendService.updateEmpContractExtendByEmpNumber(empNumber, updatedEmpContractExtend), HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteEmpContractExtendById(@PathVariable Long id) {
        empContractExtendService.deleteEmpContractExtendById(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @DeleteMapping("/emp/{empNumber}")
    public ResponseEntity<Void> deleteEmpContractExtendByEmpNumber(@PathVariable Long empNumber) {
        empContractExtendService.deleteEmpContractExtendByEmpNumber(empNumber);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
