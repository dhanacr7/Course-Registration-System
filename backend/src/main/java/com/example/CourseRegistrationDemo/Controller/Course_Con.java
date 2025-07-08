package com.example.CourseRegistrationDemo.Controller;
import java.util.*;

import com.example.CourseRegistrationDemo.Course.Course;
import com.example.CourseRegistrationDemo.CourseRegistry.CourseRegistry;
import com.example.CourseRegistrationDemo.Service.Course_ser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = {"http://127.0.0.1:5500", "http://localhost:5500"})

public class Course_Con {
    @Autowired
    Course_ser courseservice;
    @GetMapping("courses")
    public List<Course> availableCourses(){
        return courseservice.availableCourses();

    }
    @GetMapping("courses/enrolled")
    public List<CourseRegistry> enrolledStudents()
    {
        return courseservice.enrolledStudents();
    }
         @PostMapping("/courses/register")
         @CrossOrigin(origins = {"http://127.0.0.1:5500", "http://localhost:5500"})
    public String enrollcourse(@RequestParam("name") String name,@RequestParam("emailId")String emailId,@RequestParam("coursename")String coursename)
         {
             courseservice.enrollCourse(name,emailId,coursename);
             return "Congrats brother"+name+"Enrollment successfull for"+coursename;

         }

















}
