package com.Data.Repository;


import com.Data.Models.DisplayFieldGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisplayFieldGroupRepository extends JpaRepository<DisplayFieldGroup, Long> {
}
