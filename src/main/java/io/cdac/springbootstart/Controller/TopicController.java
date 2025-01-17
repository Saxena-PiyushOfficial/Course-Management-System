package io.cdac.springbootstart.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.cdac.springbootstart.Entity.Topic;
import io.cdac.springbootstart.Service.TopicService;


@RestController
public class TopicController {
        @Autowired
	    private TopicService topicService;
	
        @RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
        @RequestMapping("/topics/{id}")
	public Optional<Topic> getTopicById(@PathVariable int id) {
		return topicService.getTopicById(id);
	}
	@RequestMapping(method=RequestMethod.POST,value="/topics")
	public void addTopic(@RequestBody Topic topic) {
	 topicService.addTopic(topic);
	}
	@RequestMapping(method=RequestMethod.PUT,value="/topics/{id}")
	public void updateTopic(@RequestBody Topic topic,@PathVariable int id) {
	 topicService.updateTopic(id,topic);
	}
	@RequestMapping(method=RequestMethod.DELETE,value="/topics/{id}")
	public void deleteTopic(@PathVariable int id) {
	 topicService.deleteTopic(id);
	 
	}
}
