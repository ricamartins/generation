package org.generation.controllers;

import java.util.List;

import org.generation.models.UsuarioModel;
import org.generation.repositories.UsuarioRepository;
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
@RequestMapping("/usuarios")
public class UsuarioController {

	@Autowired
	private UsuarioRepository repository;
	
	@GetMapping
	public ResponseEntity<List<UsuarioModel>> buscarTodosUsuarios() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<UsuarioModel> buscarUsuarioPorId(@PathVariable long id) {
		return repository.findById(id)
				.map(usuario -> ResponseEntity.ok(usuario))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<UsuarioModel>> buscarUsuarioPorNome(@PathVariable String nome) {
		return ResponseEntity.ok(repository.findByNome(nome));
	}
	
	@PostMapping
	public ResponseEntity<UsuarioModel> postarUsuario(@RequestBody UsuarioModel usuario) {
		repository.save(usuario);
		return ResponseEntity.status(HttpStatus.CREATED).body(usuario);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<UsuarioModel> atualizarUsuario(@RequestBody UsuarioModel usuario) {
		repository.save(usuario);
		return ResponseEntity.status(HttpStatus.OK).body(usuario);
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletarUsuarioPorId(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
