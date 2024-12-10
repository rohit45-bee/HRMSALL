package com.EmpNo.Service;


import com.EmpNo.Models.EmpBasicSalary;
import com.EmpNo.Repository.EmpBasicSalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpBasicSalaryServiceImpl implements EmpBasicSalaryService {

    @Autowired
    private EmpBasicSalaryRepository empBasicSalaryRepository;

    @Override
    public EmpBasicSalary createEmpBasicSalary(EmpBasicSalary empBasicSalary) {
        return empBasicSalaryRepository.save(empBasicSalary);
    }



    @Override
    public EmpBasicSalary getEmpBasicSalaryByEmpNumber(String empNumber) {
        return empBasicSalaryRepository.findById(empNumber)
                .orElseThrow(() -> new RuntimeException("EmpBasicSalary not found with empNumber " + empNumber));
    }

    @Override
    public List<EmpBasicSalary> getAllEmpBasicSalaries() {
        return empBasicSalaryRepository.findAll();
    }

    @Override
    public EmpBasicSalary updateEmpBasicSalary(String empNumber, EmpBasicSalary empBasicSalary) {
        Optional<EmpBasicSalary> existingEmpBasicSalary = empBasicSalaryRepository.findById(empNumber);
        if (existingEmpBasicSalary.isPresent()) {
            EmpBasicSalary updatedEmpBasicSalary = existingEmpBasicSalary.get();
            updatedEmpBasicSalary.setSalGrdCode(empBasicSalary.getSalGrdCode());
            updatedEmpBasicSalary.setCurrencyId(empBasicSalary.getCurrencyId());
            updatedEmpBasicSalary.setEbsalBasicSalary(empBasicSalary.getEbsalBasicSalary());
            updatedEmpBasicSalary.setPayperiodCode(empBasicSalary.getPayperiodCode());
            updatedEmpBasicSalary.setSalaryComponent(empBasicSalary.getSalaryComponent());
            updatedEmpBasicSalary.setComments(empBasicSalary.getComments());
            return empBasicSalaryRepository.save(updatedEmpBasicSalary);
        } else {
            throw new RuntimeException("EmpBasicSalary not found with empNumber " + empNumber);
        }
    }

    @Override
    public void deleteEmpBasicSalary(String empNumber) {
        empBasicSalaryRepository.deleteById(empNumber);
    }
}
