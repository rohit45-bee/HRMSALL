package com.EmpNo.Service;


import com.EmpNo.Models.EmpReportingMethod;
import com.EmpNo.Repository.EmpReportingMethodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpReportingMethodServiceImpl implements EmpReportingMethodService {

    @Autowired
    private EmpReportingMethodRepository empReportingMethodRepository;

    @Override
    public EmpReportingMethod createEmpReportingMethod(EmpReportingMethod empReportingMethod) {
        return empReportingMethodRepository.save(empReportingMethod);
    }

    @Override
    public EmpReportingMethod updateEmpReportingMethod(Long reportingMethodId, EmpReportingMethod empReportingMethod) {
        Optional<EmpReportingMethod> existingMethod = empReportingMethodRepository.findById(reportingMethodId);
        if (existingMethod.isPresent()) {
            EmpReportingMethod updatedMethod = existingMethod.get();
            updatedMethod.setReportingMethodName(empReportingMethod.getReportingMethodName());
            return empReportingMethodRepository.save(updatedMethod);
        } else {
            return null; // handle not found
        }
    }


    @Override
    public void deleteEmpReportingMethod(Long reportingMethodId) {
        empReportingMethodRepository.deleteById(reportingMethodId);
    }

    @Override
    public List<EmpReportingMethod> getAllEmpReportingMethods() {
        return empReportingMethodRepository.findAll();
    }

    @Override
    public Optional<EmpReportingMethod> getEmpReportingMethodById(Long reportingMethodId) {
        return empReportingMethodRepository.findById(reportingMethodId);
    }
}
