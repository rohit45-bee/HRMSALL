package com.EmpNo.Repository;


import com.EmpNo.Models.EmpLocations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpLocationsRepository extends JpaRepository<EmpLocations, Long> {
    List<EmpLocations> findByEmpNumber(Long empNumber);
}
