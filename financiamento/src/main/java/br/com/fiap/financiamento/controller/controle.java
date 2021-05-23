package br.com.fiap.financiamento.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class controle {
	
	@GetMapping("/home2")
	public ModelAndView  inhtençãoes() {
	   ModelAndView	view = new ModelAndView("/home/home2");
		return view;
	}
	
}
