package com.turma11.hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RequestMapping("/atividade1")
@RestController
public class Controller {

	@GetMapping("/exercicio1")
	public String primeira() {
		return "Persistência e Atenção aos Detalhes";
	}
	
	@GetMapping("/exercicio2")
	public String segunda() {
		return "Terminar o conteúdo de SQL e aprender SpringBoot";
	}
}
