package com.EmpNo.Service;


import com.EmpNo.Models.EmpChildren;

import java.util.List;

public interface EmpChildrenService {
    EmpChildren createEmpChildren(EmpChildren empChildren);
    List<EmpChildren> getAllEmpChildren();
    List<EmpChildren> getEmpChildrenByEmpNumber(Long empNumber);
    EmpChildren getEmpChildrenById(Long id);
    EmpChildren updateEmpChildrenByEmpNumber(Long empNumber, EmpChildren updatedEmpChildren);
    void deleteEmpChildrenById(Long id);
    void deleteEmpChildrenByEmpNumber(Long empNumber);
}
