package com.EmpNo.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "emp_contract_extend")
public class EmpContractExtend {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "econ_extend_id")
    private Long id;

    @Column(name = "emp_number", nullable = false)
    private Long empNumber;

    @Column(name = "econ_extend_start_date", nullable = false)
    private LocalDate extendStartDate;

    @Column(name = "econ_extend_end_date", nullable = false)
    private LocalDate extendEndDate;

    // Constructors
    public EmpContractExtend() {
    }

    public EmpContractExtend(Long empNumber, LocalDate extendStartDate, LocalDate extendEndDate) {
        this.empNumber = empNumber;
        this.extendStartDate = extendStartDate;
        this.extendEndDate = extendEndDate;
    }

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

    public LocalDate getExtendStartDate() {
        return extendStartDate;
    }

    public void setExtendStartDate(LocalDate extendStartDate) {
        this.extendStartDate = extendStartDate;
    }

    public LocalDate getExtendEndDate() {
        return extendEndDate;
    }

    public void setExtendEndDate(LocalDate extendEndDate) {
        this.extendEndDate = extendEndDate;
    }

    @Override
    public String toString() {
        return "EmpContractExtend{" +
                "id=" + id +
                ", empNumber=" + empNumber +
                ", extendStartDate=" + extendStartDate +
                ", extendEndDate=" + extendEndDate +
                '}';
    }
}
