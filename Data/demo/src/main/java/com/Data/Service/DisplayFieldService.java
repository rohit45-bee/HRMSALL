package com.Data.Service;



import com.Data.Models.DisplayField;

import java.util.List;

public interface DisplayFieldService {
    DisplayField createDisplayField(DisplayField displayField);
    DisplayField updateDisplayField(Long displayFieldId, DisplayField displayField);
    DisplayField getDisplayFieldById(Long displayFieldId);
    List<DisplayField> getAllDisplayFields();
    void deleteDisplayField(Long displayFieldId);
}
