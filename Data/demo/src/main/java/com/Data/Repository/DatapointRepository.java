package com.Data.Repository;


import com.Data.Models.Datapoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatapointRepository extends JpaRepository<Datapoint, Long> {
}
