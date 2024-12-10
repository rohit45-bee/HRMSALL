package com.EmpNo.Service;



import com.EmpNo.Models.EmpUsTax;

import java.util.List;

public interface EmpUsTaxService {
    EmpUsTax getByEmpNumber(Long empNumber);
    List<EmpUsTax> getAll();
    EmpUsTax saveOrUpdate(EmpUsTax empUsTax);
    EmpUsTax updateEmpUsTax(Long empNumber, EmpUsTax empUsTax);
    void deleteByEmpNumber(Long empNumber);
}
