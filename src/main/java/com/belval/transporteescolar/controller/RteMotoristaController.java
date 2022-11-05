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
	public String novo(
			@RequestParam("id") int id,
			@RequestParam("nome") String nome,
			@RequestParam("cpf") String cpf,
			@RequestParam("cnh") double cnh,
			Model model) {
		
		model.addAttribute("id", id);
		model.addAttribute("nome", nome);
		model.addAttribute("cpf", cpf);
		model.addAttribute("cnh", cnh);
		
		return "novo-motorista-criado";
	}
	
	@GetMapping("/motorista/novo2")
	public String novo2() {
		return "novo-motorista2";
	}
	


	
	@PostMapping("/motorista/novo2")
	public ModelAndView novo(Motorista mot) {
		
		ModelAndView mv = 
				new ModelAndView("novo-motorista-criado2");
		
		listamotorista.add(mot);
		
		//insert no banco de dados
		mv.addObject("motorista", mot);
		//model.addAttribute("motorista", mot);
		
		return mv;
	}

}

