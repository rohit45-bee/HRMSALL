package com.EmpNo.Service;


import com.EmpNo.Configuration.ResourceNotFoundException;
import com.EmpNo.Models.EmpContractExtend;
import com.EmpNo.Repository.EmpContractExtendRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpContractExtendServiceImpl implements EmpContractExtendService {

    private final EmpContractExtendRepository empContractExtendRepository;

    @Autowired
    public EmpContractExtendServiceImpl(EmpContractExtendRepository empContractExtendRepository) {
        this.empContractExtendRepository = empContractExtendRepository;
    }

    @Override
    public EmpContractExtend createEmpContractExtend(EmpContractExtend empContractExtend) {
        return empContractExtendRepository.save(empContractExtend);
    }



    @Override
    public List<EmpContractExtend> getAllEmpContractExtends() {
        return empContractExtendRepository.findAll();
    }

    @Override
    public List<EmpContractExtend> getEmpContractExtendsByEmpNumber(Long empNumber) {
        return empContractExtendRepository.findByEmpNumber(empNumber);
    }

    @Override
    public EmpContractExtend getEmpContractExtendById(Long id) {
        return empContractExtendRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Contract Extend not found with id: " + id));
    }

    @Override
    @Transactional
    public EmpContractExtend updateEmpContractExtendByEmpNumber(Long empNumber, EmpContractExtend updatedEmpContractExtend) {
        List<EmpContractExtend> contracts = empContractExtendRepository.findByEmpNumber(empNumber);

        if (contracts.isEmpty()) {
            throw new ResourceNotFoundException("Contract Extend not found with empNumber: " + empNumber);
        }

        EmpContractExtend existingContract = contracts.get(0); // Assuming only one contract extend per empNumber
        existingContract.setExtendStartDate(updatedEmpContractExtend.getExtendStartDate());
        existingContract.setExtendEndDate(updatedEmpContractExtend.getExtendEndDate());

        return empContractExtendRepository.save(existingContract);
    }

    @Override
    @Transactional
    public void deleteEmpContractExtendById(Long id) {
        if (!empContractExtendRepository.existsById(id)) {
            throw new ResourceNotFoundException("Contract Extend not found with id: " + id);
        }
        empContractExtendRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteEmpContractExtendByEmpNumber(Long empNumber) {
        List<EmpContractExtend> contracts = empContractExtendRepository.findByEmpNumber(empNumber);

        if (contracts.isEmpty()) {
            throw new ResourceNotFoundException("Contract Extend not found with empNumber: " + empNumber);
        }

        empContractExtendRepository.deleteAll(contracts);
    }
}
