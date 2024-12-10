package com.User.Service;




import com.User.Models.UserRoleDataGroup;

import java.util.List;

public interface UserRoleDataGroupService {
    UserRoleDataGroup createUserRoleDataGroup(UserRoleDataGroup userRoleDataGroup);
    UserRoleDataGroup getUserRoleDataGroupById(Long id);
    List<UserRoleDataGroup> getAllUserRoleDataGroups();
    UserRoleDataGroup updateUserRoleDataGroup(Long id, UserRoleDataGroup userRoleDataGroup);
    void deleteUserRoleDataGroup(Long id);
}
