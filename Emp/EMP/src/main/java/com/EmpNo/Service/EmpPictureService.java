package com.EmpNo.Service;



import com.EmpNo.Models.EmpPicture;

import java.util.List;

public interface EmpPictureService {
    EmpPicture createEmpPicture(EmpPicture empPicture);
    List<EmpPicture> getAllEmpPictures();
    EmpPicture getEmpPictureByEmpNumber(Long empNumber);
    EmpPicture updateEmpPictureByEmpNumber(Long empNumber, EmpPicture updatedEmpPicture);
    void deleteEmpPictureByEmpNumber(Long empNumber);
}
