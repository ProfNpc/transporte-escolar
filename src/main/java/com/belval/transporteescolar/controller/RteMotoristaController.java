package com.belval.transporteescolar.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.belval.transporteescolar.model.Motorista;


@Controller
public class RteMotoristaController {
	
	private static List<Motorista> listamotorista = new ArrayList<Motorista>();
	
	
	@GetMapping("/motorista/list")
	public String list(Model model) {
		
		model.addAttribute("motorista", listamotorista);
		
		return "lista-motorista";
	}
	
	@GetMapping("/motorista/novo")
	public String novo() {
		return "novo-motorista";
	}
	
	public String qqcoisa(
			@RequestParam("a") int a, 
			int b, String texto, double sal) {
		return "";
	}

	
	@PostMapping("/motorista/novo")
	public ModelAndView novo(Motorista mot) {
		
		ModelAndView mv = 
				new ModelAndView("redirect:/motorista/list");
		
		listamotorista.add(mot);
		
		//insert no banco de dados
		mv.addObject("motorista", mot);
		//model.addAttribute("motorista", mot);
		
		return mv;
	}

}

