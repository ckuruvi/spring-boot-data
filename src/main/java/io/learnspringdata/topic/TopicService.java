package io.learnspringdata.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {

	@Autowired
	private TopicRepository topicRepositiory;
	
//	private List<Topic> topics=new ArrayList<>(Arrays.asList(
//			new Topic("Spring","Spring Framework","Spring Framework Desc"),
//			new Topic("java","core java","core java desc"),
//			new Topic("javascript","Javascript","Javascript Desc")
//			));
	
	
	public List<Topic> getAllTopics(){
		//return topics;
		List<Topic> topics=new ArrayList<>();
		
		topicRepositiory.findAll().forEach(topics::add);
		
		return topics;
	}


	public Topic getTopic(String id) {
		// TODO Auto-generated method stub
		//return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
		return topicRepositiory.findOne(id);
	}


	public void addTopic(Topic topic) {
		// TODO Auto-generated method stub
		//topics.add(topic);
		topicRepositiory.save(topic);
	}
	
	public void updateTopic(Topic topic,String id){
		topicRepositiory.save(topic);
		
	}


	public void deleteTopic(String id) {
		// TODO Auto-generated method stub
	   //topics.removeIf(a -> a.getId().equals(id));
		topicRepositiory.delete(id);
	}
	
	
	
	
}
