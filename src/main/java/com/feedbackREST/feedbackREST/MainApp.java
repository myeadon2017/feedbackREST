package com.feedbackREST.feedbackREST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

//This class is used for mapping FeedbackService
@Controller
@RequestMapping("/main")
public class MainApp {
	
@Autowired
private FeedbackService feedbackService;
	
	@RequestMapping(value = "/add-feedback", method = RequestMethod.GET)
	
	public String addFeedback() {
		return "add-feedback";
	}
}
