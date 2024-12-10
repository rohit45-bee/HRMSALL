package com.EmpNo.Service;



import com.EmpNo.Models.EmpDirectDebit;

import java.util.List;

public interface EmpDirectDebitService {
    EmpDirectDebit createEmpDirectDebit(EmpDirectDebit empDirectDebit);
    List<EmpDirectDebit> getAllEmpDirectDebits();
    List<EmpDirectDebit> getEmpDirectDebitsBySalaryId(Long salaryId);
    EmpDirectDebit getEmpDirectDebitById(Long id);
    EmpDirectDebit updateEmpDirectDebit(Long id, EmpDirectDebit empDirectDebit);
    void deleteEmpDirectDebitById(Long id);
}
