package com.EmpNo.Service;



import com.EmpNo.Models.EmpMemberDetail;

import java.util.List;

public interface EmpMemberDetailService {
    EmpMemberDetail createEmpMemberDetail(EmpMemberDetail empMemberDetail);
    List<EmpMemberDetail> getAllEmpMemberDetails();
    List<EmpMemberDetail> getEmpMemberDetailByEmpNumber(Long empNumber);
    EmpMemberDetail updateEmpMemberDetail(Long empNumber, EmpMemberDetail updatedEmpMemberDetail);
    void deleteEmpMemberDetailByEmpNumber(Long empNumber);
}
