package com.EmpNo.Service;



import com.EmpNo.Models.EmpReportingMethod;

import java.util.List;
import java.util.Optional;

public interface EmpReportingMethodService {
    EmpReportingMethod createEmpReportingMethod(EmpReportingMethod empReportingMethod);
    EmpReportingMethod updateEmpReportingMethod(Long reportingMethodId, EmpReportingMethod empReportingMethod);
    void deleteEmpReportingMethod(Long reportingMethodId);
    List<EmpReportingMethod> getAllEmpReportingMethods();
    Optional<EmpReportingMethod> getEmpReportingMethodById(Long reportingMethodId);
}
