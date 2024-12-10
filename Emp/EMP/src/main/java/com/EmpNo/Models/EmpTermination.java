package com.EmpNo.Models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "emp_termination")
public class EmpTermination {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "emp_number", nullable = false)
    private Long empNumber;

    @Column(name = "reason_id", nullable = false)
    private Long reasonId;

    @Column(name = "termination_date", nullable = false)
    private LocalDate terminationDate;

    @Column(name = "note")
    private String note;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public Long getReasonId() {
        return reasonId;
    }

    public void setReasonId(Long reasonId) {
        this.reasonId = reasonId;
    }

    public LocalDate getTerminationDate() {
        return terminationDate;
    }

    public void setTerminationDate(LocalDate terminationDate) {
        this.terminationDate = terminationDate;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}
