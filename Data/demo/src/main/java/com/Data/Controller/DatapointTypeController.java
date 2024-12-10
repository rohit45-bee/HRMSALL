package com.Data.Controller;


import com.Data.Models.DatapointType;
import com.Data.Service.DatapointTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/datapoint-types")
public class DatapointTypeController {

    @Autowired
    private DatapointTypeService datapointTypeService;

    @PostMapping
    public ResponseEntity<DatapointType> createDatapointType(@RequestBody DatapointType datapointType) {
        DatapointType created = datapointTypeService.createDatapointType(datapointType);
        return ResponseEntity.ok(created);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DatapointType> updateDatapointType(@PathVariable Long id, @RequestBody DatapointType datapointType) {
        DatapointType updated = datapointTypeService.updateDatapointType(id, datapointType);
        if (updated != null) {
            return ResponseEntity.ok(updated);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping("/{id}")
    public ResponseEntity<DatapointType> getDatapointTypeById(@PathVariable Long id) {
        DatapointType datapointType = datapointTypeService.getDatapointTypeById(id);
        if (datapointType != null) {
            return ResponseEntity.ok(datapointType);
        }
        return ResponseEntity.notFound().build();
    }

    @GetMapping
    public ResponseEntity<List<DatapointType>> getAllDatapointTypes() {
        List<DatapointType> datapointTypes = datapointTypeService.getAllDatapointTypes();
        return ResponseEntity.ok(datapointTypes);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDatapointType(@PathVariable Long id) {
        datapointTypeService.deleteDatapointType(id);
        return ResponseEntity.noContent().build();
    }
}
