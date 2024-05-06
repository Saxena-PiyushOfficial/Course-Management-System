package io.cdac.springbootstart.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import io.cdac.springbootstart.Entity.Course;
import io.cdac.springbootstart.Repository.CourseRepository;

@Service
public class CourseService {
@Autowired
	private CourseRepository CourseRepository;
	
	
	
	public List<Course> getAllCourses(int topicId){
		return CourseRepository.findByTopicId(topicId);
	}
	public Optional<Course> getCourseById(int id){
		
	    return CourseRepository.findById(id);
	}
	public void addCourse(Course course){	
		CourseRepository.save(course);
		
	}
	public void updateCourse(Course course){	

		CourseRepository.save(course);
	}
	public void deleteCourse(int id){	
						CourseRepository.deleteById(id);
	}

}
