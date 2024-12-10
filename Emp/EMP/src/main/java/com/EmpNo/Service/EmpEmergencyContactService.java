package com.EmpNo.Service;


import com.EmpNo.Models.EmpEmergencyContact;

import java.util.List;

public interface EmpEmergencyContactService {
    EmpEmergencyContact createEmpEmergencyContact(EmpEmergencyContact empEmergencyContact);
    List<EmpEmergencyContact> getAllEmpEmergencyContacts();
    List<EmpEmergencyContact> getEmpEmergencyContactsByEmpNumber(Long empNumber);
    EmpEmergencyContact updateEmpEmergencyContact(Long empNumber, EmpEmergencyContact updatedEmpEmergencyContact);
    void deleteEmpEmergencyContactByEmpNumber(Long empNumber);
}
