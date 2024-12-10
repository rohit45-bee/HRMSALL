package com.User.Controller;


import com.User.Models.UserRoleScreen;
import com.User.Service.UserRoleScreenService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-role-screens")
public class UserRoleScreenController {

    @Autowired
    private UserRoleScreenService userRoleScreenService;

    // Get all UserRoleScreens
    @GetMapping
    public ResponseEntity<List<UserRoleScreen>> getAllUserRoleScreens() {
        List<UserRoleScreen> userRoleScreens = userRoleScreenService.getAllUserRoleScreens();
        return ResponseEntity.ok(userRoleScreens);
    }

    // Get a single UserRoleScreen by ID
    @GetMapping("/{id}")
    public ResponseEntity<UserRoleScreen> getUserRoleScreenById(@PathVariable Long id) {
        UserRoleScreen userRoleScreen = userRoleScreenService.getUserRoleScreenById(id);
        return ResponseEntity.ok(userRoleScreen);
    }

    // Create a new UserRoleScreen
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<UserRoleScreen> createUserRoleScreen(@RequestBody UserRoleScreen userRoleScreen) {
        UserRoleScreen createdUserRoleScreen = userRoleScreenService.createUserRoleScreen(userRoleScreen);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdUserRoleScreen);
    }

    // Update an existing UserRoleScreen by ID
    @PutMapping("/{id}")
    public ResponseEntity<UserRoleScreen> updateUserRoleScreen(@PathVariable Long id, @RequestBody UserRoleScreen userRoleScreen) {
        UserRoleScreen updatedUserRoleScreen = userRoleScreenService.updateUserRoleScreen(id, userRoleScreen);
        return ResponseEntity.ok(updatedUserRoleScreen);
    }

    // Delete a UserRoleScreen by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserRoleScreen(@PathVariable Long id) {
        userRoleScreenService.deleteUserRoleScreen(id);
        return ResponseEntity.noContent().build();
    }
}
