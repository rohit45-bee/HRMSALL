package com.EmpNo.Service;



import com.EmpNo.Models.EmpLicense;

import java.util.List;
import java.util.Optional;

public interface EmpLicenseService {
    EmpLicense createEmpLicense(EmpLicense empLicense);
    EmpLicense updateEmpLicense(Long empNumber, EmpLicense empLicense);
    void deleteEmpLicense(Long empNumber);
    List<EmpLicense> getAllEmpLicenses();
    Optional<EmpLicense> getEmpLicenseById(Long empNumber);
}
