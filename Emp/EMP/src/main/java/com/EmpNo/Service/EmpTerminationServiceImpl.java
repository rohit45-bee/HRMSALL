package com.EmpNo.Service;


import com.EmpNo.Models.EmpTermination;
import com.EmpNo.Repository.EmpTerminationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmpTerminationServiceImpl implements EmpTerminationService {

    @Autowired
    private EmpTerminationRepository empTerminationRepository;

    @Override
    public EmpTermination createEmpTermination(EmpTermination empTermination) {
        return empTerminationRepository.save(empTermination);
    }

    @Override
    public EmpTermination updateEmpTermination(Long id, EmpTermination empTermination) {
        Optional<EmpTermination> existingTermination = empTerminationRepository.findById(id);
        if (existingTermination.isPresent()) {
            EmpTermination updatedTermination = existingTermination.get();
            updatedTermination.setEmpNumber(empTermination.getEmpNumber());
            updatedTermination.setReasonId(empTermination.getReasonId());
            updatedTermination.setTerminationDate(empTermination.getTerminationDate());
            updatedTermination.setNote(empTermination.getNote());
            return empTerminationRepository.save(updatedTermination);
        } else {
            return null; // handle not found
        }
    }



    @Override
    public void deleteEmpTermination(Long id) {
        empTerminationRepository.deleteById(id);
    }

    @Override
    public List<EmpTermination> getAllEmpTerminations() {
        return empTerminationRepository.findAll();
    }

    @Override
    public Optional<EmpTermination> getEmpTerminationById(Long id) {
        return empTerminationRepository.findById(id);
    }
}
