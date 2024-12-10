package com.EmpNo.Service;



import com.EmpNo.Models.EmpPassport;

import java.util.List;

public interface EmpPassportService {
    EmpPassport createEmpPassport(EmpPassport empPassport);
    List<EmpPassport> getAllEmpPassports();
    EmpPassport getEmpPassportByEmpNumber(Long empNumber);
    EmpPassport updateEmpPassportByEmpNumber(Long empNumber, EmpPassport updatedEmpPassport);
    void deleteEmpPassportByEmpNumber(Long empNumber);
}
