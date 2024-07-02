package com.generation.helloworld.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bsms-generation")
public class BSMController {
	
	@GetMapping
	public List<String> bsmGeneration() {
		List<String> bsm = new ArrayList<String>();

        bsm.add("Orientação ao Futuro");
        bsm.add("Responsabilidade Pessoal");
        bsm.add("Mentalidade de Crescimento");
        bsm.add("Persistência");
        bsm.add("Trabalho em Equipe");
        bsm.add("Orientação ao Detalhe");
        bsm.add("Proatividade");
        bsm.add("Comunicação");
		
        return bsm;
	}

}
