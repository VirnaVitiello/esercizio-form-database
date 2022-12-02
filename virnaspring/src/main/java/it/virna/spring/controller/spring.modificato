package it.virna.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.virna.spring.model.SignUpForm;

@Controller
public class GreetingController {

	@GetMapping("/home")
	public String home() {
		return "home";
	}
	@GetMapping("/chisono")
	public String chisono() {
		return "chisono";
	}
	@GetMapping("/contattami")
	public String contattami() {
		return "contattami";
	}
	
	@GetMapping(path = "/signup")
	public String getSignUpForm() {

		return "signup-form";

	}

//method to get signupform details
	@PostMapping(path = "/signup-submit")
	public String submitSignUp(@ModelAttribute SignUpForm signUpForm, Model model) {

		model.addAttribute("signUpForm", signUpForm);
		signUpForm.create(signUpForm);
		System.out.print(signUpForm.toString());
		return "signup-success";
	}
}

