package com.Pay_Performace.Controller;


import com.Pay_Performace.Models.PerformanceTrackerReviewer;
import com.Pay_Performace.Service.PerformanceTrackerReviewerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/performance-tracker-reviewers")
public class PerformanceTrackerReviewerController {

    @Autowired
    private PerformanceTrackerReviewerService performanceTrackerReviewerService;

    @PostMapping
    public ResponseEntity<PerformanceTrackerReviewer> createPerformanceTrackerReviewer(@RequestBody PerformanceTrackerReviewer performanceTrackerReviewer) {
        PerformanceTrackerReviewer createdReviewer = performanceTrackerReviewerService.createPerformanceTrackerReviewer(performanceTrackerReviewer);
        return ResponseEntity.ok(createdReviewer);
    }

    @PutMapping("/{id}")
    public ResponseEntity<PerformanceTrackerReviewer> updatePerformanceTrackerReviewer(@PathVariable Long id, @RequestBody PerformanceTrackerReviewer performanceTrackerReviewer) {
        PerformanceTrackerReviewer updatedReviewer = performanceTrackerReviewerService.updatePerformanceTrackerReviewer(id, performanceTrackerReviewer);
        if (updatedReviewer != null) {
            return ResponseEntity.ok(updatedReviewer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/{id}")
    public ResponseEntity<PerformanceTrackerReviewer> getPerformanceTrackerReviewerById(@PathVariable Long id) {
        PerformanceTrackerReviewer reviewer = performanceTrackerReviewerService.getPerformanceTrackerReviewerById(id);
        if (reviewer != null) {
            return ResponseEntity.ok(reviewer);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<PerformanceTrackerReviewer>> getAllPerformanceTrackerReviewers() {
        List<PerformanceTrackerReviewer> reviewers = performanceTrackerReviewerService.getAllPerformanceTrackerReviewers();
        return ResponseEntity.ok(reviewers);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerformanceTrackerReviewer(@PathVariable Long id) {
        performanceTrackerReviewerService.deletePerformanceTrackerReviewer(id);
        return ResponseEntity.noContent().build();
    }
}
