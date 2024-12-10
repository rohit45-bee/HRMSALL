package com.Data.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "datapoint")
public class Datapoint {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "datapoint_type_id")
    private Long datapointTypeId;

    private String definition;

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

    public Long getDatapointTypeId() {
        return datapointTypeId;
    }

    public void setDatapointTypeId(Long datapointTypeId) {
        this.datapointTypeId = datapointTypeId;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }
}
