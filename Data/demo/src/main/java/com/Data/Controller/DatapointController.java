package com.Data.Controller;


import com.Data.Models.Datapoint;
import com.Data.Service.DatapointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/datapoints")
public class DatapointController {

    @Autowired
    private DatapointService datapointService;

    @PostMapping
    public ResponseEntity<Datapoint> createDatapoint(@RequestBody Datapoint datapoint) {
        Datapoint createdDatapoint = datapointService.createDatapoint(datapoint);
        return ResponseEntity.ok(createdDatapoint);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Datapoint> getDatapointById(@PathVariable Long id) {
        Datapoint datapoint = datapointService.getDatapointById(id);
        if (datapoint != null) {
            return ResponseEntity.ok(datapoint);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping
    public ResponseEntity<List<Datapoint>> getAllDatapoints() {
        List<Datapoint> datapoints = datapointService.getAllDatapoints();
        return ResponseEntity.ok(datapoints);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Datapoint> updateDatapoint(@PathVariable Long id, @RequestBody Datapoint datapoint) {
        Datapoint updatedDatapoint = datapointService.updateDatapoint(id, datapoint);
        if (updatedDatapoint != null) {
            return ResponseEntity.ok(updatedDatapoint);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDatapoint(@PathVariable Long id) {
        datapointService.deleteDatapoint(id);
        return ResponseEntity.noContent().build();
    }
}
