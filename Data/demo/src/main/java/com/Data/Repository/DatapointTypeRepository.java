package com.Data.Repository;

import com.Data.Models.DatapointType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DatapointTypeRepository extends JpaRepository<DatapointType, Long> {
}
