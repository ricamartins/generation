package org.generation.controllers;

import java.util.List;

import org.generation.models.JogoModel;
import org.generation.repositories.JogoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogos")
public class JogoController {

	@Autowired
	private JogoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<JogoModel>> buscarTodosJogos() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<JogoModel> buscarJogoPorId(@PathVariable long id) {
		return repository.findById(id)
				.map(jogo -> ResponseEntity.ok(jogo))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<JogoModel>> buscarJogoPorNome(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findByNome(nome));
	}
	
	@PostMapping
	public ResponseEntity<JogoModel> postarJogo(@RequestBody JogoModel jogo) {
		repository.save(jogo);
		return ResponseEntity.status(HttpStatus.CREATED).body(jogo);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<JogoModel> atualizarJogo(@RequestBody JogoModel jogo) {
		repository.save(jogo);
		return ResponseEntity.status(HttpStatus.OK).body(jogo);
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletarJogoPorId(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
