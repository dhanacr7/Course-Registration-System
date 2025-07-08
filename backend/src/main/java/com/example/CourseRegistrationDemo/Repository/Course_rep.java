package com.example.CourseRegistrationDemo.Repository;

import com.example.CourseRegistrationDemo.Course.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface Course_rep extends JpaRepository<Course,String> {


}
