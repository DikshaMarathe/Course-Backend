package com.example.demo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.example.demo.Course;

@Repository
public interface Repository1 extends JpaRepository<Course,Long> {
	Course findById(long id);
	void deleteById(long id);
	
}
