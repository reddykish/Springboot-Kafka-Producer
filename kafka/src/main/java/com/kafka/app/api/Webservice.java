package com.kafka.app.api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class Webservice {
	private static String Topic="Employee";
	@Autowired
	private KafkaTemplate<String, Object> template;
	
	//posting object
	@PostMapping(value="add",consumes = MediaType.APPLICATION_JSON_VALUE)
	public String  adddata(@RequestBody Employee obj)
	{
		System.out.println(obj);
		template.send(Topic,obj);
		return "published employee object sucessfully";
	}
	
	//posting the string 
	@GetMapping(value="add")
	public String adddata()
	{
		String data="hello world";
		template.send(Topic,data);
		return "published String data";
	}

}
