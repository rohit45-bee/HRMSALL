package com.EmpNo.Repository;


import com.EmpNo.Models.EmpEmergencyContact;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpEmergencyContactRepository extends JpaRepository<EmpEmergencyContact, Long> {
    List<EmpEmergencyContact> findByEmpNumber(Long empNumber);
}
