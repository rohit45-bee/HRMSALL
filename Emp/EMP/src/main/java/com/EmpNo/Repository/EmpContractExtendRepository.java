package com.EmpNo.Repository;


import com.EmpNo.Models.EmpContractExtend;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpContractExtendRepository extends JpaRepository<EmpContractExtend, Long> {
    List<EmpContractExtend> findByEmpNumber(Long empNumber);
}
