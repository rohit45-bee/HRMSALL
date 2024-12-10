package com.EmpNo.Service;



import com.EmpNo.Models.EmpSkill;

import java.util.Optional;

public interface EmpSkillService {
    EmpSkill saveEmpSkill(EmpSkill empSkill);

    Optional<EmpSkill> getEmpSkillByEmpNumber(Long empNumber);

    EmpSkill updateEmpSkill(Long empNumber, EmpSkill empSkillDetails);

    void deleteEmpSkill(Long empNumber);
}
