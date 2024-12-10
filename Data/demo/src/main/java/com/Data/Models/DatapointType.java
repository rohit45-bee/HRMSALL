package com.Data.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "datapoint_type")
public class DatapointType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String actionClass;

    // Constructors
    public DatapointType() {}

    public DatapointType(String name, String actionClass) {
        this.name = name;
        this.actionClass = actionClass;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActionClass() {
        return actionClass;
    }

    public void setActionClass(String actionClass) {
        this.actionClass = actionClass;
    }
}
