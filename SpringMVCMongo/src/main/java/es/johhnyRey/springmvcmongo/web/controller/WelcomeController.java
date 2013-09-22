package es.johhnyRey.springmvcmongo.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import es.johnnyRey.springmvcmongo.web.beans.UserBean;


@Controller
@RequestMapping("/")
public class WelcomeController {

	
	@RequestMapping(value="/indexForm")
	public String index(Model model) {
		
		UserBean user = new UserBean();
		
		model.addAttribute("user", user);
		
		return "indexForm";
	}
	
	@RequestMapping(value="/showMessage")
	public String showMessage(@ModelAttribute UserBean user, Model model) {
		
		//Add this to MongoDB collection
		//TODO: do this
		
		model.addAttribute("userName", user.getName());
		model.addAttribute("userSurname", user.getSurname());
		model.addAttribute("userAge", user.getAge());
		
		return "showMessage";
	}
	
}
