package com.Pay_Performace.Repository;



import com.Pay_Performace.Models.PayGradeCurrency;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayGradeCurrencyRepository extends JpaRepository<PayGradeCurrency, Long> {
}
