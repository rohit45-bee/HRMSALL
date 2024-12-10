package com.Data.Service;



import com.Data.Models.Datapoint;

import java.util.List;

public interface DatapointService {
    Datapoint createDatapoint(Datapoint datapoint);
    Datapoint getDatapointById(Long id);
    List<Datapoint> getAllDatapoints();
    Datapoint updateDatapoint(Long id, Datapoint datapoint);
    void deleteDatapoint(Long id);
}
