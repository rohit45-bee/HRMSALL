package com.EmpNo.Models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "emp_license")
public class EmpLicense {

    @Id
    @Column(name = "emp_number")
    private Long empNumber; // Using emp_number as the primary key

    @Column(name = "license_id")
    private Long licenseId;

    @Column(name = "license_no")
    private String licenseNo;

    @Column(name = "license_issued_date")
    @Temporal(TemporalType.DATE)
    private Date licenseIssuedDate;

    @Column(name = "license_expiry_date")
    @Temporal(TemporalType.DATE)
    private Date licenseExpiryDate;

    // Getters and Setters
    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public Long getLicenseId() {
        return licenseId;
    }

    public void setLicenseId(Long licenseId) {
        this.licenseId = licenseId;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }

    public Date getLicenseIssuedDate() {
        return licenseIssuedDate;
    }

    public void setLicenseIssuedDate(Date licenseIssuedDate) {
        this.licenseIssuedDate = licenseIssuedDate;
    }

    public Date getLicenseExpiryDate() {
        return licenseExpiryDate;
    }

    public void setLicenseExpiryDate(Date licenseExpiryDate) {
        this.licenseExpiryDate = licenseExpiryDate;
    }
}
