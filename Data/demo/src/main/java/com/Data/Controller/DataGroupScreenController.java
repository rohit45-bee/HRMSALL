package com.Data.Controller;

import com.Data.Models.DataGroupScreen;
import com.Data.Service.DataGroupScreenService; // Import for the service
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/dataGroupScreen")
public class DataGroupScreenController {

    @Autowired
    private DataGroupScreenService service;

    @PostMapping
    public ResponseEntity<DataGroupScreen> createDataGroupScreen(@RequestBody DataGroupScreen dataGroupScreen) {
        return new ResponseEntity<>(service.createDataGroupScreen(dataGroupScreen), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DataGroupScreen> getDataGroupScreenById(@PathVariable Long id) {
        DataGroupScreen dataGroupScreen = service.getDataGroupScreenById(id);
        if (dataGroupScreen != null) {
            return new ResponseEntity<>(dataGroupScreen, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<DataGroupScreen>> getAllDataGroupScreens() {
        return new ResponseEntity<>(service.getAllDataGroupScreens(), HttpStatus.OK);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DataGroupScreen> updateDataGroupScreen(@PathVariable Long id, @RequestBody DataGroupScreen dataGroupScreen) {
        DataGroupScreen updatedDataGroupScreen = service.updateDataGroupScreen(id, dataGroupScreen);
        if (updatedDataGroupScreen != null) {
            return new ResponseEntity<>(updatedDataGroupScreen, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDataGroupScreen(@PathVariable Long id) {
        service.deleteDataGroupScreen(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
