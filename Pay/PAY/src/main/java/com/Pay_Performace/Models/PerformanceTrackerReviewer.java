package com.Pay_Performace.Models;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "performance_tracker_reviewer")
public class PerformanceTrackerReviewer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "performance_track_id", nullable = false)
    private Long performanceTrackId;

    @Column(name = "reviewer_id", nullable = false)
    private Long reviewerId;

    @Column(name = "added_date", nullable = false)
    private LocalDateTime addedDate;

    @Column(name = "status", length = 50)
    private String status;

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getPerformanceTrackId() {
        return performanceTrackId;
    }

    public void setPerformanceTrackId(Long performanceTrackId) {
        this.performanceTrackId = performanceTrackId;
    }

    public Long getReviewerId() {
        return reviewerId;
    }

    public void setReviewerId(Long reviewerId) {
        this.reviewerId = reviewerId;
    }

    public LocalDateTime getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(LocalDateTime addedDate) {
        this.addedDate = addedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
