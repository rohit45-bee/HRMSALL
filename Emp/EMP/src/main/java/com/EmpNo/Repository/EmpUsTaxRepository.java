package com.EmpNo.Repository;


import com.EmpNo.Models.EmpUsTax;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface EmpUsTaxRepository extends JpaRepository<EmpUsTax, Long> {
}
