package com.Pay_Performace.Service;



import com.Pay_Performace.Configuration.ResourceNotFoundException;
import com.Pay_Performace.Models.PayGradeCurrency;
import com.Pay_Performace.Repository.PayGradeCurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayGradeCurrencyServiceImpl implements PayGradeCurrencyService {

    @Autowired
    private PayGradeCurrencyRepository payGradeCurrencyRepository;

    @Override
    public PayGradeCurrency createPayGradeCurrency(PayGradeCurrency payGradeCurrency) {
        return payGradeCurrencyRepository.save(payGradeCurrency);
    }

    @Override
    public PayGradeCurrency updatePayGradeCurrency(Long id, PayGradeCurrency payGradeCurrency) {
        PayGradeCurrency existingPayGradeCurrency = payGradeCurrencyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("PayGradeCurrency", "id", id));

        existingPayGradeCurrency.setPayGradeId(payGradeCurrency.getPayGradeId());
        existingPayGradeCurrency.setCurrencyId(payGradeCurrency.getCurrencyId());
        existingPayGradeCurrency.setMinSalary(payGradeCurrency.getMinSalary());
        existingPayGradeCurrency.setMaxSalary(payGradeCurrency.getMaxSalary());

        return payGradeCurrencyRepository.save(existingPayGradeCurrency);
    }



    @Override
    public PayGradeCurrency getPayGradeCurrencyById(Long id) {
        return payGradeCurrencyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("PayGradeCurrency", "id", id));
    }

    @Override
    public List<PayGradeCurrency> getAllPayGradeCurrencies() {
        return payGradeCurrencyRepository.findAll();
    }

    @Override
    public void deletePayGradeCurrency(Long id) {
        PayGradeCurrency payGradeCurrency = payGradeCurrencyRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("PayGradeCurrency", "id", id));
        payGradeCurrencyRepository.delete(payGradeCurrency);
    }
}
