package com.Pay_Performace.Controller;



import com.Pay_Performace.Models.PayPeriod;
import com.Pay_Performace.Service.PayPeriodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pay-period")
public class PayPeriodController {

    @Autowired
    private PayPeriodService payPeriodService;

    @PostMapping
    public ResponseEntity<PayPeriod> createPayPeriod(@RequestBody PayPeriod payPeriod) {
        PayPeriod createdPayPeriod = payPeriodService.createPayPeriod(payPeriod);
        return new ResponseEntity<>(createdPayPeriod, HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<PayPeriod>> getAllPayPeriods() {
        return new ResponseEntity<>(payPeriodService.getAllPayPeriods(), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    public ResponseEntity<PayPeriod> getPayPeriodById(@PathVariable Long id) {
        PayPeriod payPeriod = payPeriodService.getPayPeriodById(id);
        return new ResponseEntity<>(payPeriod, HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PayPeriod> updatePayPeriod(@PathVariable Long id, @RequestBody PayPeriod payPeriodDetails) {
        PayPeriod updatedPayPeriod = payPeriodService.updatePayPeriod(id, payPeriodDetails);
        return new ResponseEntity<>(updatedPayPeriod, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePayPeriod(@PathVariable Long id) {
        payPeriodService.deletePayPeriod(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
