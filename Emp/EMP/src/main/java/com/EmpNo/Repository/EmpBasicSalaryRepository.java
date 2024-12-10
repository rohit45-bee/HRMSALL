package com.EmpNo.Repository;

import com.EmpNo.Models.EmpBasicSalary;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpBasicSalaryRepository extends JpaRepository<EmpBasicSalary, String> {
}
