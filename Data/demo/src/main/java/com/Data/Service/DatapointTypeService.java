package com.Data.Service;



import com.Data.Models.DatapointType;

import java.util.List;

public interface DatapointTypeService {
    DatapointType createDatapointType(DatapointType datapointType);
    DatapointType updateDatapointType(Long id, DatapointType datapointType);
    DatapointType getDatapointTypeById(Long id);
    List<DatapointType> getAllDatapointTypes();
    void deleteDatapointType(Long id);
}
