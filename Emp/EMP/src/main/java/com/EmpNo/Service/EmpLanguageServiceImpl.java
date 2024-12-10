package com.EmpNo.Service;


import com.EmpNo.Configuration.ResourceNotFoundException;
import com.EmpNo.Models.EmpLanguage;
import com.EmpNo.Repository.EmpLanguageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpLanguageServiceImpl implements EmpLanguageService {

    private final EmpLanguageRepository empLanguageRepository;

    @Autowired
    public EmpLanguageServiceImpl(EmpLanguageRepository empLanguageRepository) {
        this.empLanguageRepository = empLanguageRepository;
    }

    @Override
    public EmpLanguage createEmpLanguage(EmpLanguage empLanguage) {
        return empLanguageRepository.save(empLanguage);
    }



    @Override
    public List<EmpLanguage> getAllEmpLanguages() {
        return empLanguageRepository.findAll();
    }

    @Override
    public List<EmpLanguage> getEmpLanguageByEmpNumber(Long empNumber) {
        return empLanguageRepository.findByEmpNumber(empNumber);
    }

    @Override
    @Transactional
    public EmpLanguage updateEmpLanguage(Long empNumber, EmpLanguage updatedEmpLanguage) {
        EmpLanguage existingRecord = empLanguageRepository.findByEmpNumber(empNumber)
                .stream()
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Language entry not found with empNumber: " + empNumber));

        existingRecord.setLangId(updatedEmpLanguage.getLangId());
        existingRecord.setFluency(updatedEmpLanguage.getFluency());
        existingRecord.setCompetency(updatedEmpLanguage.getCompetency());
        existingRecord.setComments(updatedEmpLanguage.getComments());

        return empLanguageRepository.save(existingRecord);
    }

    @Override
    @Transactional
    public void deleteEmpLanguageByEmpNumber(Long empNumber) {
        if (!empLanguageRepository.existsById(empNumber)) {
            throw new ResourceNotFoundException("Language entry not found with empNumber: " + empNumber);
        }
        empLanguageRepository.deleteById(empNumber);
    }
}
