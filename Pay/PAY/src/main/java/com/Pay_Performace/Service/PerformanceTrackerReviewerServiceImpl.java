package com.Pay_Performace.Service;


import com.Pay_Performace.Models.PerformanceTrackerReviewer;
import com.Pay_Performace.Repository.PerformanceTrackerReviewerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerformanceTrackerReviewerServiceImpl implements PerformanceTrackerReviewerService {

    @Autowired
    private PerformanceTrackerReviewerRepository performanceTrackerReviewerRepository;

    @Override
    public PerformanceTrackerReviewer createPerformanceTrackerReviewer(PerformanceTrackerReviewer performanceTrackerReviewer) {
        return performanceTrackerReviewerRepository.save(performanceTrackerReviewer);
    }

    @Override
    public PerformanceTrackerReviewer updatePerformanceTrackerReviewer(Long id, PerformanceTrackerReviewer performanceTrackerReviewer) {
        Optional<PerformanceTrackerReviewer> existingReviewer = performanceTrackerReviewerRepository.findById(id);
        if (existingReviewer.isPresent()) {
            PerformanceTrackerReviewer updatedReviewer = existingReviewer.get();
            updatedReviewer.setPerformanceTrackId(performanceTrackerReviewer.getPerformanceTrackId());
            updatedReviewer.setReviewerId(performanceTrackerReviewer.getReviewerId());
            updatedReviewer.setAddedDate(performanceTrackerReviewer.getAddedDate());
            updatedReviewer.setStatus(performanceTrackerReviewer.getStatus());
            return performanceTrackerReviewerRepository.save(updatedReviewer);
        }
        return null; // or throw an exception if not found
    }

    @Override
    public PerformanceTrackerReviewer getPerformanceTrackerReviewerById(Long id) {
        return performanceTrackerReviewerRepository.findById(id).orElse(null);
    }

    @Override
    public List<PerformanceTrackerReviewer> getAllPerformanceTrackerReviewers() {
        return performanceTrackerReviewerRepository.findAll();
    }

    @Override
    public void deletePerformanceTrackerReviewer(Long id) {
        performanceTrackerReviewerRepository.deleteById(id);
    }
}
