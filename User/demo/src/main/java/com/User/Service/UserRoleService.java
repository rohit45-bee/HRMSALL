package com.User.Service;



import com.User.Models.UserRole;

import java.util.List;

public interface UserRoleService {
    List<UserRole> getAllUserRoles();
    UserRole getUserRoleById(Long id);
    UserRole createUserRole(UserRole userRole);
    UserRole updateUserRole(Long id, UserRole userRole);
    void deleteUserRole(Long id);
}
