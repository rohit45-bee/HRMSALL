package com.EmpNo.Repository;


import com.EmpNo.Models.EmpSkill;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmpSkillRepository extends JpaRepository<EmpSkill, Long> {
    Optional<EmpSkill> findByEmpNumber(Long empNumber);

    void deleteByEmpNumber(Long empNumber);
}
