package com.EmpNo.Repository;


import com.EmpNo.Models.EmpAttachment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EmpAttachmentRepository extends JpaRepository<EmpAttachment, Long> {
    List<EmpAttachment> findByEmpNumber(Long empNumber);  // Returns a list of attachments for the given empNumber
    void deleteByEmpNumber(Long empNumber);  // Deletes all attachments associated with the given empNumber
    void deleteAll(Iterable<? extends EmpAttachment> attachments);  // Correct method for deleting all entities in a collection
}
