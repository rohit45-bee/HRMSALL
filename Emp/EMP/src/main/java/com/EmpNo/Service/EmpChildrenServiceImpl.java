package com.EmpNo.Service;


import com.EmpNo.Configuration.ResourceNotFoundException;
import com.EmpNo.Models.EmpChildren;
import com.EmpNo.Repository.EmpChildrenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpChildrenServiceImpl implements EmpChildrenService {

    @Autowired
    private EmpChildrenRepository empChildrenRepository;

    @Override
    public EmpChildren createEmpChildren(EmpChildren empChildren) {
        return empChildrenRepository.save(empChildren);
    }



    @Override
    public List<EmpChildren> getAllEmpChildren() {
        return empChildrenRepository.findAll();
    }

    @Override
    public List<EmpChildren> getEmpChildrenByEmpNumber(Long empNumber) {
        return empChildrenRepository.findByEmpNumber(empNumber);
    }

    @Override
    public EmpChildren getEmpChildrenById(Long id) {
        return empChildrenRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("EmpChildren not found with id: " + id));
    }

    @Override
    @Transactional
    public EmpChildren updateEmpChildrenByEmpNumber(Long empNumber, EmpChildren updatedEmpChildren) {
        List<EmpChildren> children = empChildrenRepository.findByEmpNumber(empNumber);

        if (children.isEmpty()) {
            throw new ResourceNotFoundException("No children found for empNumber: " + empNumber);
        }

        EmpChildren existingChild = children.get(0); // Assuming only one child per empNumber
        existingChild.setEcName(updatedEmpChildren.getEcName());
        existingChild.setEcDateOfBirth(updatedEmpChildren.getEcDateOfBirth());

        return empChildrenRepository.save(existingChild);
    }

    @Override
    @Transactional
    public void deleteEmpChildrenById(Long id) {
        if (!empChildrenRepository.existsById(id)) {
            throw new ResourceNotFoundException("EmpChildren not found with id: " + id);
        }
        empChildrenRepository.deleteById(id);
    }

    @Override
    @Transactional
    public void deleteEmpChildrenByEmpNumber(Long empNumber) {
        List<EmpChildren> children = empChildrenRepository.findByEmpNumber(empNumber);

        if (children.isEmpty()) {
            throw new ResourceNotFoundException("No children found for empNumber: " + empNumber);
        }

        empChildrenRepository.deleteAll(children);
    }
}
