package com.feedbackREST.feedbackREST;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//This class is used as Feedback Service class in order for users to leave feedback
@Service
public class FeedbackService {

	
	@Autowired
	private FeedbackDao feedbackDao;
	
	public boolean addFeedback(String name, String feedback) {
		
		feedbackDao.save(new Feedback(name, feedback));
		return true;
	
	}
}
