package com.Data.Service;


import com.Data.Models.DataGroup;
import com.Data.Repository.DataGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataGroupServiceImpl implements DataGroupService {

    @Autowired
    private DataGroupRepository dataGroupRepository;

    @Override
    public DataGroup saveDataGroup(DataGroup dataGroup) {
        return dataGroupRepository.save(dataGroup);
    }


    @Override
    public Optional<DataGroup> getDataGroupById(Long id) {
        return dataGroupRepository.findById(id);
    }

    @Override
    public List<DataGroup> getAllDataGroups() {
        return dataGroupRepository.findAll();
    }

    @Override
    public void deleteDataGroup(Long id) {
        dataGroupRepository.deleteById(id);
    }

    @Override
    public DataGroup updateDataGroup(DataGroup dataGroup) {
        return dataGroupRepository.save(dataGroup);
    }
}
