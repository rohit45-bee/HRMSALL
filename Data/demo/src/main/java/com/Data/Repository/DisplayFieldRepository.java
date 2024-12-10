package com.Data.Repository;


import com.Data.Models.DisplayField;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DisplayFieldRepository extends JpaRepository<DisplayField, Long> {
}
