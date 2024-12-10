package com.Pay_Performace.Service;



import com.Pay_Performace.Models.PerformanceTrack;

import java.util.List;
import java.util.Optional;

public interface PerformanceTrackService {
    PerformanceTrack savePerformanceTrack(PerformanceTrack performanceTrack);


    List<PerformanceTrack> getAllPerformanceTracks();
    Optional<PerformanceTrack> getPerformanceTrackById(Long id);
    void deletePerformanceTrack(Long id);
}
