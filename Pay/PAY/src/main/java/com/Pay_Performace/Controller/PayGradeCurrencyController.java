package com.Pay_Performace.Controller;



import com.Pay_Performace.Models.PayGradeCurrency;
import com.Pay_Performace.Service.PayGradeCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pay-grade-currencies")
public class PayGradeCurrencyController {

    @Autowired
    private PayGradeCurrencyService payGradeCurrencyService;

    @PostMapping
    public ResponseEntity<PayGradeCurrency> createPayGradeCurrency(@RequestBody PayGradeCurrency payGradeCurrency) {
        return ResponseEntity.ok(payGradeCurrencyService.createPayGradeCurrency(payGradeCurrency));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PayGradeCurrency> updatePayGradeCurrency(@PathVariable Long id, @RequestBody PayGradeCurrency payGradeCurrency) {
        return ResponseEntity.ok(payGradeCurrencyService.updatePayGradeCurrency(id, payGradeCurrency));
    }

    @GetMapping("/{id}")
    public ResponseEntity<PayGradeCurrency> getPayGradeCurrencyById(@PathVariable Long id) {
        return ResponseEntity.ok(payGradeCurrencyService.getPayGradeCurrencyById(id));
    }

    @GetMapping
    public ResponseEntity<List<PayGradeCurrency>> getAllPayGradeCurrencies() {
        return ResponseEntity.ok(payGradeCurrencyService.getAllPayGradeCurrencies());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayGradeCurrency(@PathVariable Long id) {
        payGradeCurrencyService.deletePayGradeCurrency(id);
        return ResponseEntity.noContent().build();
    }
}
