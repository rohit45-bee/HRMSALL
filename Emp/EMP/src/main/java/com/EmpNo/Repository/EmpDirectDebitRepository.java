package com.EmpNo.Repository;


import com.EmpNo.Models.EmpDirectDebit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpDirectDebitRepository extends JpaRepository<EmpDirectDebit, Long> {
    List<EmpDirectDebit> findBySalaryId(Long salaryId);
}
