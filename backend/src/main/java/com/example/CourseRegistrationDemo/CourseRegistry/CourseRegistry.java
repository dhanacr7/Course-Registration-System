package com.example.CourseRegistrationDemo.CourseRegistry;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
@Entity
public class CourseRegistry {
    @Id
    @GeneratedValue(strategy =GenerationType.IDENTITY)
    private int id;
    private String name;
    private String emailId;
    private String coursename;
    public CourseRegistry() {
    }

    public CourseRegistry(String name, String emailId, String coursename) {
        this.name=name;
        this.emailId=emailId;
        this.coursename=coursename;
    }

    public String getCoursename() {
        return coursename;
    }

    public void setCoursename(String coursename) {
        this.coursename = coursename;
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        this.emailId = emailId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
