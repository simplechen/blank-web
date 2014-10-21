package com.yourdomain.controller;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class AjaxController {
	
	@RequestMapping(value = "/helloajax", method = RequestMethod.GET)
	public @ResponseBody
	void fetchFlowDowns(HttpServletResponse response) throws Exception {

		String helloAjax = "<b>Hello Ajax----simple</b>";
		response.setCharacterEncoding("UTF-8");
		response.setContentType("text/html");
		response.getWriter().write(helloAjax);
	}
}
