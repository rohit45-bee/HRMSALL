package com.EmpNo.Controller;


import com.EmpNo.Models.EmpHistoryOfEarlierPos;
import com.EmpNo.Service.EmpHistoryOfEarlierPosService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-history-of-earlier-pos")
public class EmpHistoryOfEarlierPosController {

    private final EmpHistoryOfEarlierPosService empHistoryOfEarlierPosService;

    @Autowired
    public EmpHistoryOfEarlierPosController(EmpHistoryOfEarlierPosService empHistoryOfEarlierPosService) {
        this.empHistoryOfEarlierPosService = empHistoryOfEarlierPosService;
    }

    @PostMapping
    public ResponseEntity<EmpHistoryOfEarlierPos> createEmpHistoryOfEarlierPos(@RequestBody EmpHistoryOfEarlierPos empHistoryOfEarlierPos) {
        return ResponseEntity.ok(empHistoryOfEarlierPosService.createEmpHistoryOfEarlierPos(empHistoryOfEarlierPos));
    }

    @GetMapping
    public ResponseEntity<List<EmpHistoryOfEarlierPos>> getAllEmpHistoryOfEarlierPos() {
        return ResponseEntity.ok(empHistoryOfEarlierPosService.getAllEmpHistoryOfEarlierPos());
    }

    @GetMapping("/emp/{empNumber}")
    public ResponseEntity<List<EmpHistoryOfEarlierPos>> getEmpHistoryOfEarlierPosByEmpNumber(@PathVariable Long empNumber) {
        return ResponseEntity.ok(empHistoryOfEarlierPosService.getEmpHistoryOfEarlierPosByEmpNumber(empNumber));
    }

    @PutMapping("/emp/{empNumber}")
    public ResponseEntity<EmpHistoryOfEarlierPos> updateEmpHistoryOfEarlierPos(@PathVariable Long empNumber, @RequestBody EmpHistoryOfEarlierPos empHistoryOfEarlierPos) {
        return ResponseEntity.ok(empHistoryOfEarlierPosService.updateEmpHistoryOfEarlierPos(empNumber, empHistoryOfEarlierPos));
    }

    @DeleteMapping("/emp/{empNumber}")
    public ResponseEntity<Void> deleteEmpHistoryOfEarlierPos(@PathVariable Long empNumber) {
        empHistoryOfEarlierPosService.deleteEmpHistoryOfEarlierPosByEmpNumber(empNumber);
        return ResponseEntity.noContent().build();
    }
}
