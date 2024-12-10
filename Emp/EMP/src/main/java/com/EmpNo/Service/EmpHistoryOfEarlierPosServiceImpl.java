package com.EmpNo.Service;

import com.EmpNo.Configuration.ResourceNotFoundException;
import com.EmpNo.Models.EmpHistoryOfEarlierPos;
import com.EmpNo.Repository.EmpHistoryOfEarlierPosRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class EmpHistoryOfEarlierPosServiceImpl implements EmpHistoryOfEarlierPosService {

    private final EmpHistoryOfEarlierPosRepository empHistoryOfEarlierPosRepository;

    @Autowired
    public EmpHistoryOfEarlierPosServiceImpl(EmpHistoryOfEarlierPosRepository empHistoryOfEarlierPosRepository) {
        this.empHistoryOfEarlierPosRepository = empHistoryOfEarlierPosRepository;
    }

    @Override
    public EmpHistoryOfEarlierPos createEmpHistoryOfEarlierPos(EmpHistoryOfEarlierPos empHistoryOfEarlierPos) {
        return empHistoryOfEarlierPosRepository.save(empHistoryOfEarlierPos);
    }


    @Override
    public List<EmpHistoryOfEarlierPos> getAllEmpHistoryOfEarlierPos() {
        return empHistoryOfEarlierPosRepository.findAll();
    }

    @Override
    public List<EmpHistoryOfEarlierPos> getEmpHistoryOfEarlierPosByEmpNumber(Long empNumber) {
        return empHistoryOfEarlierPosRepository.findByEmpNumber(empNumber);
    }

    @Override
    @Transactional
    public EmpHistoryOfEarlierPos updateEmpHistoryOfEarlierPos(Long empNumber, EmpHistoryOfEarlierPos updatedEmpHistoryOfEarlierPos) {
        EmpHistoryOfEarlierPos existingRecord = empHistoryOfEarlierPosRepository.findByEmpNumber(empNumber)
                .stream()
                .findFirst()
                .orElseThrow(() -> new ResourceNotFoundException("History of Earlier Position not found with empNumber: " + empNumber));

        existingRecord.setEmpSeqNo(updatedEmpHistoryOfEarlierPos.getEmpSeqNo());
        existingRecord.setEhoepJobTitle(updatedEmpHistoryOfEarlierPos.getEhoepJobTitle());
        existingRecord.setEhoepYears(updatedEmpHistoryOfEarlierPos.getEhoepYears());

        return empHistoryOfEarlierPosRepository.save(existingRecord);
    }

    @Override
    @Transactional
    public void deleteEmpHistoryOfEarlierPosByEmpNumber(Long empNumber) {
        if (!empHistoryOfEarlierPosRepository.existsById(empNumber)) {
            throw new ResourceNotFoundException("History of Earlier Position not found with empNumber: " + empNumber);
        }
        empHistoryOfEarlierPosRepository.deleteById(empNumber);
    }
}
