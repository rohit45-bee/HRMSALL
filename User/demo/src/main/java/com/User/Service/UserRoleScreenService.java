package com.User.Service;



import com.User.Models.UserRoleScreen;

import java.util.List;

public interface UserRoleScreenService {
    List<UserRoleScreen> getAllUserRoleScreens();
    UserRoleScreen getUserRoleScreenById(Long id);
    UserRoleScreen createUserRoleScreen(UserRoleScreen userRoleScreen);
    UserRoleScreen updateUserRoleScreen(Long id, UserRoleScreen userRoleScreen);
    void deleteUserRoleScreen(Long id);
}
