package com.Data.Repository;


import com.Data.Models.DataGroup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataGroupRepository extends JpaRepository<DataGroup, Long> {
}
