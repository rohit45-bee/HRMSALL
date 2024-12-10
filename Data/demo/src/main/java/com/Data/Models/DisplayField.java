package com.Data.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "display_field")
public class DisplayField {
    public Boolean getSortable() {
        return isSortable;
    }

    public void setSortable(Boolean sortable) {
        isSortable = sortable;
    }

    public Boolean getExportable() {
        return isExportable;
    }

    public void setExportable(Boolean exportable) {
        isExportable = exportable;
    }

    public Boolean getValueList() {
        return isValueList;
    }

    public void setValueList(Boolean valueList) {
        isValueList = valueList;
    }

    public Boolean getEncrypted() {
        return isEncrypted;
    }

    public void setEncrypted(Boolean encrypted) {
        isEncrypted = encrypted;
    }

    public Boolean getMeta() {
        return isMeta;
    }

    public void setMeta(Boolean meta) {
        isMeta = meta;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "display_field_id")
    private Long displayFieldId;

    @Column(name = "report_group_id")
    private Long reportGroupId;

    private String name;
    private String label;
    private String fieldAlias;
    private Boolean isSortable;
    private Integer sortOrder;
    private String sortField;
    private String elementType;
    private String elementProperty;
    private Integer width;
    private Boolean isExportable;
    private String textAlignmentStyle;
    private Boolean isValueList;
    private Long displayFieldGroupId;
    private String defaultValue;
    private Boolean isEncrypted;
    private Boolean isMeta;

    // Constructors
    public DisplayField() {}

    public DisplayField(Long reportGroupId, String name, String label, String fieldAlias, Boolean isSortable, Integer sortOrder, String sortField, String elementType, String elementProperty, Integer width, Boolean isExportable, String textAlignmentStyle, Boolean isValueList, Long displayFieldGroupId, String defaultValue, Boolean isEncrypted, Boolean isMeta) {
        this.reportGroupId = reportGroupId;
        this.name = name;
        this.label = label;
        this.fieldAlias = fieldAlias;
        this.isSortable = isSortable;
        this.sortOrder = sortOrder;
        this.sortField = sortField;
        this.elementType = elementType;
        this.elementProperty = elementProperty;
        this.width = width;
        this.isExportable = isExportable;
        this.textAlignmentStyle = textAlignmentStyle;
        this.isValueList = isValueList;
        this.displayFieldGroupId = displayFieldGroupId;
        this.defaultValue = defaultValue;
        this.isEncrypted = isEncrypted;
        this.isMeta = isMeta;
    }

    // Getters and Setters
    public Long getDisplayFieldId() {
        return displayFieldId;
    }

    public void setDisplayFieldId(Long displayFieldId) {
        this.displayFieldId = displayFieldId;
    }

    public Long getReportGroupId() {
        return reportGroupId;
    }

    public void setReportGroupId(Long reportGroupId) {
        this.reportGroupId = reportGroupId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getFieldAlias() {
        return fieldAlias;
    }

    public void setFieldAlias(String fieldAlias) {
        this.fieldAlias = fieldAlias;
    }

    public Boolean getIsSortable() {
        return isSortable;
    }

    public void setIsSortable(Boolean isSortable) {
        this.isSortable = isSortable;
    }

    public Integer getSortOrder() {
        return sortOrder;
    }

    public void setSortOrder(Integer sortOrder) {
        this.sortOrder = sortOrder;
    }

    public String getSortField() {
        return sortField;
    }

    public void setSortField(String sortField) {
        this.sortField = sortField;
    }

    public String getElementType() {
        return elementType;
    }

    public void setElementType(String elementType) {
        this.elementType = elementType;
    }

    public String getElementProperty() {
        return elementProperty;
    }

    public void setElementProperty(String elementProperty) {
        this.elementProperty = elementProperty;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Boolean getIsExportable() {
        return isExportable;
    }

    public void setIsExportable(Boolean isExportable) {
        this.isExportable = isExportable;
    }

    public String getTextAlignmentStyle() {
        return textAlignmentStyle;
    }

    public void setTextAlignmentStyle(String textAlignmentStyle) {
        this.textAlignmentStyle = textAlignmentStyle;
    }

    public Boolean getIsValueList() {
        return isValueList;
    }

    public void setIsValueList(Boolean isValueList) {
        this.isValueList = isValueList;
    }

    public Long getDisplayFieldGroupId() {
        return displayFieldGroupId;
    }

    public void setDisplayFieldGroupId(Long displayFieldGroupId) {
        this.displayFieldGroupId = displayFieldGroupId;
    }

    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public Boolean getIsEncrypted() {
        return isEncrypted;
    }

    public void setIsEncrypted(Boolean isEncrypted) {
        this.isEncrypted = isEncrypted;
    }

    public Boolean getIsMeta() {
        return isMeta;
    }

    public void setIsMeta(Boolean isMeta) {
        this.isMeta = isMeta;
    }
}
