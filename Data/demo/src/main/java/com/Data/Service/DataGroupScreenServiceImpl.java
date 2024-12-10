package com.Data.Service;


import com.Data.Models.DataGroupScreen;
import com.Data.Repository.DataGroupScreenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DataGroupScreenServiceImpl implements com.Data.Service.DataGroupScreenService {

    @Autowired
    private DataGroupScreenRepository repository;

    @Override
    public DataGroupScreen createDataGroupScreen(DataGroupScreen dataGroupScreen) {
        return repository.save(dataGroupScreen);
    }

    @Override
    public DataGroupScreen getDataGroupScreenById(Long id) {
        return repository.findById(id).orElse(null);
    }

    @Override
    public List<DataGroupScreen> getAllDataGroupScreens() {
        return repository.findAll();
    }

    @Override
    public DataGroupScreen updateDataGroupScreen(Long id, DataGroupScreen dataGroupScreen) {
        if (repository.existsById(id)) {
            dataGroupScreen.setId(id);
            return repository.save(dataGroupScreen);
        }
        return null;
    }

    @Override
    public void deleteDataGroupScreen(Long id) {
        if (repository.existsById(id)) {
            repository.deleteById(id);
        }
    }
}
