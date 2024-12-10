package com.EmpNo.Service;

import com.EmpNo.Models.EmpAttachment;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface EmpAttachmentService {
    EmpAttachment createAttachment(EmpAttachment empAttachment);
    List<EmpAttachment> getAllAttachments();
    EmpAttachment getAttachmentByEmpNumber(Long empNumber);
    EmpAttachment updateAttachment(Long empNumber, EmpAttachment updatedAttachment);
    void deleteAttachment(Long empNumber);

    EmpAttachment createEmpAttachment(EmpAttachment empAttachment);

    List<EmpAttachment> getAllEmpAttachments();

    List<EmpAttachment> getEmpAttachmentsByEmpNumber(Long empNumber);

    EmpAttachment getEmpAttachmentById(Long id);

    @Transactional
    EmpAttachment updateEmpAttachmentByEmpNumber(Long empNumber, EmpAttachment updatedAttachment);

    @Transactional
    void deleteEmpAttachmentByEmpNumber(Long empNumber);
}
