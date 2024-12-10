package com.EmpNo.Service;


import com.EmpNo.Configuration.ResourceNotFoundException;
import com.EmpNo.Models.EmpAttachment;
import com.EmpNo.Repository.EmpAttachmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpAttachmentServiceImpl implements EmpAttachmentService {

    @Autowired
    private EmpAttachmentRepository empAttachmentRepository;

    @Override
    public EmpAttachment createAttachment(EmpAttachment empAttachment) {
        // Method is redundant with createEmpAttachment, so it's removed from the implementation
        return createEmpAttachment(empAttachment);
    }


    @Override
    public List<EmpAttachment> getAllAttachments() {
        // Method is redundant with getAllEmpAttachments, so it's removed from the implementation
        return getAllEmpAttachments();
    }

    @Override
    public EmpAttachment getAttachmentByEmpNumber(Long empNumber) {
        // Method is redundant with getEmpAttachmentsByEmpNumber, so it's removed from the implementation
        List<EmpAttachment> attachments = getEmpAttachmentsByEmpNumber(empNumber);
        if (attachments.isEmpty()) {
            throw new ResourceNotFoundException("Attachment not found with empNumber: " + empNumber);
        }
        return attachments.get(0); // Assuming only one attachment per empNumber
    }

    @Override
    public EmpAttachment updateAttachment(Long empNumber, EmpAttachment updatedAttachment) {
        // Method is redundant with updateEmpAttachmentByEmpNumber, so it's removed from the implementation
        return updateEmpAttachmentByEmpNumber(empNumber, updatedAttachment);
    }

    @Override
    public void deleteAttachment(Long empNumber) {
        // Method is redundant with deleteEmpAttachmentByEmpNumber, so it's removed from the implementation
        deleteEmpAttachmentByEmpNumber(empNumber);
    }

    @Override
    public EmpAttachment createEmpAttachment(EmpAttachment empAttachment) {
        return empAttachmentRepository.save(empAttachment);
    }

    @Override
    public List<EmpAttachment> getAllEmpAttachments() {
        return empAttachmentRepository.findAll();
    }

    @Override
    public List<EmpAttachment> getEmpAttachmentsByEmpNumber(Long empNumber) {
        return empAttachmentRepository.findByEmpNumber(empNumber);
    }

    @Override
    public EmpAttachment getEmpAttachmentById(Long id) {
        return empAttachmentRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Attachment not found with id: " + id));
    }

    @Override
    @Transactional
    public EmpAttachment updateEmpAttachmentByEmpNumber(Long empNumber, EmpAttachment updatedAttachment) {
        List<EmpAttachment> attachments = empAttachmentRepository.findByEmpNumber(empNumber);

        if (attachments.isEmpty()) {
            throw new ResourceNotFoundException("Attachment not found with empNumber: " + empNumber);
        }

        EmpAttachment existingAttachment = attachments.get(0); // Assuming only one attachment per empNumber
        existingAttachment.setEattachDesc(updatedAttachment.getEattachDesc());
        existingAttachment.setEattachFilename(updatedAttachment.getEattachFilename());
        existingAttachment.setEattachSize(updatedAttachment.getEattachSize());
        existingAttachment.setEattachAttachment(updatedAttachment.getEattachAttachment());
        existingAttachment.setEattachType(updatedAttachment.getEattachType());
        existingAttachment.setScreen(updatedAttachment.getScreen());
        existingAttachment.setAttachedBy(updatedAttachment.getAttachedBy());
        existingAttachment.setAttachedByName(updatedAttachment.getAttachedByName());
        existingAttachment.setAttachedTime(updatedAttachment.getAttachedTime());

        return empAttachmentRepository.save(existingAttachment);
    }

    @Override
    @Transactional
    public void deleteEmpAttachmentByEmpNumber(Long empNumber) {
        List<EmpAttachment> attachments = empAttachmentRepository.findByEmpNumber(empNumber);

        if (attachments.isEmpty()) {
            throw new ResourceNotFoundException("Attachment not found with empNumber: " + empNumber);
        }

        empAttachmentRepository.deleteAll(attachments);
    }
}
