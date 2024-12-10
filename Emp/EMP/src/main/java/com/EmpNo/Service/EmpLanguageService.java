package com.EmpNo.Service;



import com.EmpNo.Models.EmpLanguage;

import java.util.List;

public interface EmpLanguageService {
    EmpLanguage createEmpLanguage(EmpLanguage empLanguage);
    List<EmpLanguage> getAllEmpLanguages();
    List<EmpLanguage> getEmpLanguageByEmpNumber(Long empNumber);
    EmpLanguage updateEmpLanguage(Long empNumber, EmpLanguage updatedEmpLanguage);
    void deleteEmpLanguageByEmpNumber(Long empNumber);
}
