package com.amolbi.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class WelcomeActionController {
	 @RequestMapping("/helloworld")
	 public ModelAndView hello() {
		 System.out.println("WelcomeActionController.hello()");
	  String helloWorldMessage = "Hello world from AmolBi Tutorial!";
	  return new ModelAndView("Home", "message", helloWorldMessage);
	 }
}
