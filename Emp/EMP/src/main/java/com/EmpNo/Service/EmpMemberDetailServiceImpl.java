package com.EmpNo.Service;


import com.EmpNo.Configuration.ResourceNotFoundException;
import com.EmpNo.Models.EmpMemberDetail;
import com.EmpNo.Repository.EmpMemberDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpMemberDetailServiceImpl implements EmpMemberDetailService {

    private final EmpMemberDetailRepository empMemberDetailRepository;

    @Autowired
    public EmpMemberDetailServiceImpl(EmpMemberDetailRepository empMemberDetailRepository) {
        this.empMemberDetailRepository = empMemberDetailRepository;
    }

    @Override
    public EmpMemberDetail createEmpMemberDetail(EmpMemberDetail empMemberDetail) {
        return empMemberDetailRepository.save(empMemberDetail);
    }


    @Override
    public List<EmpMemberDetail> getAllEmpMemberDetails() {
        return empMemberDetailRepository.findAll();
    }

    @Override
    public List<EmpMemberDetail> getEmpMemberDetailByEmpNumber(Long empNumber) {
        return empMemberDetailRepository.findByEmpNumber(empNumber);
    }

    @Override
    @Transactional
    public EmpMemberDetail updateEmpMemberDetail(Long empNumber, EmpMemberDetail updatedEmpMemberDetail) {
        EmpMemberDetail existingRecord = empMemberDetailRepository.findByEmpNumber(empNumber)
                .stream()
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Member detail entry not found with empNumber: " + empNumber));

        existingRecord.setMembshipCode(updatedEmpMemberDetail.getMembshipCode());
        existingRecord.setEmembSubscriptOwnership(updatedEmpMemberDetail.getEmembSubscriptOwnership());
        existingRecord.setEmembSubscriptAmount(updatedEmpMemberDetail.getEmembSubscriptAmount());
        existingRecord.setEmembSubsCurrency(updatedEmpMemberDetail.getEmembSubsCurrency());
        existingRecord.setEmembCommenceDate(updatedEmpMemberDetail.getEmembCommenceDate());
        existingRecord.setEmembRenewalDate(updatedEmpMemberDetail.getEmembRenewalDate());

        return empMemberDetailRepository.save(existingRecord);
    }

    @Override
    @Transactional
    public void deleteEmpMemberDetailByEmpNumber(Long empNumber) {
        if (!empMemberDetailRepository.existsById(empNumber)) {
            throw new ResourceNotFoundException("Member detail entry not found with empNumber: " + empNumber);
        }
        empMemberDetailRepository.deleteById(empNumber);
    }
}
