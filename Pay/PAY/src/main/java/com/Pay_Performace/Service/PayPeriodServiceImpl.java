package com.Pay_Performace.Service;


import com.Pay_Performace.Models.PayPeriod;
import com.Pay_Performace.Repository.PayPeriodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayPeriodServiceImpl implements PayPeriodService {

    @Autowired
    private PayPeriodRepository payPeriodRepository;

    @Override
    public PayPeriod createPayPeriod(PayPeriod payPeriod) {
        return payPeriodRepository.save(payPeriod);
    }

    @Override
    public PayPeriod updatePayPeriod(Long id, PayPeriod payPeriodDetails) {
        PayPeriod payPeriod = payPeriodRepository.findById(id).orElseThrow(() -> new RuntimeException("PayPeriod not found"));
        payPeriod.setStartDate(payPeriodDetails.getStartDate());
        payPeriod.setEndDate(payPeriodDetails.getEndDate());
        payPeriod.setCloseDate(payPeriodDetails.getCloseDate());
        payPeriod.setCheckDate(payPeriodDetails.getCheckDate());
        payPeriod.setTimesheetAprovalDueDate(payPeriodDetails.getTimesheetAprovalDueDate());
        return payPeriodRepository.save(payPeriod);
    }



    @Override
    public void deletePayPeriod(Long id) {
        payPeriodRepository.deleteById(id);
    }

    @Override
    public PayPeriod getPayPeriodById(Long id) {
        return payPeriodRepository.findById(id).orElseThrow(() -> new RuntimeException("PayPeriod not found"));
    }

    @Override
    public List<PayPeriod> getAllPayPeriods() {
        return payPeriodRepository.findAll();
    }
}
