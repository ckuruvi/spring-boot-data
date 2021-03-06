package io.learnspringdata.course;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CourseService {

	@Autowired
	private CourseRepository courseRepositiory;
		
	
	public List<Course> getAllCourses(String topicId){
		List<Course> courses=new ArrayList<>();
		
		courseRepositiory.findByTopicId(topicId).forEach(courses::add);
		
		return courses;
	}


	public Course getCourse(String id) {
		return courseRepositiory.findOne(id);
	}


	public void addCourse(Course course) {
		courseRepositiory.save(course);
	}
	
	public void updateCourse(Course course){
		courseRepositiory.save(course);
		
	}


	public void deleteCourse(String id) {
		courseRepositiory.delete(id);
	}
	
	
	
	
}
