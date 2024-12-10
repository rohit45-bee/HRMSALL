package com.User.Repository;


import com.User.Models.UserRoleDataGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRoleDataGroupRepository extends JpaRepository<UserRoleDataGroup, Long> {
}
