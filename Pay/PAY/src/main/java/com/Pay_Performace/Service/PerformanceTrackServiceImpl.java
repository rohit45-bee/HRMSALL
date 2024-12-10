package com.Pay_Performace.Service;


import com.Pay_Performace.Models.PerformanceTrack;
import com.Pay_Performace.Repository.PerformanceTrackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PerformanceTrackServiceImpl implements PerformanceTrackService {

    @Autowired
    private PerformanceTrackRepository performanceTrackRepository;

    @Override
    public PerformanceTrack savePerformanceTrack(PerformanceTrack performanceTrack) {
        return performanceTrackRepository.save(performanceTrack);
    }


    @Override
    public List<PerformanceTrack> getAllPerformanceTracks() {
        return performanceTrackRepository.findAll();
    }

    @Override
    public Optional<PerformanceTrack> getPerformanceTrackById(Long id) {
        return performanceTrackRepository.findById(id);
    }

    @Override
    public void deletePerformanceTrack(Long id) {
        performanceTrackRepository.deleteById(id);
    }
}
