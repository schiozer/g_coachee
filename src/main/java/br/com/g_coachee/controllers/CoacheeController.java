package br.com.g_coachee.controllers;


import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.ModelAndView;

import br.com.g_coachee.models.Coachee;

@Controller
@Scope(value=WebApplicationContext.SCOPE_REQUEST)
public class CoacheeController {
	
	@RequestMapping("/coachee/register")
	public ModelAndView form(Coachee coachee) {

		ModelAndView modelAndView = new ModelAndView("coachee/register");
		//modelAndView.addObject("types", BookType.values());
		return modelAndView;
	}
}
