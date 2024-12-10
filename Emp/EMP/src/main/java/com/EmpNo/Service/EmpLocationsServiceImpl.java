package com.EmpNo.Service;


import com.EmpNo.Configuration.ResourceNotFoundException;
import com.EmpNo.Models.EmpLocations;
import com.EmpNo.Repository.EmpLocationsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpLocationsServiceImpl implements EmpLocationsService {

    private final EmpLocationsRepository empLocationsRepository;

    @Autowired
    public EmpLocationsServiceImpl(EmpLocationsRepository empLocationsRepository) {
        this.empLocationsRepository = empLocationsRepository;
    }

    @Override
    public EmpLocations createEmpLocation(EmpLocations empLocation) {
        return empLocationsRepository.save(empLocation);
    }

    @Override
    public List<EmpLocations> getAllEmpLocations() {
        return empLocationsRepository.findAll();
    }

    @Override
    public List<EmpLocations> getEmpLocationByEmpNumber(Long empNumber) {
        return empLocationsRepository.findByEmpNumber(empNumber);
    }

    @Override
    @Transactional
    public EmpLocations updateEmpLocation(Long empNumber, EmpLocations updatedEmpLocation) {
        EmpLocations existingRecord = empLocationsRepository.findByEmpNumber(empNumber)
                .stream()
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Location entry not found with empNumber: " + empNumber));

        existingRecord.setLocationId(updatedEmpLocation.getLocationId());

        return empLocationsRepository.save(existingRecord);
    }

    @Override
    @Transactional
    public void deleteEmpLocationByEmpNumber(Long empNumber) {
        if (!empLocationsRepository.existsById(empNumber)) {
            throw new ResourceNotFoundException("Location entry not found with empNumber: " + empNumber);
        }
        empLocationsRepository.deleteById(empNumber);
    }
}
