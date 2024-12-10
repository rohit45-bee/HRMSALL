package com.EmpNo.Service;


import com.EmpNo.Configuration.ResourceNotFoundException;
import com.EmpNo.Models.EmpDirectDebit;
import com.EmpNo.Repository.EmpDirectDebitRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpDirectDebitServiceImpl implements EmpDirectDebitService {

    private final EmpDirectDebitRepository empDirectDebitRepository;

    @Autowired
    public EmpDirectDebitServiceImpl(EmpDirectDebitRepository empDirectDebitRepository) {
        this.empDirectDebitRepository = empDirectDebitRepository;
    }

    @Override
    public EmpDirectDebit createEmpDirectDebit(EmpDirectDebit empDirectDebit) {
        return empDirectDebitRepository.save(empDirectDebit);
    }



    @Override
    public List<EmpDirectDebit> getAllEmpDirectDebits() {
        return empDirectDebitRepository.findAll();
    }

    @Override
    public List<EmpDirectDebit> getEmpDirectDebitsBySalaryId(Long salaryId) {
        return empDirectDebitRepository.findBySalaryId(salaryId);
    }

    @Override
    public EmpDirectDebit getEmpDirectDebitById(Long id) {
        return empDirectDebitRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Direct Debit not found with id: " + id));
    }

    @Override
    @Transactional
    public EmpDirectDebit updateEmpDirectDebit(Long id, EmpDirectDebit updatedEmpDirectDebit) {
        EmpDirectDebit existingDirectDebit = empDirectDebitRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Direct Debit not found with id: " + id));

        existingDirectDebit.setSalaryId(updatedEmpDirectDebit.getSalaryId());
        existingDirectDebit.setDdRoutingNum(updatedEmpDirectDebit.getDdRoutingNum());
        existingDirectDebit.setDdAccount(updatedEmpDirectDebit.getDdAccount());
        existingDirectDebit.setDdAmount(updatedEmpDirectDebit.getDdAmount());
        existingDirectDebit.setDdAccountType(updatedEmpDirectDebit.getDdAccountType());
        existingDirectDebit.setDdTransactionType(updatedEmpDirectDebit.getDdTransactionType());

        return empDirectDebitRepository.save(existingDirectDebit);
    }

    @Override
    @Transactional
    public void deleteEmpDirectDebitById(Long id) {
        if (!empDirectDebitRepository.existsById(id)) {
            throw new ResourceNotFoundException("Direct Debit not found with id: " + id);
        }
        empDirectDebitRepository.deleteById(id);
    }
}
