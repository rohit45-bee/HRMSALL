package com.EmpNo.Controller;


import com.EmpNo.Models.EmpPicture;
import com.EmpNo.Service.EmpPictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/emp-picture")
public class EmpPictureController {

    @Autowired
    private EmpPictureService empPictureService;

    @PostMapping
    public ResponseEntity<EmpPicture> createEmpPicture(@RequestBody EmpPicture empPicture) {
        System.out.println("Received payload: " + empPicture);
        return new ResponseEntity<>(empPictureService.createEmpPicture(empPicture), HttpStatus.CREATED);
    }


    @GetMapping
    public ResponseEntity<List<EmpPicture>> getAllEmpPictures() {
        return new ResponseEntity<>(empPictureService.getAllEmpPictures(), HttpStatus.OK);
    }

    @GetMapping("/emp/{empNumber}")
    public ResponseEntity<EmpPicture> getEmpPictureByEmpNumber(@PathVariable Long empNumber) {
        return new ResponseEntity<>(empPictureService.getEmpPictureByEmpNumber(empNumber), HttpStatus.OK);
    }

    @PutMapping("/emp/{empNumber}")
    public ResponseEntity<EmpPicture> updateEmpPictureByEmpNumber(@PathVariable Long empNumber, @RequestBody EmpPicture updatedEmpPicture) {
        return new ResponseEntity<>(empPictureService.updateEmpPictureByEmpNumber(empNumber, updatedEmpPicture), HttpStatus.OK);
    }

    @DeleteMapping("/emp/{empNumber}")
    public ResponseEntity<Void> deleteEmpPictureByEmpNumber(@PathVariable Long empNumber) {
        empPictureService.deleteEmpPictureByEmpNumber(empNumber);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
