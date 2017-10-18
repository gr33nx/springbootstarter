package com.example.springbootstarter.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	List<Topic> topics = Arrays.asList(
			new Topic("spring", "Spring Framework", "Description"),
			new Topic("spring2", "Spring Framework2", "Description2")
			
			);
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
}
