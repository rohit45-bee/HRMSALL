package com.EmpNo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_reporting_method")
public class EmpReportingMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "reporting_method_id")
    private Long reportingMethodId;

    @Column(name = "reporting_method_name", nullable = false)
    private String reportingMethodName;

    // Getters and Setters
    public Long getReportingMethodId() {
        return reportingMethodId;
    }

    public void setReportingMethodId(Long reportingMethodId) {
        this.reportingMethodId = reportingMethodId;
    }

    public String getReportingMethodName() {
        return reportingMethodName;
    }

    public void setReportingMethodName(String reportingMethodName) {
        this.reportingMethodName = reportingMethodName;
    }
}
