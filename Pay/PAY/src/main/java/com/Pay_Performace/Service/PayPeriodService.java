package com.Pay_Performace.Service;



import com.Pay_Performace.Models.PayPeriod;

import java.util.List;

public interface PayPeriodService {
    PayPeriod createPayPeriod(PayPeriod payPeriod);
    PayPeriod updatePayPeriod(Long id, PayPeriod payPeriod);
    void deletePayPeriod(Long id);
    PayPeriod getPayPeriodById(Long id);
    List<PayPeriod> getAllPayPeriods();
}
