package com.Data.Service;



import com.Data.Models.DataGroup;

import java.util.List;
import java.util.Optional;

public interface DataGroupService {

    DataGroup saveDataGroup(DataGroup dataGroup);

    Optional<DataGroup> getDataGroupById(Long id);

    List<DataGroup> getAllDataGroups();

    void deleteDataGroup(Long id);

    DataGroup updateDataGroup(DataGroup dataGroup);
}
