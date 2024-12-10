package com.EmpNo.Repository;


import com.EmpNo.Models.EmpLanguage;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpLanguageRepository extends JpaRepository<EmpLanguage, Long> {
    List<EmpLanguage> findByEmpNumber(Long empNumber);
}
