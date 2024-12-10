package com.Pay_Performace.Models;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "pay_period")
public class PayPeriod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "start_date")
    private LocalDate startDate;

    @Column(name = "end_date")
    private LocalDate endDate;

    @Column(name = "close_date")
    private LocalDate closeDate;

    @Column(name = "check_date")
    private LocalDate checkDate;

    @Column(name = "timesheet_aproval_due_date")
    private LocalDate timesheetAprovalDueDate;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public LocalDate getCloseDate() {
        return closeDate;
    }

    public void setCloseDate(LocalDate closeDate) {
        this.closeDate = closeDate;
    }

    public LocalDate getCheckDate() {
        return checkDate;
    }

    public void setCheckDate(LocalDate checkDate) {
        this.checkDate = checkDate;
    }

    public LocalDate getTimesheetAprovalDueDate() {
        return timesheetAprovalDueDate;
    }

    public void setTimesheetAprovalDueDate(LocalDate timesheetAprovalDueDate) {
        this.timesheetAprovalDueDate = timesheetAprovalDueDate;
    }
}
