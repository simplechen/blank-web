package com.yourdomain.controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 参数调用相关
 * http://www.commonj.com/blogs/2012/06/01/spring-mvc-3-tutorial-passing-request-parameters-to-controllers/
 * http://stackoverflow.com/questions/5834938/java-spring-mvc-get-post-in-same-jsp
 * http://www.commonj.com/blogs/2013/01/05/spring-mvc-tutorial-controller-example-passing-array-of-request-param/
 * @author simple
 *
 */
@Controller
public class IndexController{
	private static final Logger logger = Logger.getLogger(IndexController.class);
	
	//默认页面
//	@RequestMapping(value = "/")
//	public String def(Model model){
//		return "index";
//	}

	@RequestMapping(value = "index",method =RequestMethod.GET)
	public void index(@RequestParam(value="name",required=false) String name,HttpServletRequest request,Model model) {
//		System.err.println("exec time:"+System.currentTimeMillis());
//		System.err.println("参数个数："+request.getContentLength());
//		System.err.println("passwd:"+request.getParameter("passwd"));
		
		if(null!=name && name.length()>0){
			System.err.println("+"+name);
			model.addAttribute("name", name);
		} else {
			model.addAttribute("name", "Simple");
		}
		
		logger.info("----start ---");
	}
	
	
		
//	@RequestMapping(value="user.action",params ="what",method =RequestMethod.GET)
//	public void user(Model model){
//		model.addAttribute("name", "Simple");
//	}
	
	
//	http://stackoverflow.com/questions/5834938/java-spring-mvc-get-post-in-same-jsp
//	@RequestMapping(value = "/add", method = RequestMethod.POST)
//	public String added(@RequestParam("name") String name, Model model) {
//	    City city = new City();
//	    city.setCity(name);
//	    service.addCity(city);
//	    return "add";
//	}
	
//	@RequestMapping(value = "/setmycolors", method = RequestMethod.POST)  
//	public ModelAndView handleMyArrayVals(@RequestParam(value = "myColor", required = true) String[] myColor, HttpServletRequest request, HttpServletResponse response) throws Exception {  
//	    return new ModelAndView("index");  
//	} 
	
	//Spring MVC Ajax Controllers

}
