package com.example.CourseRegistrationDemo.Repository;

import com.example.CourseRegistrationDemo.CourseRegistry.CourseRegistry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CourseRegRepo extends JpaRepository<CourseRegistry,Integer> {
}
