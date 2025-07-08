package com.example.CourseRegistrationDemo.Service;

import com.example.CourseRegistrationDemo.Course.Course;
import com.example.CourseRegistrationDemo.CourseRegistry.CourseRegistry;
import com.example.CourseRegistrationDemo.Repository.CourseRegRepo;
import com.example.CourseRegistrationDemo.Repository.Course_rep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Course_ser {
    @Autowired
    Course_rep courserep;
    @Autowired
    CourseRegRepo courseRegRepo;

    public List<Course> availableCourses() {
        return  courserep.findAll();

    }

    public List<CourseRegistry> enrolledStudents() {
        return courseRegRepo.findAll();
    }

    public void enrollCourse(String name, String emailId, String coursename) {
        CourseRegistry courseRegistry= new CourseRegistry(name,emailId,coursename);
        courseRegRepo.save(courseRegistry);
    }
}
