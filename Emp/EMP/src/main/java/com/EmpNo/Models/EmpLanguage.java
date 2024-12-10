package com.EmpNo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_language")
public class EmpLanguage {

    @Id
    @Column(name = "emp_number", nullable = false)
    private Long empNumber;

    @Column(name = "lang_id", nullable = false)
    private Integer langId;

    @Column(name = "fluency", nullable = false)
    private String fluency;

    @Column(name = "competency", nullable = false)
    private String competency;

    @Column(name = "comments")
    private String comments;

    // Constructors
    public EmpLanguage() {
    }

    public EmpLanguage(Long empNumber, Integer langId, String fluency, String competency, String comments) {
        this.empNumber = empNumber;
        this.langId = langId;
        this.fluency = fluency;
        this.competency = competency;
        this.comments = comments;
    }

    // Getters and Setters
    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public Integer getLangId() {
        return langId;
    }

    public void setLangId(Integer langId) {
        this.langId = langId;
    }

    public String getFluency() {
        return fluency;
    }

    public void setFluency(String fluency) {
        this.fluency = fluency;
    }

    public String getCompetency() {
        return competency;
    }

    public void setCompetency(String competency) {
        this.competency = competency;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    @Override
    public String toString() {
        return "EmpLanguage{" +
                "empNumber=" + empNumber +
                ", langId=" + langId +
                ", fluency='" + fluency + '\'' +
                ", competency='" + competency + '\'' +
                ", comments='" + comments + '\'' +
                '}';
    }
}
