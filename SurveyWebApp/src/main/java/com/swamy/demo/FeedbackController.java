package com.swamy.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class FeedbackController {
	@Autowired
	FeedbackRapo rapo;
	
	@RequestMapping(value="/")
	public String takeSurvey() {
		return "survey.html";
	}
	@RequestMapping(value="/submit")
	public String completedSurvey(Feedback feed) {
		rapo.save(feed);
		return "submit.html";
	}
}
