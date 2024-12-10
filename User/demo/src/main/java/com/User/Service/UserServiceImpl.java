package com.User.Service;


import com.User.Models.User;
import com.User.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public User updateUser(Long id, User user) {
        Optional<User> existingUser = userRepository.findById(id);
        if (existingUser.isPresent()) {
            User updatedUser = existingUser.get();
            updatedUser.setUserRoleId(user.getUserRoleId());
            updatedUser.setEmpNumber(user.getEmpNumber());
            updatedUser.setUserName(user.getUserName());
            updatedUser.setUserPassword(user.getUserPassword());
            updatedUser.setDeleted(user.getDeleted());
            updatedUser.setStatus(user.getStatus());
            updatedUser.setDateEntered(user.getDateEntered());
            updatedUser.setDateModified(user.getDateModified());
            updatedUser.setModifiedUserId(user.getModifiedUserId());
            updatedUser.setCreatedBy(user.getCreatedBy());
            return userRepository.save(updatedUser);
        } else {
            throw new RuntimeException("User not found with id " + id);
        }
    }


    @Override
    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }

    @Override
    public User getUserById(Long id) {
        return userRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("User not found with id " + id));
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
