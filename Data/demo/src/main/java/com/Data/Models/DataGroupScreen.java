package com.Data.Models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "data_group_screen")
public class DataGroupScreen {

    @Id
    private Long id; // Primary key field

    @Column(name = "data_group_id")
    private Long dataGroupId;

    @Column(name = "screen_id")
    private Long screenId;

    @Column(name = "permission")
    private String permission;

    // Getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDataGroupId() {
        return dataGroupId;
    }

    public void setDataGroupId(Long dataGroupId) {
        this.dataGroupId = dataGroupId;
    }

    public Long getScreenId() {
        return screenId;
    }

    public void setScreenId(Long screenId) {
        this.screenId = screenId;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
