package com.EmpNo.Service;


import com.EmpNo.Configuration.ResourceNotFoundException;
import com.EmpNo.Models.EmpEmergencyContact;
import com.EmpNo.Repository.EmpEmergencyContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpEmergencyContactServiceImpl implements EmpEmergencyContactService {

    private final EmpEmergencyContactRepository empEmergencyContactRepository;

    @Autowired
    public EmpEmergencyContactServiceImpl(EmpEmergencyContactRepository empEmergencyContactRepository) {
        this.empEmergencyContactRepository = empEmergencyContactRepository;
    }

    @Override
    public EmpEmergencyContact createEmpEmergencyContact(EmpEmergencyContact empEmergencyContact) {
        return empEmergencyContactRepository.save(empEmergencyContact);
    }


    @Override
    public List<EmpEmergencyContact> getAllEmpEmergencyContacts() {
        return empEmergencyContactRepository.findAll();
    }

    @Override
    public List<EmpEmergencyContact> getEmpEmergencyContactsByEmpNumber(Long empNumber) {
        return empEmergencyContactRepository.findByEmpNumber(empNumber);
    }

    @Override
    @Transactional
    public EmpEmergencyContact updateEmpEmergencyContact(Long empNumber, EmpEmergencyContact updatedEmpEmergencyContact) {
        EmpEmergencyContact existingContact = empEmergencyContactRepository.findByEmpNumber(empNumber)
                .stream()
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("Emergency Contact not found with empNumber: " + empNumber));

        existingContact.setEecSeqNo(updatedEmpEmergencyContact.getEecSeqNo());
        existingContact.setEecName(updatedEmpEmergencyContact.getEecName());
        existingContact.setEecRelationship(updatedEmpEmergencyContact.getEecRelationship());
        existingContact.setEecHomeNo(updatedEmpEmergencyContact.getEecHomeNo());
        existingContact.setEecMobileNo(updatedEmpEmergencyContact.getEecMobileNo());
        existingContact.setEecOfficeNo(updatedEmpEmergencyContact.getEecOfficeNo());

        return empEmergencyContactRepository.save(existingContact);
    }

    @Override
    @Transactional
    public void deleteEmpEmergencyContactByEmpNumber(Long empNumber) {
        if (!empEmergencyContactRepository.existsById(empNumber)) {
            throw new ResourceNotFoundException("Emergency Contact not found with empNumber: " + empNumber);
        }
        empEmergencyContactRepository.deleteById(empNumber);
    }
}
