package com.feedbackREST.feedbackREST;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//This class is used as a rest controller
@RestController
@RequestMapping("/main")
public class MainApp2 {
	@Autowired
	private FeedbackService feedbackService;
		
	@PostMapping("/add-feedback")
	public String addFeedback(@RequestParam("name")String name,@RequestParam("feedback")String feedback) {
		
		if(feedbackService.addFeedback(name, feedback)) {
			
		return "Feedback successfully submitted!";
		}
		return "Feedback was not submitted!";
	}
}
