package com.EmpNo.Models;

import jakarta.persistence.*;

@Entity
@Table(name = "emp_picture")
public class EmpPicture {

    @Id
    @Column(name = "emp_number")
    private Long empNumber;

    @Column(name = "epic_picture", nullable = false)
    private byte[] picture;

    @Column(name = "epic_filename", nullable = false)
    private String fileName;

    @Column(name = "epic_type", nullable = false)
    private String fileType;

    @Column(name = "epic_file_size", nullable = false)
    private Long fileSize;

    @Column(name = "epic_file_width")
    private Integer fileWidth;

    public Long getEmpNumber() {
        return empNumber;
    }

    public void setEmpNumber(Long empNumber) {
        this.empNumber = empNumber;
    }

    public byte[] getPicture() {
        return picture;
    }

    public void setPicture(byte[] picture) {
        this.picture = picture;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Long getFileSize() {
        return fileSize;
    }

    public void setFileSize(Long fileSize) {
        this.fileSize = fileSize;
    }

    public Integer getFileWidth() {
        return fileWidth;
    }

    public void setFileWidth(Integer fileWidth) {
        this.fileWidth = fileWidth;
    }

    public Integer getFileHeight() {
        return fileHeight;
    }

    public void setFileHeight(Integer fileHeight) {
        this.fileHeight = fileHeight;
    }

    @Column(name = "epic_file_height")
    private Integer fileHeight;

    // Constructors, Getters, Setters, and toString method
}
