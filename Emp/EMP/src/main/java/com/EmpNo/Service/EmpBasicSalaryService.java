package com.EmpNo.Service;


import com.EmpNo.Models.EmpBasicSalary;

import java.util.List;

public interface EmpBasicSalaryService {
    EmpBasicSalary createEmpBasicSalary(EmpBasicSalary empBasicSalary);
    EmpBasicSalary getEmpBasicSalaryByEmpNumber(String empNumber);
    List<EmpBasicSalary> getAllEmpBasicSalaries();
    EmpBasicSalary updateEmpBasicSalary(String empNumber, EmpBasicSalary empBasicSalary);
    void deleteEmpBasicSalary(String empNumber);
}
