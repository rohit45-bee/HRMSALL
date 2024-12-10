package com.EmpNo.Service;



import com.EmpNo.Models.EmpHistoryOfEarlierPos;

import java.util.List;

public interface EmpHistoryOfEarlierPosService {
    EmpHistoryOfEarlierPos createEmpHistoryOfEarlierPos(EmpHistoryOfEarlierPos empHistoryOfEarlierPos);
    List<EmpHistoryOfEarlierPos> getAllEmpHistoryOfEarlierPos();
    List<EmpHistoryOfEarlierPos> getEmpHistoryOfEarlierPosByEmpNumber(Long empNumber);
    EmpHistoryOfEarlierPos updateEmpHistoryOfEarlierPos(Long empNumber, EmpHistoryOfEarlierPos updatedEmpHistoryOfEarlierPos);
    void deleteEmpHistoryOfEarlierPosByEmpNumber(Long empNumber);
}
