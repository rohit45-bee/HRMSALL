package com.EmpNo.Service;


import com.EmpNo.Models.EmpLicense;
import com.EmpNo.Repository.EmpLicenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpLicenseServiceImpl implements EmpLicenseService {

    @Autowired
    private EmpLicenseRepository empLicenseRepository;

    @Override
    public EmpLicense createEmpLicense(EmpLicense empLicense) {
        return empLicenseRepository.save(empLicense);
    }

    @Override
    public EmpLicense updateEmpLicense(Long empNumber, EmpLicense empLicense) {
        Optional<EmpLicense> existingRecord = empLicenseRepository.findById(empNumber);
        if (existingRecord.isPresent()) {
            EmpLicense updatedRecord = existingRecord.get();
            updatedRecord.setLicenseId(empLicense.getLicenseId());
            updatedRecord.setLicenseNo(empLicense.getLicenseNo());
            updatedRecord.setLicenseIssuedDate(empLicense.getLicenseIssuedDate());
            updatedRecord.setLicenseExpiryDate(empLicense.getLicenseExpiryDate());
            return empLicenseRepository.save(updatedRecord);
        } else {
            return null; // handle not found
        }
    }



    @Override
    public void deleteEmpLicense(Long empNumber) {
        empLicenseRepository.deleteById(empNumber);
    }

    @Override
    public List<EmpLicense> getAllEmpLicenses() {
        return empLicenseRepository.findAll();
    }

    @Override
    public Optional<EmpLicense> getEmpLicenseById(Long empNumber) {
        return empLicenseRepository.findById(empNumber);
    }
}
