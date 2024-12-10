package com.EmpNo.Repository;


import com.EmpNo.Models.EmpMemberDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpMemberDetailRepository extends JpaRepository<EmpMemberDetail, Long> {
    List<EmpMemberDetail> findByEmpNumber(Long empNumber);
}
