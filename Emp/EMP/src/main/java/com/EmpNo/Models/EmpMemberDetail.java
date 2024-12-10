package com.EmpNo.Models;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "emp_member_detail")
public class EmpMemberDetail {

    @Id
    @Column(name = "emp_number", nullable = false)
    private Long empNumber;

    @Column(name = "membship_code", nullable = false)
    private String membshipCode;

    @Column(name = "ememb_subscript_ownership", nullable = false)
    private String emembSubscriptOwnership;

    @Column(name = "ememb_subscript_amount", nullable = false)
    private BigDecimal emembSubscriptAmount;

    @Column(name = "ememb_subs_currency", nullable = false)
    private String emembSubsCurrency;

    @Column(name = "ememb_commence_date", nullable = false)
    private LocalDate emembCommenceDate;

    @Column(name = "ememb_renewal_date", nullable = false)
    private LocalDate emembRenewalDate;

    // Constructors
    public EmpMemberDetail() {
    }

    public EmpMemberDetail(Long empNumber, String membshipCode, String emembSubscriptOwnership, BigDecimal emembSubscriptAmount, String emembSubsCurrency, LocalDate emembCommenceDate, LocalDate emembRenewalDate) {
        this.empNumber = empNumber;
        this.membshipCode = membshipCode;
        this.emembSubscriptOwnership = emembSubscriptOwnership;
        this.emembSubscriptAmount = emembSubscriptAmount;
        this.emembSubsCurrency = emembSubsCurrency;
        this.emembCommenceDate = emembCommenceDate;
        this.emembRenewalDate = emembRenewalDate;
    }

    // Getters and Setters
    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public String getMembshipCode() {
        return membshipCode;
    }

    public void setMembshipCode(String membshipCode) {
        this.membshipCode = membshipCode;
    }

    public String getEmembSubscriptOwnership() {
        return emembSubscriptOwnership;
    }

    public void setEmembSubscriptOwnership(String emembSubscriptOwnership) {
        this.emembSubscriptOwnership = emembSubscriptOwnership;
    }

    public BigDecimal getEmembSubscriptAmount() {
        return emembSubscriptAmount;
    }

    public void setEmembSubscriptAmount(BigDecimal emembSubscriptAmount) {
        this.emembSubscriptAmount = emembSubscriptAmount;
    }

    public String getEmembSubsCurrency() {
        return emembSubsCurrency;
    }

    public void setEmembSubsCurrency(String emembSubsCurrency) {
        this.emembSubsCurrency = emembSubsCurrency;
    }

    public LocalDate getEmembCommenceDate() {
        return emembCommenceDate;
    }

    public void setEmembCommenceDate(LocalDate emembCommenceDate) {
        this.emembCommenceDate = emembCommenceDate;
    }

    public LocalDate getEmembRenewalDate() {
        return emembRenewalDate;
    }

    public void setEmembRenewalDate(LocalDate emembRenewalDate) {
        this.emembRenewalDate = emembRenewalDate;
    }

    @Override
    public String toString() {
        return "EmpMemberDetail{" +
                "empNumber=" + empNumber +
                ", membshipCode='" + membshipCode + '\'' +
                ", emembSubscriptOwnership='" + emembSubscriptOwnership + '\'' +
                ", emembSubscriptAmount=" + emembSubscriptAmount +
                ", emembSubsCurrency='" + emembSubsCurrency + '\'' +
                ", emembCommenceDate=" + emembCommenceDate +
                ", emembRenewalDate=" + emembRenewalDate +
                '}';
    }
}
