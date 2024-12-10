package com.EmpNo.Service;


import com.EmpNo.Models.EmpWorkExperience;
import com.EmpNo.Repository.EmpWorkExperienceRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpWorkExperienceServiceImpl implements EmpWorkExperienceService {

    @Autowired
    private EmpWorkExperienceRepository empWorkExperienceRepository;

    @Override
    public EmpWorkExperience saveOrUpdate(EmpWorkExperience empWorkExperience) {
        return empWorkExperienceRepository.save(empWorkExperience);
    }



    @Override
    public Optional<EmpWorkExperience> getByEmpNumber(Long empNumber) {
        return empWorkExperienceRepository.findById(empNumber);
    }

    @Override
    public List<EmpWorkExperience> getAll() {
        return empWorkExperienceRepository.findAll();
    }

    @Override
    public void deleteByEmpNumber(Long empNumber) {
        empWorkExperienceRepository.deleteById(empNumber);
    }

    @Override
    public EmpWorkExperience updateEmpWorkExperience(Long empNumber, EmpWorkExperience empWorkExperience) {
        if (empWorkExperienceRepository.existsById(empNumber)) {
            empWorkExperience.setEmpNumber(empNumber); // Ensure the ID matches
            return empWorkExperienceRepository.save(empWorkExperience);
        } else {
            throw new RuntimeException("EmpWorkExperience with empNumber " + empNumber + " not found.");
        }
    }
}
