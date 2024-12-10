package com.User.Service;


import com.User.Configuration.ResourceNotFoundException;
import com.User.Models.UserSelectionRule;
import com.User.Repository.UserSelectionRuleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSelectionRuleServiceImpl implements UserSelectionRuleService {

    @Autowired
    private UserSelectionRuleRepository userSelectionRuleRepository;

    @Override
    public List<UserSelectionRule> getAllUserSelectionRules() {
        return userSelectionRuleRepository.findAll();
    }

    @Override
    public UserSelectionRule getUserSelectionRuleById(Long id) {
        return userSelectionRuleRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("UserSelectionRule not found with id " + id));
    }



    @Override
    public UserSelectionRule createUserSelectionRule(UserSelectionRule userSelectionRule) {
        return userSelectionRuleRepository.save(userSelectionRule);
    }

    @Override
    public UserSelectionRule updateUserSelectionRule(Long id, UserSelectionRule userSelectionRule) {
        UserSelectionRule existingUserSelectionRule = getUserSelectionRuleById(id);
        existingUserSelectionRule.setName(userSelectionRule.getName());
        existingUserSelectionRule.setDescription(userSelectionRule.getDescription());
        existingUserSelectionRule.setImplementationClass(userSelectionRule.getImplementationClass());
        existingUserSelectionRule.setRuleXmlData(userSelectionRule.getRuleXmlData());
        return userSelectionRuleRepository.save(existingUserSelectionRule);
    }

    @Override
    public void deleteUserSelectionRule(Long id) {
        userSelectionRuleRepository.deleteById(id);
    }
}
