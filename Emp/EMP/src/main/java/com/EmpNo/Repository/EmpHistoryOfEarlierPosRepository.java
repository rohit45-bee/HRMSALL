package com.EmpNo.Repository;


import com.EmpNo.Models.EmpHistoryOfEarlierPos;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpHistoryOfEarlierPosRepository extends JpaRepository<EmpHistoryOfEarlierPos, Long> {
    List<EmpHistoryOfEarlierPos> findByEmpNumber(Long empNumber);
}
