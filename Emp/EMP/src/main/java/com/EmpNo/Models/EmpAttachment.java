package com.EmpNo.Models;


import jakarta.persistence.*;

@Entity
@Table(name = "emp_attachment")
public class EmpAttachment {

    public Long getEattachId() {
        return eattachId;
    }

    public void setEattachId(Long eattachId) {
        this.eattachId = eattachId;
    }

    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public String getEattachDesc() {
        return eattachDesc;
    }

    public void setEattachDesc(String eattachDesc) {
        this.eattachDesc = eattachDesc;
    }

    public String getEattachFilename() {
        return eattachFilename;
    }

    public void setEattachFilename(String eattachFilename) {
        this.eattachFilename = eattachFilename;
    }

    public Long getEattachSize() {
        return eattachSize;
    }

    public void setEattachSize(Long eattachSize) {
        this.eattachSize = eattachSize;
    }

    public String getEattachAttachment() {
        return eattachAttachment;
    }

    public void setEattachAttachment(String eattachAttachment) {
        this.eattachAttachment = eattachAttachment;
    }

    public String getEattachType() {
        return eattachType;
    }

    public void setEattachType(String eattachType) {
        this.eattachType = eattachType;
    }

    public String getScreen() {
        return screen;
    }

    public void setScreen(String screen) {
        this.screen = screen;
    }

    public Long getAttachedBy() {
        return attachedBy;
    }

    public void setAttachedBy(Long attachedBy) {
        this.attachedBy = attachedBy;
    }

    public String getAttachedByName() {
        return attachedByName;
    }

    public void setAttachedByName(String attachedByName) {
        this.attachedByName = attachedByName;
    }

    public String getAttachedTime() {
        return attachedTime;
    }

    public void setAttachedTime(String attachedTime) {
        this.attachedTime = attachedTime;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long eattachId; // Auto-generated primary key

    private Long empNumber; // Unique for each employee
    private String eattachDesc;
    private String eattachFilename;
    private Long eattachSize;
    private String eattachAttachment;
    private String eattachType;
    private String screen;
    private Long attachedBy;
    private String attachedByName;
    private String attachedTime;

    // Getters and Setters
}
