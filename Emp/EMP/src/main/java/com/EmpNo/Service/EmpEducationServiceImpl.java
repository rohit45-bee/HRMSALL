package com.EmpNo.Service;


import com.EmpNo.Models.EmpEducation;
import com.EmpNo.Repository.EmpEducationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpEducationServiceImpl implements EmpEducationService {

    @Autowired
    private EmpEducationRepository empEducationRepository;

    @Override
    public EmpEducation createEmpEducation(EmpEducation empEducation) {
        return empEducationRepository.save(empEducation);
    }

    @Override
    public EmpEducation updateEmpEducation(Long id, EmpEducation empEducation) {
        Optional<EmpEducation> existingRecord = empEducationRepository.findById(id);
        if (existingRecord.isPresent()) {
            EmpEducation updatedRecord = existingRecord.get();
            updatedRecord.setEmpNumber(empEducation.getEmpNumber());
            updatedRecord.setEducationId(empEducation.getEducationId());
            updatedRecord.setInstitute(empEducation.getInstitute());
            updatedRecord.setMajor(empEducation.getMajor());
            updatedRecord.setYear(empEducation.getYear());
            updatedRecord.setScore(empEducation.getScore());
            updatedRecord.setStartDate(empEducation.getStartDate());
            updatedRecord.setEndDate(empEducation.getEndDate());
            return empEducationRepository.save(updatedRecord);
        } else {
            return null; // handle not found
        }
    }



    @Override
    public void deleteEmpEducation(Long id) {
        empEducationRepository.deleteById(id);
    }

    @Override
    public List<EmpEducation> getAllEmpEducation() {
        return empEducationRepository.findAll();
    }

    @Override
    public Optional<EmpEducation> getEmpEducationById(Long id) {
        return empEducationRepository.findById(id);
    }
}
