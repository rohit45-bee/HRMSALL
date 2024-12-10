package com.EmpNo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_locations")
public class EmpLocations {

    @Id
    @Column(name = "emp_number", nullable = false)
    private Long empNumber;

    @Column(name = "location_id", nullable = false)
    private Integer locationId;

    // Constructors
    public EmpLocations() {
    }

    public EmpLocations(Long empNumber, Integer locationId) {
        this.empNumber = empNumber;
        this.locationId = locationId;
    }

    // Getters and Setters
    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public Integer getLocationId() {
        return locationId;
    }

    public void setLocationId(Integer locationId) {
        this.locationId = locationId;
    }

    @Override
    public String toString() {
        return "EmpLocations{" +
                "empNumber=" + empNumber +
                ", locationId=" + locationId +
                '}';
    }
}
