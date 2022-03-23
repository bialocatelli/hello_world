package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello-world")
public class HelloWorldController {

	@GetMapping
	public String helloworld() {
		return "Hello World!!";
	}

	@GetMapping("/lista-bsms")
	public String listabsms() {
		return "Lista de BSM's da Generation Brasil \n"
				+ "\nMentalidades: Orientação ao Futuro, Responsabilidade Pessoal, Mentalidade de Crescimento, Persistência"
				+ "\nHabilidades: Trabalho em Equipe, Atenção aos Detalhes, Proatividade, Comunicação";

	}
	
	@GetMapping("/objetivos-da-semana")
	public String objetivosdasemana() {
		return "Objetivos de aprendizagem da semana\n"
				+"\nEssa semana quero desenvolver a habilidade de Trabalho em Equipe porque sei que todo o PI será feito em grupo."
				+"\nTambém quero me dedicar à habilidade de Atenção aos Detalhes porque o Spring exige bastante atenção na hora do desenvolvimento do código.";
	}

}
