package io.cdac.springbootstart.Repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import io.cdac.springbootstart.Entity.Course;


@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
    public List<Course> findByTopicId(int TopicId);
//    public List<Course> findByName(String name);
//    public List<Course> findByDiscription(String description);
}
