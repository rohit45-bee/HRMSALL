package com.EmpNo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_emergency_contacts")
public class EmpEmergencyContact {

    @Id
    @Column(name = "emp_number", nullable = false)
    private Long empNumber;

    @Column(name = "eec_seqno", nullable = false)
    private Integer eecSeqNo;

    @Column(name = "eec_name", nullable = false)
    private String eecName;

    @Column(name = "eec_relationship", nullable = false)
    private String eecRelationship;

    @Column(name = "eec_home_no")
    private String eecHomeNo;

    @Column(name = "eec_mobile_no")
    private String eecMobileNo;

    @Column(name = "eec_office_no")
    private String eecOfficeNo;

    // Constructors
    public EmpEmergencyContact() {
    }

    public EmpEmergencyContact(Long empNumber, Integer eecSeqNo, String eecName, String eecRelationship, String eecHomeNo, String eecMobileNo, String eecOfficeNo) {
        this.empNumber = empNumber;
        this.eecSeqNo = eecSeqNo;
        this.eecName = eecName;
        this.eecRelationship = eecRelationship;
        this.eecHomeNo = eecHomeNo;
        this.eecMobileNo = eecMobileNo;
        this.eecOfficeNo = eecOfficeNo;
    }

    // Getters and Setters
    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public Integer getEecSeqNo() {
        return eecSeqNo;
    }

    public void setEecSeqNo(Integer eecSeqNo) {
        this.eecSeqNo = eecSeqNo;
    }

    public String getEecName() {
        return eecName;
    }

    public void setEecName(String eecName) {
        this.eecName = eecName;
    }

    public String getEecRelationship() {
        return eecRelationship;
    }

    public void setEecRelationship(String eecRelationship) {
        this.eecRelationship = eecRelationship;
    }

    public String getEecHomeNo() {
        return eecHomeNo;
    }

    public void setEecHomeNo(String eecHomeNo) {
        this.eecHomeNo = eecHomeNo;
    }

    public String getEecMobileNo() {
        return eecMobileNo;
    }

    public void setEecMobileNo(String eecMobileNo) {
        this.eecMobileNo = eecMobileNo;
    }

    public String getEecOfficeNo() {
        return eecOfficeNo;
    }

    public void setEecOfficeNo(String eecOfficeNo) {
        this.eecOfficeNo = eecOfficeNo;
    }

    @Override
    public String toString() {
        return "EmpEmergencyContact{" +
                "empNumber=" + empNumber +
                ", eecSeqNo=" + eecSeqNo +
                ", eecName='" + eecName + '\'' +
                ", eecRelationship='" + eecRelationship + '\'' +
                ", eecHomeNo='" + eecHomeNo + '\'' +
                ", eecMobileNo='" + eecMobileNo + '\'' +
                ", eecOfficeNo='" + eecOfficeNo + '\'' +
                '}';
    }
}
