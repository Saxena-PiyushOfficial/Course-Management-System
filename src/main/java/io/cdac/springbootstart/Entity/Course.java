package io.cdac.springbootstart.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Course {
@Id
private Integer id;
private String name;
private String description;
@ManyToOne
private Topic topic;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Course() {
	super();
}
public Course(int id, String name, String description,int topicId) {
	super();
	this.id = id;
	this.name = name;
	this.description = description;
	this.topic=new Topic(topicId,"","");	
}
public Topic getTopic() {
	return topic;
}
public void setTopic(Topic topic) {
	this.topic = topic;
}

}
