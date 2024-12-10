package com.Pay_Performace.Service;





import com.Pay_Performace.Models.PayGradeCurrency;

import java.util.List;

public interface PayGradeCurrencyService {
    PayGradeCurrency createPayGradeCurrency(PayGradeCurrency payGradeCurrency);
    PayGradeCurrency updatePayGradeCurrency(Long id, PayGradeCurrency payGradeCurrency);
    PayGradeCurrency getPayGradeCurrencyById(Long id);
    List<PayGradeCurrency> getAllPayGradeCurrencies();
    void deletePayGradeCurrency(Long id);
}
