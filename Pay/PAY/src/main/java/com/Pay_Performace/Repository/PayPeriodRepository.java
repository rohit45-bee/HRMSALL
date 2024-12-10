package com.Pay_Performace.Repository;


import com.Pay_Performace.Models.PayPeriod;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayPeriodRepository extends JpaRepository<PayPeriod, Long> {
}
