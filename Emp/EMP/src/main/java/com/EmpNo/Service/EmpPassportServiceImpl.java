package com.EmpNo.Service;


import com.EmpNo.Configuration.ResourceNotFoundException;
import com.EmpNo.Models.EmpPassport;
import com.EmpNo.Repository.EmpPassportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpPassportServiceImpl implements EmpPassportService {

    private final EmpPassportRepository empPassportRepository;

    @Autowired
    public EmpPassportServiceImpl(EmpPassportRepository empPassportRepository) {
        this.empPassportRepository = empPassportRepository;
    }

    @Override
    public EmpPassport createEmpPassport(EmpPassport empPassport) {
        return empPassportRepository.save(empPassport);
    }


    @Override
    public List<EmpPassport> getAllEmpPassports() {
        return empPassportRepository.findAll();
    }

    @Override
    public EmpPassport getEmpPassportByEmpNumber(Long empNumber) {
        return empPassportRepository.findById(empNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Passport not found with empNumber: " + empNumber));
    }

    @Override
    @Transactional
    public EmpPassport updateEmpPassportByEmpNumber(Long empNumber, EmpPassport updatedEmpPassport) {
        EmpPassport existingPassport = empPassportRepository.findById(empNumber)
                .orElseThrow(() -> new ResourceNotFoundException("Passport not found with empNumber: " + empNumber));

        existingPassport.setSeqNo(updatedEmpPassport.getSeqNo());
        existingPassport.setPassportNum(updatedEmpPassport.getPassportNum());
        existingPassport.setPassportIssuedDate(updatedEmpPassport.getPassportIssuedDate());
        existingPassport.setPassportExpireDate(updatedEmpPassport.getPassportExpireDate());
        existingPassport.setComments(updatedEmpPassport.getComments());
        existingPassport.setPassportTypeFlag(updatedEmpPassport.getPassportTypeFlag());
        existingPassport.setI9Status(updatedEmpPassport.getI9Status());
        existingPassport.setI9ReviewDate(updatedEmpPassport.getI9ReviewDate());
        existingPassport.setCountryCode(updatedEmpPassport.getCountryCode());

        return empPassportRepository.save(existingPassport);
    }

    @Override
    @Transactional
    public void deleteEmpPassportByEmpNumber(Long empNumber) {
        if (!empPassportRepository.existsById(empNumber)) {
            throw new ResourceNotFoundException("Passport not found with empNumber: " + empNumber);
        }
        empPassportRepository.deleteById(empNumber);
    }
}
