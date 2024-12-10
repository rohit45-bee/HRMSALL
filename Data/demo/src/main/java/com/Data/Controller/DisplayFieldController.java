package com.Data.Controller;



import com.Data.Models.DisplayField;
import com.Data.Service.DisplayFieldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/display-fields")
public class DisplayFieldController {

    @Autowired
    private DisplayFieldService displayFieldService;

    @PostMapping
    public ResponseEntity<DisplayField> createDisplayField(@RequestBody DisplayField displayField) {
        return ResponseEntity.ok(displayFieldService.createDisplayField(displayField));
    }

    @PutMapping("/{id}")
    public ResponseEntity<DisplayField> updateDisplayField(@PathVariable("id") Long displayFieldId, @RequestBody DisplayField displayField) {
        return ResponseEntity.ok(displayFieldService.updateDisplayField(displayFieldId, displayField));
    }

    @GetMapping("/{id}")
    public ResponseEntity<DisplayField> getDisplayFieldById(@PathVariable("id") Long displayFieldId) {
        return ResponseEntity.ok(displayFieldService.getDisplayFieldById(displayFieldId));
    }

    @GetMapping
    public ResponseEntity<List<DisplayField>> getAllDisplayFields() {
        return ResponseEntity.ok(displayFieldService.getAllDisplayFields());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteDisplayField(@PathVariable("id") Long displayFieldId) {
        displayFieldService.deleteDisplayField(displayFieldId);
        return ResponseEntity.noContent().build();
    }
}
