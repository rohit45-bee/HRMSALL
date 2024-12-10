package com.EmpNo.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "emp_work_experience")
@JsonIgnoreProperties(ignoreUnknown = true)
public class EmpWorkExperience {

    @Id
    private Long empNumber; // Primary key field

    @Column(name = "eexp_seqno")
    private Integer sequenceNumber;

    @Column(name = "eexp_employer")
    private String employer;

    @Column(name = "eexp_jobtit")
    private String jobTitle;

    @Column(name = "eexp_from_date")
    private String fromDate;

    @Column(name = "eexp_to_date")
    private String toDate;

    @Column(name = "eexp_comments")
    private String comments;

    @Column(name = "eexp_internal")
    private Boolean internal;

    // Getters and setters
    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public Integer getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(Integer sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getEmployer() {
        return employer;
    }

    public void setEmployer(String employer) {
        this.employer = employer;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getFromDate() {
        return fromDate;
    }

    public void setFromDate(String fromDate) {
        this.fromDate = fromDate;
    }

    public String getToDate() {
        return toDate;
    }

    public void setToDate(String toDate) {
        this.toDate = toDate;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public Boolean getInternal() {
        return internal;
    }

    public void setInternal(Boolean internal) {
        this.internal = internal;
    }
}
