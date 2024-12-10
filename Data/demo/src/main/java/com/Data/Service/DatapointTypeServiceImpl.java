package com.Data.Service;


import com.Data.Models.DatapointType;
import com.Data.Repository.DatapointTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatapointTypeServiceImpl implements DatapointTypeService {

    @Autowired
    private DatapointTypeRepository datapointTypeRepository;

    @Override
    public DatapointType createDatapointType(DatapointType datapointType) {
        return datapointTypeRepository.save(datapointType);
    }

    @Override
    public DatapointType updateDatapointType(Long id, DatapointType datapointType) {
        Optional<DatapointType> existingDatapointType = datapointTypeRepository.findById(id);
        if (existingDatapointType.isPresent()) {
            DatapointType updated = existingDatapointType.get();
            updated.setName(datapointType.getName());
            updated.setActionClass(datapointType.getActionClass());
            return datapointTypeRepository.save(updated);
        }
        return null; // Handle 'not found' scenario
    }



    @Override
    public DatapointType getDatapointTypeById(Long id) {
        return datapointTypeRepository.findById(id).orElse(null);
    }

    @Override
    public List<DatapointType> getAllDatapointTypes() {
        return datapointTypeRepository.findAll();
    }

    @Override
    public void deleteDatapointType(Long id) {
        datapointTypeRepository.deleteById(id);
    }
}
