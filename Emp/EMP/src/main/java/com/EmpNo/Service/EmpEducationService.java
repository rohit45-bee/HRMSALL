package com.EmpNo.Service;



import com.EmpNo.Models.EmpEducation;

import java.util.List;
import java.util.Optional;

public interface EmpEducationService {
    EmpEducation createEmpEducation(EmpEducation empEducation);
    EmpEducation updateEmpEducation(Long id, EmpEducation empEducation);
    void deleteEmpEducation(Long id);
    List<EmpEducation> getAllEmpEducation();
    Optional<EmpEducation> getEmpEducationById(Long id);
}
