package io.cdac.springbootstart.Repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import io.cdac.springbootstart.Entity.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, Integer>{
//	   public List<Topic> findAll();
//	   public Optional<Topic> findById(int id);
//	   public void deleteById(int id);
}
