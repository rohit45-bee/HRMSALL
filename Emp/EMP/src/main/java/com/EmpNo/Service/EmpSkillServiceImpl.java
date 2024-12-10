package com.EmpNo.Service;


import com.EmpNo.Models.EmpSkill;
import com.EmpNo.Repository.EmpSkillRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmpSkillServiceImpl implements EmpSkillService {

    @Autowired
    private EmpSkillRepository empSkillRepository;

    @Override
    public EmpSkill saveEmpSkill(EmpSkill empSkill) {
        return empSkillRepository.save(empSkill);
    }



    @Override
    public Optional<EmpSkill> getEmpSkillByEmpNumber(Long empNumber) {
        return empSkillRepository.findByEmpNumber(empNumber);
    }

    @Override
    public EmpSkill updateEmpSkill(Long empNumber, EmpSkill empSkillDetails) {
        return empSkillRepository.findByEmpNumber(empNumber)
                .map(empSkill -> {
                    empSkill.setSkillId(empSkillDetails.getSkillId());
                    empSkill.setYearsOfExp(empSkillDetails.getYearsOfExp());
                    empSkill.setComments(empSkillDetails.getComments());
                    return empSkillRepository.save(empSkill);
                }).orElseThrow(() -> new RuntimeException("Employee Skill not found with empNumber: " + empNumber));
    }

    @Override
    public void deleteEmpSkill(Long empNumber) {
        empSkillRepository.deleteByEmpNumber(empNumber);
    }
}
