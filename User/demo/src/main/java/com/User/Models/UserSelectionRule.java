package com.User.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "user_selection_rule")
public class UserSelectionRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    private String description;

    @Column(name = "implementation_class")
    private String implementationClass;

    @Lob // This annotation indicates that the column should be treated as a large object (BLOB or CLOB)
    @Column(name = "rule_xml_data")
    private String ruleXmlData;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImplementationClass() {
        return implementationClass;
    }

    public void setImplementationClass(String implementationClass) {
        this.implementationClass = implementationClass;
    }

    public String getRuleXmlData() {
        return ruleXmlData;
    }

    public void setRuleXmlData(String ruleXmlData) {
        this.ruleXmlData = ruleXmlData;
    }
}
