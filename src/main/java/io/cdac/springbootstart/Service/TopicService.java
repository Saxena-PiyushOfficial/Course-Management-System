package io.cdac.springbootstart.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.cdac.springbootstart.Entity.Topic;
import io.cdac.springbootstart.Repository.TopicRepository;

@Service
public class TopicService {
@Autowired
	private TopicRepository topicRepository;
	
	
	//private List<Topic> topics=new ArrayList<>(Arrays.asList(new Topic(1,"Spring","SpringFramework"),new Topic(2,"JDBC","ORM Tools"),new Topic(3,"Hibernate","ORM Tools")));
	public List<Topic> getAllTopics(){
		return topicRepository.findAll();
	}
	public Optional<Topic> getTopicById(int id){
		//return topics.stream().filter(t->t.getId()==id).findFirst().get();
	    return topicRepository.findById(id);
	}
	public void addTopic(Topic topic){	
	    //topics.add(topic);
		topicRepository.save(topic);
		
	}
	public void updateTopic(int id,Topic topic){	
//		//for(int i=0;i<topics.size();i++)
//		//{
//		//	Topic t=topics.get(i);
//			//if(t.getId()==id)
//			//{
//			//	topics.set(i, topic);
//				//return;
//			//}
//		}
		topicRepository.save(topic);
	}
	public void deleteTopic(int id){	
		
				//topics.removeIf(t->t.getId()==id);
		topicRepository.deleteById(id);
	}

}
