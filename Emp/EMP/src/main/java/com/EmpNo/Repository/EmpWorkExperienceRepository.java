package com.EmpNo.Repository;


import com.EmpNo.Models.EmpWorkExperience;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpWorkExperienceRepository extends JpaRepository<EmpWorkExperience, Long> {
    // Additional query methods (if needed) can be defined here
}
