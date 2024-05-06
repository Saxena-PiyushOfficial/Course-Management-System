package io.cdac.springbootstart.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.cdac.springbootstart.Entity.Course;
import io.cdac.springbootstart.Entity.Topic;
import io.cdac.springbootstart.Service.CourseService;


@RestController
public class CourseController {
        @Autowired
	    private CourseService courseService;
	
        @RequestMapping("/topics/{id}/courses")
	public List<Course> getAllCourses(@PathVariable int id) {
		return courseService.getAllCourses(id);
	}
	
        @RequestMapping("/topics/{topicId}/courses/{courseId}")
	public Optional<Course> getCourseById(@PathVariable int courseId) {
		return courseService.getCourseById(courseId);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics/{topicId}/courses")
	public void addCourse(@PathVariable int topicId ,@RequestBody Course course) {
		
		course.setTopic(new Topic(topicId,"",""));
		courseService.addCourse(course);
	}
	@RequestMapping(method=RequestMethod.PUT,value="topics/{topicId}/courses/{id}")
	public void updateCourse(@PathVariable int topicId , @PathVariable int id,@RequestBody Course course) {
	 courseService.updateCourse(course);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="topics/{topicId}/courses/{id}")
	public void deleteCourse(@PathVariable int id) {
		courseService.deleteCourse(id);
	 
	}
}
