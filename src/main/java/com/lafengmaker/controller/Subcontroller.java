package com.lafengmaker.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller()
public class Subcontroller {
	Logger logger=Logger.getLogger(getClass());
	@RequestMapping(value="/sub/one")
	public String subOne(){
		logger.info("info");
		logger.debug("debug the logger....");
		return "sub/one";
	}
	@RequestMapping(value="sub/two")
	public String subTwo(){
		return "/sub/two";
	}
}
