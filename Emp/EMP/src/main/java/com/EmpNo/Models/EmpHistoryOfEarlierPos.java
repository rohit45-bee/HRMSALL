package com.EmpNo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_history_of_earlier_pos")
public class EmpHistoryOfEarlierPos {

    @Id
    @Column(name = "emp_number", nullable = false)
    private Long empNumber;

    @Column(name = "emp_seqno", nullable = false)
    private Integer empSeqNo;

    @Column(name = "ehoep_job_title", nullable = false)
    private String ehoepJobTitle;

    @Column(name = "ehoep_years", nullable = false)
    private Integer ehoepYears;

    // Constructors
    public EmpHistoryOfEarlierPos() {
    }

    public EmpHistoryOfEarlierPos(Long empNumber, Integer empSeqNo, String ehoepJobTitle, Integer ehoepYears) {
        this.empNumber = empNumber;
        this.empSeqNo = empSeqNo;
        this.ehoepJobTitle = ehoepJobTitle;
        this.ehoepYears = ehoepYears;
    }

    // Getters and Setters
    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public Integer getEmpSeqNo() {
        return empSeqNo;
    }

    public void setEmpSeqNo(Integer empSeqNo) {
        this.empSeqNo = empSeqNo;
    }

    public String getEhoepJobTitle() {
        return ehoepJobTitle;
    }

    public void setEhoepJobTitle(String ehoepJobTitle) {
        this.ehoepJobTitle = ehoepJobTitle;
    }

    public Integer getEhoepYears() {
        return ehoepYears;
    }

    public void setEhoepYears(Integer ehoepYears) {
        this.ehoepYears = ehoepYears;
    }

    @Override
    public String toString() {
        return "EmpHistoryOfEarlierPos{" +
                "empNumber=" + empNumber +
                ", empSeqNo=" + empSeqNo +
                ", ehoepJobTitle='" + ehoepJobTitle + '\'' +
                ", ehoepYears=" + ehoepYears +
                '}';
    }
}
