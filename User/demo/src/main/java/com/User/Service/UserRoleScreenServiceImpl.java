package com.User.Service;


import com.User.Configuration.ResourceNotFoundException;
import com.User.Models.UserRoleScreen;
import com.User.Repository.UserRoleScreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserRoleScreenServiceImpl implements UserRoleScreenService {

    @Autowired
    private UserRoleScreenRepository userRoleScreenRepository;

    @Override
    public List<UserRoleScreen> getAllUserRoleScreens() {
        return userRoleScreenRepository.findAll();
    }

    @Override
    public UserRoleScreen getUserRoleScreenById(Long id) {
        return userRoleScreenRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("UserRoleScreen not found"));
    }



    @Override
    public UserRoleScreen createUserRoleScreen(UserRoleScreen userRoleScreen) {
        return userRoleScreenRepository.save(userRoleScreen);
    }

    @Override
    public UserRoleScreen updateUserRoleScreen(Long id, UserRoleScreen userRoleScreen) {
        UserRoleScreen existingUserRoleScreen = userRoleScreenRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("UserRoleScreen not found"));

        existingUserRoleScreen.setUserRoleId(userRoleScreen.getUserRoleId());
        existingUserRoleScreen.setScreenId(userRoleScreen.getScreenId());
        existingUserRoleScreen.setCanRead(userRoleScreen.isCanRead());
        existingUserRoleScreen.setCanCreate(userRoleScreen.isCanCreate());
        existingUserRoleScreen.setCanUpdate(userRoleScreen.isCanUpdate());
        existingUserRoleScreen.setCanDelete(userRoleScreen.isCanDelete());

        return userRoleScreenRepository.save(existingUserRoleScreen);
    }

    @Override
    public void deleteUserRoleScreen(Long id) {
        UserRoleScreen userRoleScreen = userRoleScreenRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("UserRoleScreen not found"));
        userRoleScreenRepository.delete(userRoleScreen);
    }
}
