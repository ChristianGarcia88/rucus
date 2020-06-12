package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;




@Controller
public class Controllarr  {

	
	@GetMapping({"/inicio"})
	public String mostrarRegistro( Model m) {


		
			m.addAttribute("persona", "sdfwsdf");
		
		return "registro";
}

}