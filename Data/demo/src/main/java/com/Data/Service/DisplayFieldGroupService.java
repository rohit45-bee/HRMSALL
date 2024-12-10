package com.Data.Service;




import com.Data.Models.DisplayFieldGroup;

import java.util.List;
import java.util.Optional;

public interface DisplayFieldGroupService {
    DisplayFieldGroup createDisplayFieldGroup(DisplayFieldGroup displayFieldGroup);

    List<DisplayFieldGroup> getAllDisplayFieldGroups();

    Optional<DisplayFieldGroup> getDisplayFieldGroupById(Long id);

    DisplayFieldGroup updateDisplayFieldGroup(Long id, DisplayFieldGroup displayFieldGroup);

    void deleteDisplayFieldGroup(Long id);
}
