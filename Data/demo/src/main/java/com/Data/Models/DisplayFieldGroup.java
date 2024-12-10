package com.Data.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "display_field_groups")
public class DisplayFieldGroup {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "report_group_id")
    private Long reportGroupId;

    @Column(name = "name")
    private String name;

    @Column(name = "is_list")
    private Boolean isList;

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public Boolean getIsList() {
        return isList;
    }

    public void setIsList(Boolean isList) {
        this.isList = isList;
    }
}
