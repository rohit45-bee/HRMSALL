package com.Pay_Performace.Service;



import com.Pay_Performace.Models.PerformanceReview;

import java.util.List;
import java.util.Optional;

public interface PerformanceReviewService {
    PerformanceReview savePerformanceReview(PerformanceReview performanceReview);
    List<PerformanceReview> getAllPerformanceReviews();
    Optional<PerformanceReview> getPerformanceReviewById(Long id);
    void deletePerformanceReview(Long id);
}
