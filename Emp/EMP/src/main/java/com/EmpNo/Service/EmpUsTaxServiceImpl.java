package com.EmpNo.Service;


import com.EmpNo.Models.EmpUsTax;
import com.EmpNo.Repository.EmpUsTaxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpUsTaxServiceImpl implements EmpUsTaxService {

    @Autowired
    private EmpUsTaxRepository empUsTaxRepository;

    @Override
    public EmpUsTax getByEmpNumber(Long empNumber) {
        return empUsTaxRepository.findById(empNumber).orElse(null);
    }

    @Override
    public List<EmpUsTax> getAll() {
        return empUsTaxRepository.findAll();
    }



    @Override
    public EmpUsTax saveOrUpdate(EmpUsTax empUsTax) {
        return empUsTaxRepository.save(empUsTax);
    }

    @Override
    public EmpUsTax updateEmpUsTax(Long empNumber, EmpUsTax empUsTax) {
        Optional<EmpUsTax> existingEmpUsTax = empUsTaxRepository.findById(empNumber);
        if (existingEmpUsTax.isPresent()) {
            EmpUsTax taxToUpdate = existingEmpUsTax.get();
            // Update fields here
            taxToUpdate.setTaxFederalStatus(empUsTax.getTaxFederalStatus());
            taxToUpdate.setTaxFederalExceptions(empUsTax.getTaxFederalExceptions());
            taxToUpdate.setTaxState(empUsTax.getTaxState());
            taxToUpdate.setTaxStateStatus(empUsTax.getTaxStateStatus());
            taxToUpdate.setTaxStateExceptions(empUsTax.getTaxStateExceptions());
            taxToUpdate.setTaxUnempState(empUsTax.getTaxUnempState());
            taxToUpdate.setTaxWorkState(empUsTax.getTaxWorkState());
            return empUsTaxRepository.save(taxToUpdate);
        } else {
            throw new RuntimeException("Employee US Tax not found for empNumber: " + empNumber);
        }
    }

    @Override
    public void deleteByEmpNumber(Long empNumber) {
        empUsTaxRepository.deleteById(empNumber);
    }
}
