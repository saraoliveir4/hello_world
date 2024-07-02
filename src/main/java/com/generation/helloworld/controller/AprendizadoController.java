package com.generation.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/aprendizado-da-semana")
public class AprendizadoController {
	
	@GetMapping
	public List<String> aprendizadoDaSemana() {
		List<String> listaAprendizado = new ArrayList<String>();
		
		listaAprendizado.add("Web Java");
		listaAprendizado.add("Gestão Financeira");
		listaAprendizado.add("Saúde e Bem-estar - Trabalho em Equipe");
		
		return listaAprendizado;
	}

}
