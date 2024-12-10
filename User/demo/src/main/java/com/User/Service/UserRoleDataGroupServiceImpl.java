package com.User.Service;



import com.User.Configuration.ResourceNotFoundException;
import com.User.Models.UserRoleDataGroup;
import com.User.Repository.UserRoleDataGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleDataGroupServiceImpl implements UserRoleDataGroupService {

    @Autowired
    private UserRoleDataGroupRepository userRoleDataGroupRepository;

    @Override
    public UserRoleDataGroup createUserRoleDataGroup(UserRoleDataGroup userRoleDataGroup) {
        return userRoleDataGroupRepository.save(userRoleDataGroup);
    }




    @Override
    public UserRoleDataGroup getUserRoleDataGroupById(Long id) {
        return userRoleDataGroupRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("UserRoleDataGroup not found with id " + id));
    }

    @Override
    public List<UserRoleDataGroup> getAllUserRoleDataGroups() {
        return userRoleDataGroupRepository.findAll();
    }

    @Override
    public UserRoleDataGroup updateUserRoleDataGroup(Long id, UserRoleDataGroup userRoleDataGroup) {
        UserRoleDataGroup existingUserRoleDataGroup = getUserRoleDataGroupById(id);
        existingUserRoleDataGroup.setUserRoleId(userRoleDataGroup.getUserRoleId());
        existingUserRoleDataGroup.setDataGroupId(userRoleDataGroup.getDataGroupId());
        existingUserRoleDataGroup.setCanRead(userRoleDataGroup.getCanRead());
        existingUserRoleDataGroup.setCanCreate(userRoleDataGroup.getCanCreate());
        existingUserRoleDataGroup.setCanUpdate(userRoleDataGroup.getCanUpdate());
        existingUserRoleDataGroup.setCanDelete(userRoleDataGroup.getCanDelete());
        existingUserRoleDataGroup.setSelf(userRoleDataGroup.getSelf());
        return userRoleDataGroupRepository.save(existingUserRoleDataGroup);
    }

    @Override
    public void deleteUserRoleDataGroup(Long id) {
        userRoleDataGroupRepository.deleteById(id);
    }
}
