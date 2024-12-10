package com.Pay_Performace.Controller;


import com.Pay_Performace.Models.PayGrade;
import com.Pay_Performace.Service.PayGradeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pay-grades")
public class PayGradeController {

    @Autowired
    private PayGradeService payGradeService;

    @PostMapping
    public ResponseEntity<PayGrade> createPayGrade(@RequestBody PayGrade payGrade) {
        return ResponseEntity.ok(payGradeService.createPayGrade(payGrade));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PayGrade> updatePayGrade(@PathVariable Long id, @RequestBody PayGrade payGrade) {
        return ResponseEntity.ok(payGradeService.updatePayGrade(id, payGrade));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PayGrade> getPayGradeById(@PathVariable Long id) {
        return ResponseEntity.ok(payGradeService.getPayGradeById(id));
    }

    @GetMapping
    public ResponseEntity<List<PayGrade>> getAllPayGrades() {
        return ResponseEntity.ok(payGradeService.getAllPayGrades());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayGrade(@PathVariable Long id) {
        payGradeService.deletePayGrade(id);
        return ResponseEntity.noContent().build();
    }
}
