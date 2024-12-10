package com.Pay_Performace.Service;



import com.Pay_Performace.Configuration.ResourceNotFoundException;
import com.Pay_Performace.Models.PayGrade;
import com.Pay_Performace.Repository.PayGradeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PayGradeServiceImpl implements PayGradeService {

    @Autowired
    private PayGradeRepository payGradeRepository;

    @Override
    public PayGrade createPayGrade(PayGrade payGrade) {
        return payGradeRepository.save(payGrade);
    }

    @Override
    public PayGrade updatePayGrade(Long id, PayGrade payGrade) {
        PayGrade existingPayGrade = payGradeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("PayGrade", "id", id));

        existingPayGrade.setName(payGrade.getName());
        existingPayGrade.setUserId(payGrade.getUserId());
        return payGradeRepository.save(existingPayGrade);
    }



    @Override
    public PayGrade getPayGradeById(Long id) {
        return payGradeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("PayGrade", "id", id));
    }

    @Override
    public List<PayGrade> getAllPayGrades() {
        return payGradeRepository.findAll();
    }

    @Override
    public void deletePayGrade(Long id) {
        PayGrade payGrade = payGradeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("PayGrade", "id", id));
        payGradeRepository.delete(payGrade);
    }
}
