package com.EmpNo.Repository;


import com.EmpNo.Models.EmpPassport;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpPassportRepository extends JpaRepository<EmpPassport, Long> {
    // Custom query methods can be added here if needed
}
