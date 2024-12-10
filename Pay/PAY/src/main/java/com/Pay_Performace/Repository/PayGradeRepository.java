package com.Pay_Performace.Repository;



import com.Pay_Performace.Models.PayGrade;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PayGradeRepository extends JpaRepository<PayGrade, Long> {
}
