package com.User.Controller;


import com.User.Models.UserRoleDataGroup;
import com.User.Service.UserRoleDataGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/user-role-data-groups")
public class UserRoleDataGroupController {

    @Autowired
    private UserRoleDataGroupService userRoleDataGroupService;

    @PostMapping
    public ResponseEntity<UserRoleDataGroup> createUserRoleDataGroup(@RequestBody UserRoleDataGroup userRoleDataGroup) {
        UserRoleDataGroup createdUserRoleDataGroup = userRoleDataGroupService.createUserRoleDataGroup(userRoleDataGroup);
        return ResponseEntity.ok(createdUserRoleDataGroup);
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserRoleDataGroup> getUserRoleDataGroupById(@PathVariable Long id) {
        UserRoleDataGroup userRoleDataGroup = userRoleDataGroupService.getUserRoleDataGroupById(id);
        return ResponseEntity.ok(userRoleDataGroup);
    }

    @GetMapping
    public ResponseEntity<List<UserRoleDataGroup>> getAllUserRoleDataGroups() {
        List<UserRoleDataGroup> userRoleDataGroups = userRoleDataGroupService.getAllUserRoleDataGroups();
        return ResponseEntity.ok(userRoleDataGroups);
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserRoleDataGroup> updateUserRoleDataGroup(@PathVariable Long id, @RequestBody UserRoleDataGroup userRoleDataGroup) {
        UserRoleDataGroup updatedUserRoleDataGroup = userRoleDataGroupService.updateUserRoleDataGroup(id, userRoleDataGroup);
        return ResponseEntity.ok(updatedUserRoleDataGroup);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteUserRoleDataGroup(@PathVariable Long id) {
        userRoleDataGroupService.deleteUserRoleDataGroup(id);
        return ResponseEntity.noContent().build();
    }
}
