package com.ashwani.core4.controller;

import java.util.ArrayList;
//import java.util.logging.LogManager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ashwani.core4.entity.College;
import com.ashwani.core4.service.CollegeService;

//import ch.qos.logback.classic.Logger;

@RestController
public class MyController {
	@Autowired
	private static final Logger logger = LogManager.getLogger(MyController.class);
	@GetMapping("CollegeD")
	public String collegeDetails() {
		return "This is my colloge ";
	}
	@Autowired CollegeService a;
	
	@GetMapping("Colleges")
	public ArrayList<College> collegesDetails() {
		logger.info("hello");
				return a.getcollegeDetails();
	}

}
