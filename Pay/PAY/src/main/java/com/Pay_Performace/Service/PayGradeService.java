package com.Pay_Performace.Service;




import com.Pay_Performace.Models.PayGrade;

import java.util.List;

public interface PayGradeService {
    PayGrade createPayGrade(PayGrade payGrade);
    PayGrade updatePayGrade(Long id, PayGrade payGrade);
    PayGrade getPayGradeById(Long id);
    List<PayGrade> getAllPayGrades();
    void deletePayGrade(Long id);
}
