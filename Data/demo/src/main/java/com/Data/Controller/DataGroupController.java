package com.Data.Controller;


import com.Data.Models.DataGroup;
import com.Data.Service.DataGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/dataGroup")
public class DataGroupController {

    @Autowired
    private DataGroupService dataGroupService;

    @PostMapping
    public ResponseEntity<DataGroup> createDataGroup(@RequestBody DataGroup dataGroup) {
        DataGroup savedDataGroup = dataGroupService.saveDataGroup(dataGroup);
        return ResponseEntity.ok(savedDataGroup);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DataGroup> getDataGroupById(@PathVariable Long id) {
        Optional<DataGroup> dataGroup = dataGroupService.getDataGroupById(id);
        return dataGroup.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @GetMapping
    public ResponseEntity<List<DataGroup>> getAllDataGroups() {
        List<DataGroup> dataGroups = dataGroupService.getAllDataGroups();
        return ResponseEntity.ok(dataGroups);
    }

    @PutMapping("/{id}")
    public ResponseEntity<DataGroup> updateDataGroup(@PathVariable Long id, @RequestBody DataGroup dataGroup) {
        if (!dataGroupService.getDataGroupById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        dataGroup.setId(id);
        DataGroup updatedDataGroup = dataGroupService.updateDataGroup(dataGroup);
        return ResponseEntity.ok(updatedDataGroup);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDataGroup(@PathVariable Long id) {
        if (!dataGroupService.getDataGroupById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        dataGroupService.deleteDataGroup(id);
        return ResponseEntity.noContent().build();
    }
}
