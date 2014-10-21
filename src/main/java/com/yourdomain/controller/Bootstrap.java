package com.yourdomain.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class Bootstrap {
	private static final Logger logger = Logger.getLogger(Bootstrap.class);
	@RequestMapping(value = "/bootstrap/index", method = RequestMethod.GET)
	public String topUI(Model model) {
		logger.debug("---here");
		return "bootstrap/index";
	}

}
