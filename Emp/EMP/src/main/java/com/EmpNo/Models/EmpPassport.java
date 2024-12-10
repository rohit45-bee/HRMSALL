package com.EmpNo.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "emp_passport")
public class EmpPassport {

    @Id
    @Column(name = "emp_number")
    private Long empNumber;

    @Column(name = "ep_seqno", nullable = false)
    private Long seqNo;

    @Column(name = "ep_passport_num", nullable = false)
    private String passportNum;

    @Column(name = "ep_passportissueddate")
    private LocalDate passportIssuedDate;

    @Column(name = "ep_passportexpiredate")
    private LocalDate passportExpireDate;

    @Column(name = "ep_comments")
    private String comments;

    @Column(name = "ep_passport_type_flg")
    private String passportTypeFlag;

    @Column(name = "ep_i9_status")
    private String i9Status;

    @Column(name = "ep_i9_review_date")
    private LocalDate i9ReviewDate;

    @Column(name = "cou_code")
    private String countryCode;

    // Constructors
    public EmpPassport() {
    }

    public EmpPassport(Long empNumber, Long seqNo, String passportNum, LocalDate passportIssuedDate,
                       LocalDate passportExpireDate, String comments, String passportTypeFlag,
                       String i9Status, LocalDate i9ReviewDate, String countryCode) {
        this.empNumber = empNumber;
        this.seqNo = seqNo;
        this.passportNum = passportNum;
        this.passportIssuedDate = passportIssuedDate;
        this.passportExpireDate = passportExpireDate;
        this.comments = comments;
        this.passportTypeFlag = passportTypeFlag;
        this.i9Status = i9Status;
        this.i9ReviewDate = i9ReviewDate;
        this.countryCode = countryCode;
    }

    // Getters and Setters
    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getPassportNum() {
        return passportNum;
    }

    public void setPassportNum(String passportNum) {
        this.passportNum = passportNum;
    }

    public LocalDate getPassportIssuedDate() {
        return passportIssuedDate;
    }

    public void setPassportIssuedDate(LocalDate passportIssuedDate) {
        this.passportIssuedDate = passportIssuedDate;
    }

    public LocalDate getPassportExpireDate() {
        return passportExpireDate;
    }

    public void setPassportExpireDate(LocalDate passportExpireDate) {
        this.passportExpireDate = passportExpireDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getPassportTypeFlag() {
        return passportTypeFlag;
    }

    public void setPassportTypeFlag(String passportTypeFlag) {
        this.passportTypeFlag = passportTypeFlag;
    }

    public String getI9Status() {
        return i9Status;
    }

    public void setI9Status(String i9Status) {
        this.i9Status = i9Status;
    }

    public LocalDate getI9ReviewDate() {
        return i9ReviewDate;
    }

    public void setI9ReviewDate(LocalDate i9ReviewDate) {
        this.i9ReviewDate = i9ReviewDate;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    @Override
    public String toString() {
        return "EmpPassport{" +
                "empNumber=" + empNumber +
                ", seqNo=" + seqNo +
                ", passportNum='" + passportNum + '\'' +
                ", passportIssuedDate=" + passportIssuedDate +
                ", passportExpireDate=" + passportExpireDate +
                ", comments='" + comments + '\'' +
                ", passportTypeFlag='" + passportTypeFlag + '\'' +
                ", i9Status='" + i9Status + '\'' +
                ", i9ReviewDate=" + i9ReviewDate +
                ", countryCode='" + countryCode + '\'' +
                '}';
    }
}
