package com.Data.Repository;


import com.Data.Models.DataGroupScreen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DataGroupScreenRepository extends JpaRepository<DataGroupScreen, Long> {
}
