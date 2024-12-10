package com.EmpNo.Service;



import com.EmpNo.Models.EmpTermination;

import java.util.List;
import java.util.Optional;

public interface EmpTerminationService {
    EmpTermination createEmpTermination(EmpTermination empTermination);
    EmpTermination updateEmpTermination(Long id, EmpTermination empTermination);
    void deleteEmpTermination(Long id);
    List<EmpTermination> getAllEmpTerminations();
    Optional<EmpTermination> getEmpTerminationById(Long id);
}
