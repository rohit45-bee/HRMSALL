package com.Pay_Performace.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "pay_grade_currency")
public class PayGradeCurrency {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "pay_grade_id", nullable = false)
    private Long payGradeId;

    @Column(name = "currency_id", nullable = false)
    private Long currencyId;

    @Column(name = "min_salary", nullable = false)
    private Double minSalary;

    @Column(name = "max_salary", nullable = false)
    private Double maxSalary;

    // Constructors
    public PayGradeCurrency() {}

    public PayGradeCurrency(Long payGradeId, Long currencyId, Double minSalary, Double maxSalary) {
        this.payGradeId = payGradeId;
        this.currencyId = currencyId;
        this.minSalary = minSalary;
        this.maxSalary = maxSalary;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPayGradeId() {
        return payGradeId;
    }

    public void setPayGradeId(Long payGradeId) {
        this.payGradeId = payGradeId;
    }

    public Long getCurrencyId() {
        return currencyId;
    }

    public void setCurrencyId(Long currencyId) {
        this.currencyId = currencyId;
    }

    public Double getMinSalary() {
        return minSalary;
    }

    public void setMinSalary(Double minSalary) {
        this.minSalary = minSalary;
    }

    public Double getMaxSalary() {
        return maxSalary;
    }

    public void setMaxSalary(Double maxSalary) {
        this.maxSalary = maxSalary;
    }
}
