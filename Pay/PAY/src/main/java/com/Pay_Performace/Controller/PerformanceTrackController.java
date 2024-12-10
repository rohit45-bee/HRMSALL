package com.Pay_Performace.Controller;


import com.Pay_Performace.Models.PerformanceTrack;
import com.Pay_Performace.Service.PerformanceTrackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/performance-tracks")
public class PerformanceTrackController {

    @Autowired
    private PerformanceTrackService performanceTrackService;

    @PostMapping
    public ResponseEntity<PerformanceTrack> createPerformanceTrack(@RequestBody PerformanceTrack performanceTrack) {
        return ResponseEntity.ok(performanceTrackService.savePerformanceTrack(performanceTrack));
    }

    @GetMapping
    public ResponseEntity<List<PerformanceTrack>> getAllPerformanceTracks() {
        return ResponseEntity.ok(performanceTrackService.getAllPerformanceTracks());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PerformanceTrack> getPerformanceTrackById(@PathVariable Long id) {
        Optional<PerformanceTrack> performanceTrack = performanceTrackService.getPerformanceTrackById(id);
        return performanceTrack.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<PerformanceTrack> updatePerformanceTrack(@PathVariable Long id, @RequestBody PerformanceTrack performanceTrack) {
        Optional<PerformanceTrack> existingPerformanceTrack = performanceTrackService.getPerformanceTrackById(id);
        if (existingPerformanceTrack.isPresent()) {
            PerformanceTrack updatedPerformanceTrack = existingPerformanceTrack.get();
            updatedPerformanceTrack.setEmpNumber(performanceTrack.getEmpNumber());
            updatedPerformanceTrack.setTrackerName(performanceTrack.getTrackerName());
            updatedPerformanceTrack.setAddedDate(performanceTrack.getAddedDate());
            updatedPerformanceTrack.setAddedBy(performanceTrack.getAddedBy());
            updatedPerformanceTrack.setStatus(performanceTrack.getStatus());
            updatedPerformanceTrack.setModifiedDate(performanceTrack.getModifiedDate());
            return ResponseEntity.ok(performanceTrackService.savePerformanceTrack(updatedPerformanceTrack));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePerformanceTrack(@PathVariable Long id) {
        performanceTrackService.deletePerformanceTrack(id);
        return ResponseEntity.noContent().build();
    }
}
