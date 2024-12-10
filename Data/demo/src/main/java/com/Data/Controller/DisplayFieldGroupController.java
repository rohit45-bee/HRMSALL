package com.Data.Controller;



import com.Data.Models.DisplayFieldGroup;
import com.Data.Service.DisplayFieldGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/display-field-groups")
public class DisplayFieldGroupController {

    @Autowired
    private DisplayFieldGroupService displayFieldGroupService;

    @PostMapping
    public ResponseEntity<DisplayFieldGroup> createDisplayFieldGroup(@RequestBody DisplayFieldGroup displayFieldGroup) {
        DisplayFieldGroup createdGroup = displayFieldGroupService.createDisplayFieldGroup(displayFieldGroup);
        return ResponseEntity.ok(createdGroup);
    }

    @GetMapping
    public ResponseEntity<List<DisplayFieldGroup>> getAllDisplayFieldGroups() {
        List<DisplayFieldGroup> groups = displayFieldGroupService.getAllDisplayFieldGroups();
        return ResponseEntity.ok(groups);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DisplayFieldGroup> getDisplayFieldGroupById(@PathVariable Long id) {
        Optional<DisplayFieldGroup> group = displayFieldGroupService.getDisplayFieldGroupById(id);
        return group.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisplayFieldGroup> updateDisplayFieldGroup(@PathVariable Long id, @RequestBody DisplayFieldGroup displayFieldGroup) {
        DisplayFieldGroup updatedGroup = displayFieldGroupService.updateDisplayFieldGroup(id, displayFieldGroup);
        return ResponseEntity.ok(updatedGroup);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisplayFieldGroup(@PathVariable Long id) {
        displayFieldGroupService.deleteDisplayFieldGroup(id);
        return ResponseEntity.noContent().build();
    }
}
