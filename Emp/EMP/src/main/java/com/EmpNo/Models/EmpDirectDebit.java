package com.EmpNo.Models;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "emp_directdebit")
public class EmpDirectDebit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "salary_id", nullable = false)
    private Long salaryId;

    @Column(name = "dd_routing_num", nullable = false)
    private String ddRoutingNum;

    @Column(name = "dd_account", nullable = false)
    private String ddAccount;

    @Column(name = "dd_amount", nullable = false)
    private BigDecimal ddAmount;

    @Column(name = "dd_account_type", nullable = false)
    private String ddAccountType;

    @Column(name = "dd_transaction_type", nullable = false)
    private String ddTransactionType;

    // Constructors
    public EmpDirectDebit() {
    }

    public EmpDirectDebit(Long salaryId, String ddRoutingNum, String ddAccount, BigDecimal ddAmount, String ddAccountType, String ddTransactionType) {
        this.salaryId = salaryId;
        this.ddRoutingNum = ddRoutingNum;
        this.ddAccount = ddAccount;
        this.ddAmount = ddAmount;
        this.ddAccountType = ddAccountType;
        this.ddTransactionType = ddTransactionType;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getSalaryId() {
        return salaryId;
    }

    public void setSalaryId(Long salaryId) {
        this.salaryId = salaryId;
    }

    public String getDdRoutingNum() {
        return ddRoutingNum;
    }

    public void setDdRoutingNum(String ddRoutingNum) {
        this.ddRoutingNum = ddRoutingNum;
    }

    public String getDdAccount() {
        return ddAccount;
    }

    public void setDdAccount(String ddAccount) {
        this.ddAccount = ddAccount;
    }

    public BigDecimal getDdAmount() {
        return ddAmount;
    }

    public void setDdAmount(BigDecimal ddAmount) {
        this.ddAmount = ddAmount;
    }

    public String getDdAccountType() {
        return ddAccountType;
    }

    public void setDdAccountType(String ddAccountType) {
        this.ddAccountType = ddAccountType;
    }

    public String getDdTransactionType() {
        return ddTransactionType;
    }

    public void setDdTransactionType(String ddTransactionType) {
        this.ddTransactionType = ddTransactionType;
    }

    @Override
    public String toString() {
        return "EmpDirectDebit{" +
                "id=" + id +
                ", salaryId=" + salaryId +
                ", ddRoutingNum='" + ddRoutingNum + '\'' +
                ", ddAccount='" + ddAccount + '\'' +
                ", ddAmount=" + ddAmount +
                ", ddAccountType='" + ddAccountType + '\'' +
                ", ddTransactionType='" + ddTransactionType + '\'' +
                '}';
    }
}
