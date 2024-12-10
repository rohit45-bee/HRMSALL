package com.EmpNo.Service;



import com.EmpNo.Models.EmpLocations;

import java.util.List;

public interface EmpLocationsService {
    EmpLocations createEmpLocation(EmpLocations empLocation);
    List<EmpLocations> getAllEmpLocations();
    List<EmpLocations> getEmpLocationByEmpNumber(Long empNumber);
    EmpLocations updateEmpLocation(Long empNumber, EmpLocations updatedEmpLocation);
    void deleteEmpLocationByEmpNumber(Long empNumber);
}
