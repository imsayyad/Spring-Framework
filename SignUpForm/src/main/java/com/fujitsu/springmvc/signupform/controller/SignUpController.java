package com.fujitsu.springmvc.signupform.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.fujitsu.springmvc.signupform.model.SignUpModel;

@Controller
public class SignUpController {
	
	@ModelAttribute("signUpModel")
	public SignUpModel setSignUpModel() {
		return new SignUpModel();
	}
	
	@GetMapping("showSignUpForm")
	public String showForm() {
		return "signup-form";
	}
	
	@PostMapping("/saveSignUpForm")
	public String saveUser(@ModelAttribute("signUpModel") SignUpModel signUpModel,ModelMap model) {
		
		System.out.println("First Name : "+signUpModel.getFirstName());
		System.out.println("Last Name : "+signUpModel.getLastName());
		System.out.println("Email : "+signUpModel.getEmail());
		System.out.println("User Name : "+signUpModel.getUserName());
		System.out.println("Password : "+signUpModel.getPassWord());
				
		model.addAttribute("message","User Details Saved Successfully!!!");
		model.addAttribute("user",signUpModel);
		
		return "signup-success";
		
	}
	
}
