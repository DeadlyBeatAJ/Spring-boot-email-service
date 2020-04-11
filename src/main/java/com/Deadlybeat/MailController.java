package com.Deadlybeat;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Deadlybeat.dto.MailRequest;
import com.Deadlybeat.dto.MailResponse;
import com.Deadlybeat.service.EmailService;

@RestController
public class MailController {

	@Autowired
	private EmailService service;
	
	
	@PostMapping("/SendEmail")
	public MailResponse sendEmail(@RequestBody MailRequest request) {
		
		Map<String,Object>model= new HashMap<>();
		//name can be taken from pojo as we are having the filed name in mailrequest POJO
		
		model.put("name", request.getName());
		model.put("location", "Mumbai");
		
		return service.sendEmail(request, model);
	}
	
}
