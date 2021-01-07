package com.feedbackREST.feedbackREST;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

//This FeedbackDao is used as a repository
@Repository
public interface FeedbackDao extends CrudRepository<Feedback, String>{

}
