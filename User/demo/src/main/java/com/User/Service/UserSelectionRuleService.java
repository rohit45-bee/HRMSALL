package com.User.Service;



import com.User.Models.UserSelectionRule;

import java.util.List;

public interface UserSelectionRuleService {
    List<UserSelectionRule> getAllUserSelectionRules();
    UserSelectionRule getUserSelectionRuleById(Long id);
    UserSelectionRule createUserSelectionRule(UserSelectionRule userSelectionRule);
    UserSelectionRule updateUserSelectionRule(Long id, UserSelectionRule userSelectionRule);
    void deleteUserSelectionRule(Long id);
}
