package com.EmpNo.Controller;


import com.EmpNo.Models.EmpAttachment;
import com.EmpNo.Service.EmpAttachmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/attachments")
public class EmpAttachmentController {

    @Autowired
    private EmpAttachmentService empAttachmentService;

    // Create a new attachment
    @PostMapping
    public ResponseEntity<EmpAttachment> createAttachment(@RequestBody EmpAttachment empAttachment) {
        EmpAttachment createdAttachment = empAttachmentService.createAttachment(empAttachment);
        return new ResponseEntity<>(createdAttachment, HttpStatus.CREATED);
    }

    // Get all attachments
    @GetMapping
    public ResponseEntity<List<EmpAttachment>> getAllAttachments() {
        List<EmpAttachment> attachments = empAttachmentService.getAllAttachments();
        return new ResponseEntity<>(attachments, HttpStatus.OK);
    }

    // Get an attachment by empNumber
    @GetMapping("/emp/{empNumber}")
    public ResponseEntity<EmpAttachment> getAttachmentByEmpNumber(@PathVariable Long empNumber) {
        EmpAttachment attachment = empAttachmentService.getAttachmentByEmpNumber(empNumber);
        if (attachment != null) {
            return new ResponseEntity<>(attachment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Update an attachment by empNumber
    @PutMapping("/emp/{empNumber}")
    public ResponseEntity<EmpAttachment> updateAttachment(@PathVariable Long empNumber, @RequestBody EmpAttachment updatedAttachment) {
        EmpAttachment attachment = empAttachmentService.updateAttachment(empNumber, updatedAttachment);
        if (attachment != null) {
            return new ResponseEntity<>(attachment, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    // Delete an attachment by empNumber
    @DeleteMapping("/emp/{empNumber}")
    public ResponseEntity<Void> deleteAttachment(@PathVariable Long empNumber) {
        empAttachmentService.deleteAttachment(empNumber);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
