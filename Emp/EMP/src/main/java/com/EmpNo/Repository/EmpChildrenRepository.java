package com.EmpNo.Repository;


import com.EmpNo.Models.EmpChildren;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpChildrenRepository extends JpaRepository<EmpChildren, Long> {
    List<EmpChildren> findByEmpNumber(Long empNumber);
}
