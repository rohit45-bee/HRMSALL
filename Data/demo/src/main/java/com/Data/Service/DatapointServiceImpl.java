package com.Data.Service;


import com.Data.Models.Datapoint;
import com.Data.Repository.DatapointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DatapointServiceImpl implements DatapointService {

    @Autowired
    private DatapointRepository datapointRepository;

    @Override
    public Datapoint createDatapoint(Datapoint datapoint) {
        return datapointRepository.save(datapoint);
    }

    @Override
    public Datapoint getDatapointById(Long id) {
        Optional<Datapoint> datapoint = datapointRepository.findById(id);
        return datapoint.orElse(null);
    }

    @Override
    public List<Datapoint> getAllDatapoints() {
        return datapointRepository.findAll();
    }

    @Override
    public Datapoint updateDatapoint(Long id, Datapoint updatedDatapoint) {
        Optional<Datapoint> existingDatapoint = datapointRepository.findById(id);
        if (existingDatapoint.isPresent()) {
            Datapoint datapoint = existingDatapoint.get();
            datapoint.setName(updatedDatapoint.getName());
            datapoint.setDatapointTypeId(updatedDatapoint.getDatapointTypeId());
            datapoint.setDefinition(updatedDatapoint.getDefinition());
            return datapointRepository.save(datapoint);
        }
        return null;
    }

    @Override
    public void deleteDatapoint(Long id) {
        datapointRepository.deleteById(id);
    }
}
