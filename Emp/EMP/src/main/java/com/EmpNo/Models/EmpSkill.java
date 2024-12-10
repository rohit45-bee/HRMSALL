package com.EmpNo.Models;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_skill")
public class EmpSkill {

    @Id
    private Long empNumber; // Primary key field

    private Long skillId;
    private Integer yearsOfExp;
    private String comments;

    // Getters and setters
    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public Long getSkillId() {
        return skillId;
    }

    public void setSkillId(Long skillId) {
        this.skillId = skillId;
    }

    public Integer getYearsOfExp() {
        return yearsOfExp;
    }

    public void setYearsOfExp(Integer yearsOfExp) {
        this.yearsOfExp = yearsOfExp;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
