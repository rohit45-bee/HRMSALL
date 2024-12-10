package com.User.Repository;


import com.User.Models.UserSelectionRule;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserSelectionRuleRepository extends JpaRepository<UserSelectionRule, Long> {
}
