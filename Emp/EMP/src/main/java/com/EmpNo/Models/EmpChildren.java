package com.EmpNo.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "emp_children")
public class EmpChildren {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long empNumber;

    @Column(nullable = false)
    private Integer ecSeqno;

    @Column(nullable = false)
    private String ecName;

    @Column(nullable = false)
    private LocalDate ecDateOfBirth;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public Integer getEcSeqno() {
        return ecSeqno;
    }

    public void setEcSeqno(Integer ecSeqno) {
        this.ecSeqno = ecSeqno;
    }

    public String getEcName() {
        return ecName;
    }

    public void setEcName(String ecName) {
        this.ecName = ecName;
    }

    public LocalDate getEcDateOfBirth() {
        return ecDateOfBirth;
    }

    public void setEcDateOfBirth(LocalDate ecDateOfBirth) {
        this.ecDateOfBirth = ecDateOfBirth;
    }
}
