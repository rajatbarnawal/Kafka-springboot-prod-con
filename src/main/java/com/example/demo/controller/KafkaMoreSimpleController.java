package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.MoreSimpleModel;

@RestController
@RequestMapping("/api/more/kafka")
public class KafkaMoreSimpleController {
	@Autowired
    private KafkaTemplate<String, MoreSimpleModel> kafkaTemplate2;
	
	@PostMapping("/v2")
    public void post(@RequestBody MoreSimpleModel moreSimpleModel){
         //kafkaTemplate.send("myTopic2", jsonConverter.toJson(moreSimpleModel));
	
		kafkaTemplate2.send("myTopic2", moreSimpleModel);
    }
	
	 @KafkaListener(topics = "myTopic2", groupId="group__json", containerFactory="moreSimpleKafkaListenerContainerFactory")
	    public void consumeJson(MoreSimpleModel moreSimpleModel) {
	    	System.out.println("Consumed Json Message : " + moreSimpleModel);
	    }
 
}
