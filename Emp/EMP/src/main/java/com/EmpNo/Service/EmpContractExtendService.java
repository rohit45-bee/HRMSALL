package com.EmpNo.Service;


import com.EmpNo.Models.EmpContractExtend;

import java.util.List;

public interface EmpContractExtendService {
    EmpContractExtend createEmpContractExtend(EmpContractExtend empContractExtend);
    List<EmpContractExtend> getAllEmpContractExtends();
    List<EmpContractExtend> getEmpContractExtendsByEmpNumber(Long empNumber);
    EmpContractExtend getEmpContractExtendById(Long id);
    EmpContractExtend updateEmpContractExtendByEmpNumber(Long empNumber, EmpContractExtend updatedEmpContractExtend);
    void deleteEmpContractExtendById(Long id);
    void deleteEmpContractExtendByEmpNumber(Long empNumber);
}
