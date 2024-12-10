package com.Pay_Performace.Service;


import com.Pay_Performace.Models.PerformanceReview;
import com.Pay_Performace.Repository.PerformanceReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerformanceReviewServiceImpl implements PerformanceReviewService {

    @Autowired
    private PerformanceReviewRepository performanceReviewRepository;

    @Override
    public PerformanceReview savePerformanceReview(PerformanceReview performanceReview) {
        return performanceReviewRepository.save(performanceReview);
    }



    @Override
    public List<PerformanceReview> getAllPerformanceReviews() {
        return performanceReviewRepository.findAll();
    }

    @Override
    public Optional<PerformanceReview> getPerformanceReviewById(Long id) {
        return performanceReviewRepository.findById(id);
    }

    @Override
    public void deletePerformanceReview(Long id) {
        performanceReviewRepository.deleteById(id);
    }
}
