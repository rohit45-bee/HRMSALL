package com.EmpNo.Models;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_us_tax")
public class EmpUsTax {

    @Id
    private Long empNumber;

    private String taxFederalStatus;
    private Integer taxFederalExceptions;

    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public String getTaxFederalStatus() {
        return taxFederalStatus;
    }

    public void setTaxFederalStatus(String taxFederalStatus) {
        this.taxFederalStatus = taxFederalStatus;
    }

    public Integer getTaxFederalExceptions() {
        return taxFederalExceptions;
    }

    public void setTaxFederalExceptions(Integer taxFederalExceptions) {
        this.taxFederalExceptions = taxFederalExceptions;
    }

    public String getTaxState() {
        return taxState;
    }

    public void setTaxState(String taxState) {
        this.taxState = taxState;
    }

    public String getTaxStateStatus() {
        return taxStateStatus;
    }

    public void setTaxStateStatus(String taxStateStatus) {
        this.taxStateStatus = taxStateStatus;
    }

    public Integer getTaxStateExceptions() {
        return taxStateExceptions;
    }

    public void setTaxStateExceptions(Integer taxStateExceptions) {
        this.taxStateExceptions = taxStateExceptions;
    }

    public String getTaxUnempState() {
        return taxUnempState;
    }

    public void setTaxUnempState(String taxUnempState) {
        this.taxUnempState = taxUnempState;
    }

    public String getTaxWorkState() {
        return taxWorkState;
    }

    public void setTaxWorkState(String taxWorkState) {
        this.taxWorkState = taxWorkState;
    }

    private String taxState;
    private String taxStateStatus;
    private Integer taxStateExceptions;
    private String taxUnempState;
    private String taxWorkState;

    // Getters and Setters
    // Constructors (if needed)
}
