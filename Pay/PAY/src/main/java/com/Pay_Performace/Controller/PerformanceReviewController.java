package com.Pay_Performace.Controller;


import com.Pay_Performace.Models.PerformanceReview;
import com.Pay_Performace.Service.PerformanceReviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/performance-reviews")
public class PerformanceReviewController {

    @Autowired
    private PerformanceReviewService performanceReviewService;

    @PostMapping
    public ResponseEntity<PerformanceReview> createPerformanceReview(@RequestBody PerformanceReview performanceReview) {
        return ResponseEntity.ok(performanceReviewService.savePerformanceReview(performanceReview));
    }

    @GetMapping
    public ResponseEntity<List<PerformanceReview>> getAllPerformanceReviews() {
        return ResponseEntity.ok(performanceReviewService.getAllPerformanceReviews());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PerformanceReview> getPerformanceReviewById(@PathVariable Long id) {
        Optional<PerformanceReview> performanceReview = performanceReviewService.getPerformanceReviewById(id);
        return performanceReview.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PerformanceReview> updatePerformanceReview(@PathVariable Long id, @RequestBody PerformanceReview performanceReview) {
        Optional<PerformanceReview> existingPerformanceReview = performanceReviewService.getPerformanceReviewById(id);
        if (existingPerformanceReview.isPresent()) {
            PerformanceReview updatedPerformanceReview = existingPerformanceReview.get();
            updatedPerformanceReview.setStatusId(performanceReview.getStatusId());
            updatedPerformanceReview.setEmployeeNumber(performanceReview.getEmployeeNumber());
            updatedPerformanceReview.setWorkPeriodStart(performanceReview.getWorkPeriodStart());
            updatedPerformanceReview.setWorkPeriodEnd(performanceReview.getWorkPeriodEnd());
            updatedPerformanceReview.setJobTitleCode(performanceReview.getJobTitleCode());
            updatedPerformanceReview.setDepartmentId(performanceReview.getDepartmentId());
            updatedPerformanceReview.setDueDate(performanceReview.getDueDate());
            updatedPerformanceReview.setCompletedDate(performanceReview.getCompletedDate());
            updatedPerformanceReview.setActivatedDate(performanceReview.getActivatedDate());
            updatedPerformanceReview.setFinalComment(performanceReview.getFinalComment());
            updatedPerformanceReview.setFinalRate(performanceReview.getFinalRate());
            return ResponseEntity.ok(performanceReviewService.savePerformanceReview(updatedPerformanceReview));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerformanceReview(@PathVariable Long id) {
        performanceReviewService.deletePerformanceReview(id);
        return ResponseEntity.noContent().build();
    }
}
