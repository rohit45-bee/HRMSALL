package com.User.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "user_roles")
public class UserRole {
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

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public boolean isAssignable() {
        return isAssignable;
    }

    public void setAssignable(boolean assignable) {
        isAssignable = assignable;
    }

    public boolean isPredefined() {
        return isPredefined;
    }

    public void setPredefined(boolean predefined) {
        isPredefined = predefined;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Column(name = "display_name")
    private String displayName;

    @Column(name = "is_assignable")
    private boolean isAssignable;

    @Column(name = "is_predefined")
    private boolean isPredefined;

    // Getters and Setters
}
