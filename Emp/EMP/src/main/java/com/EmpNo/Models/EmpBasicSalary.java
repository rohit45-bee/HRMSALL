package com.EmpNo.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_basicsalary")
public class EmpBasicSalary {

    @Id
    @Column(name = "emp_number")
    private String empNumber;

    @Column(name = "sal_grd_code")
    private String salGrdCode;

    @Column(name = "currency_id")
    private String currencyId;

    @Column(name = "ebsal_basic_salary")
    private Double ebsalBasicSalary;

    @Column(name = "payperiod_code")
    private String payperiodCode;

    @Column(name = "salary_component")
    private String salaryComponent;

    @Column(name = "comments")
    private String comments;

    // Getters and Setters
    public String getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(String empNumber) {
        this.empNumber = empNumber;
    }

    public String getSalGrdCode() {
        return salGrdCode;
    }

    public void setSalGrdCode(String salGrdCode) {
        this.salGrdCode = salGrdCode;
    }

    public String getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(String currencyId) {
        this.currencyId = currencyId;
    }

    public Double getEbsalBasicSalary() {
        return ebsalBasicSalary;
    }

    public void setEbsalBasicSalary(Double ebsalBasicSalary) {
        this.ebsalBasicSalary = ebsalBasicSalary;
    }

    public String getPayperiodCode() {
        return payperiodCode;
    }

    public void setPayperiodCode(String payperiodCode) {
        this.payperiodCode = payperiodCode;
    }

    public String getSalaryComponent() {
        return salaryComponent;
    }

    public void setSalaryComponent(String salaryComponent) {
        this.salaryComponent = salaryComponent;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
