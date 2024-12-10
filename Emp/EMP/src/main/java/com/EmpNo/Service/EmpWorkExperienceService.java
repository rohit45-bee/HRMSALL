package com.EmpNo.Service;



import com.EmpNo.Models.EmpWorkExperience;

import java.util.List;
import java.util.Optional;

public interface EmpWorkExperienceService {
    EmpWorkExperience saveOrUpdate(EmpWorkExperience empWorkExperience);
    Optional<EmpWorkExperience> getByEmpNumber(Long empNumber);
    List<EmpWorkExperience> getAll();
    void deleteByEmpNumber(Long empNumber);
    EmpWorkExperience updateEmpWorkExperience(Long empNumber, EmpWorkExperience empWorkExperience);
}
