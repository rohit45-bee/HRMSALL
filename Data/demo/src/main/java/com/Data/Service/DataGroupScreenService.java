package com.Data.Service;


import com.Data.Models.DataGroupScreen;

import java.util.List;

public interface DataGroupScreenService {
    DataGroupScreen createDataGroupScreen(DataGroupScreen dataGroupScreen);
    DataGroupScreen getDataGroupScreenById(Long id);
    List<DataGroupScreen> getAllDataGroupScreens();
    DataGroupScreen updateDataGroupScreen(Long id, DataGroupScreen dataGroupScreen);
    void deleteDataGroupScreen(Long id);
}
