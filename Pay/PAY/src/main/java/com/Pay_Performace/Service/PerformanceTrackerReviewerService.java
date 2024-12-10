package com.Pay_Performace.Service;


import com.Pay_Performace.Models.PerformanceTrackerReviewer;

import java.util.List;

public interface PerformanceTrackerReviewerService {
    PerformanceTrackerReviewer createPerformanceTrackerReviewer(PerformanceTrackerReviewer performanceTrackerReviewer);
    PerformanceTrackerReviewer updatePerformanceTrackerReviewer(Long id, PerformanceTrackerReviewer performanceTrackerReviewer);
    PerformanceTrackerReviewer getPerformanceTrackerReviewerById(Long id);
    List<PerformanceTrackerReviewer> getAllPerformanceTrackerReviewers();
    void deletePerformanceTrackerReviewer(Long id);
}
