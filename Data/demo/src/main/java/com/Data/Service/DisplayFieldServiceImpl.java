package com.Data.Service;



import com.Data.Configuration.ResourceNotFoundException;
import com.Data.Models.DisplayField;
import com.Data.Repository.DisplayFieldRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DisplayFieldServiceImpl implements DisplayFieldService {

    @Autowired
    private DisplayFieldRepository displayFieldRepository;

    @Override
    public DisplayField createDisplayField(DisplayField displayField) {
        return displayFieldRepository.save(displayField);
    }

    @Override
    public DisplayField updateDisplayField(Long displayFieldId, DisplayField displayField) {
        Optional<DisplayField> existingDisplayField = displayFieldRepository.findById(displayFieldId);
        if (existingDisplayField.isPresent()) {
            DisplayField updatedDisplayField = existingDisplayField.get();
            updatedDisplayField.setName(displayField.getName());
            updatedDisplayField.setLabel(displayField.getLabel());
            updatedDisplayField.setFieldAlias(displayField.getFieldAlias());
            updatedDisplayField.setIsSortable(displayField.getIsSortable());
            updatedDisplayField.setSortOrder(displayField.getSortOrder());
            updatedDisplayField.setSortField(displayField.getSortField());
            updatedDisplayField.setElementType(displayField.getElementType());
            updatedDisplayField.setElementProperty(displayField.getElementProperty());
            updatedDisplayField.setWidth(displayField.getWidth());
            updatedDisplayField.setIsExportable(displayField.getIsExportable());
            updatedDisplayField.setTextAlignmentStyle(displayField.getTextAlignmentStyle());
            updatedDisplayField.setIsValueList(displayField.getIsValueList());
            updatedDisplayField.setDisplayFieldGroupId(displayField.getDisplayFieldGroupId());
            updatedDisplayField.setDefaultValue(displayField.getDefaultValue());
            updatedDisplayField.setIsEncrypted(displayField.getIsEncrypted());
            updatedDisplayField.setIsMeta(displayField.getIsMeta());
            return displayFieldRepository.save(updatedDisplayField);
        } else {
            throw new ResourceNotFoundException("DisplayField not found with id " + displayFieldId);
        }
    }




    @Override
    public DisplayField getDisplayFieldById(Long displayFieldId) {
        return displayFieldRepository.findById(displayFieldId)
                .orElseThrow(() -> new ResourceNotFoundException("DisplayField not found with id " + displayFieldId));
    }

    @Override
    public List<DisplayField> getAllDisplayFields() {
        return displayFieldRepository.findAll();
    }

    @Override
    public void deleteDisplayField(Long displayFieldId) {
        DisplayField displayField = displayFieldRepository.findById(displayFieldId)
                .orElseThrow(() -> new ResourceNotFoundException("DisplayField not found with id " + displayFieldId));
        displayFieldRepository.delete(displayField);
    }
}
