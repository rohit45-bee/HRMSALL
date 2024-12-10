package com.User.Service;


import com.User.Configuration.ResourceNotFoundException;
import com.User.Models.UserRole;
import com.User.Repository.UserRoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleServiceImpl implements UserRoleService {

    @Autowired
    private UserRoleRepository userRoleRepository;

    @Override
    public List<UserRole> getAllUserRoles() {
        return userRoleRepository.findAll();
    }

    @Override
    public UserRole getUserRoleById(Long id) {
        return userRoleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("UserRole not found with id " + id));
    }



    @Override
    public UserRole createUserRole(UserRole userRole) {
        return userRoleRepository.save(userRole);
    }

    @Override
    public UserRole updateUserRole(Long id, UserRole userRole) {
        UserRole existingUserRole = getUserRoleById(id);
        existingUserRole.setName(userRole.getName());
        existingUserRole.setDisplayName(userRole.getDisplayName());
        existingUserRole.setAssignable(userRole.isAssignable());
        existingUserRole.setPredefined(userRole.isPredefined());
        return userRoleRepository.save(existingUserRole);
    }

    @Override
    public void deleteUserRole(Long id) {
        userRoleRepository.deleteById(id);
    }
}
