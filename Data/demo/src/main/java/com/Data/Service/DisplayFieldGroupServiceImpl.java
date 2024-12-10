package com.Data.Service;



import com.Data.Models.DisplayFieldGroup;
import com.Data.Repository.DisplayFieldGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisplayFieldGroupServiceImpl implements DisplayFieldGroupService {

    @Autowired
    private DisplayFieldGroupRepository displayFieldGroupRepository;

    @Override
    public DisplayFieldGroup createDisplayFieldGroup(DisplayFieldGroup displayFieldGroup) {
        return displayFieldGroupRepository.save(displayFieldGroup);
    }



    @Override
    public List<DisplayFieldGroup> getAllDisplayFieldGroups() {
        return displayFieldGroupRepository.findAll();
    }

    @Override
    public Optional<DisplayFieldGroup> getDisplayFieldGroupById(Long id) {
        return displayFieldGroupRepository.findById(id);
    }

    @Override
    public DisplayFieldGroup updateDisplayFieldGroup(Long id, DisplayFieldGroup displayFieldGroup) {
        Optional<DisplayFieldGroup> existingGroup = displayFieldGroupRepository.findById(id);
        if (existingGroup.isPresent()) {
            DisplayFieldGroup groupToUpdate = existingGroup.get();
            groupToUpdate.setReportGroupId(displayFieldGroup.getReportGroupId());
            groupToUpdate.setName(displayFieldGroup.getName());
            groupToUpdate.setIsList(displayFieldGroup.getIsList());
            return displayFieldGroupRepository.save(groupToUpdate);
        } else {
            throw new RuntimeException("DisplayFieldGroup not found with id " + id);
        }
    }

    @Override
    public void deleteDisplayFieldGroup(Long id) {
        displayFieldGroupRepository.deleteById(id);
    }
}
