package net.fujitsu.springmvc.helloworld.controller;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import net.fujitsu.springmvc.helloworld.model.HelloModel;

@Controller
public class HelloController {
	
	@RequestMapping("/helloworld")
	public String handler (Model model) {
		HelloModel helloworld = new HelloModel();
		helloworld.setMessage("Hello, I am just checking the working of Spring mVC app!!!");
		helloworld.setDateTime(LocalDateTime.now().toString());
		model.addAttribute("helloworld",helloworld);
		return "helloworld";
	}
}
