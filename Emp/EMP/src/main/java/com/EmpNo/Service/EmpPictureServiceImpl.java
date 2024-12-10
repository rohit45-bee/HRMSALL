package com.EmpNo.Service;


import com.EmpNo.Models.EmpPicture;
import com.EmpNo.Repository.EmpPictureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpPictureServiceImpl implements EmpPictureService {

    @Autowired
    private EmpPictureRepository empPictureRepository;

    @Override
    public EmpPicture createEmpPicture(EmpPicture empPicture) {
        return empPictureRepository.save(empPicture);
    }



    @Override
    public List<EmpPicture> getAllEmpPictures() {
        return empPictureRepository.findAll();
    }

    @Override
    public EmpPicture getEmpPictureByEmpNumber(Long empNumber) {
        return empPictureRepository.findById(empNumber).orElse(null);
    }

    @Override
    public EmpPicture updateEmpPictureByEmpNumber(Long empNumber, EmpPicture updatedEmpPicture) {
        if (empPictureRepository.existsById(empNumber)) {
            updatedEmpPicture.setEmpNumber(empNumber);
            return empPictureRepository.save(updatedEmpPicture);
        } else {
            return null;
        }
    }

    @Override
    public void deleteEmpPictureByEmpNumber(Long empNumber) {
        empPictureRepository.deleteById(empNumber);
    }
}
