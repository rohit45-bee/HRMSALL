package com.User.Controller;


import com.User.Models.UserSelectionRule;
import com.User.Service.UserSelectionRuleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-selection-rules")
public class UserSelectionRuleController {

    @Autowired
    private UserSelectionRuleService userSelectionRuleService;

    @GetMapping
    public List<UserSelectionRule> getAllUserSelectionRules() {
        return userSelectionRuleService.getAllUserSelectionRules();
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserSelectionRule> getUserSelectionRuleById(@PathVariable Long id) {
        UserSelectionRule userSelectionRule = userSelectionRuleService.getUserSelectionRuleById(id);
        return ResponseEntity.ok(userSelectionRule);
    }

    @PostMapping
    public UserSelectionRule createUserSelectionRule(@RequestBody UserSelectionRule userSelectionRule) {
        return userSelectionRuleService.createUserSelectionRule(userSelectionRule);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserSelectionRule> updateUserSelectionRule(@PathVariable Long id, @RequestBody UserSelectionRule userSelectionRule) {
        UserSelectionRule updatedUserSelectionRule = userSelectionRuleService.updateUserSelectionRule(id, userSelectionRule);
        return ResponseEntity.ok(updatedUserSelectionRule);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserSelectionRule(@PathVariable Long id) {
        userSelectionRuleService.deleteUserSelectionRule(id);
        return ResponseEntity.noContent().build();
    }
}
