package com.lafengmaker.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
public class MyController {
	private Logger logger=Logger.getLogger(getClass());
	@RequestMapping("/")
	public String loadwelcome(){
		logger.debug("debug====");
		logger.info("info====");
		return "index";
	}
	@RequestMapping("logout")
	public String logout(){
		logger.debug("logout==debug==");
		logger.info("logout==info==");
		return "redirect:/";
	}
}
