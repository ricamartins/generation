package org.generation.controllers;

import java.util.List;

import org.generation.models.CategoriaModel;
import org.generation.repositories.CategoriaRepository;
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
@RequestMapping("/categorias")
public class CategoriaController {

	@Autowired
	private CategoriaRepository repository;
	
	@GetMapping
	public ResponseEntity<List<CategoriaModel>> buscarTodasCategorias() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/id/{id}")
	public ResponseEntity<CategoriaModel> buscarCategoriaPorId(@PathVariable long id) {
		return repository.findById(id)
				.map(categoria -> ResponseEntity.ok(categoria))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/descricao/{descricao}")
	public ResponseEntity<List<CategoriaModel>> buscarCategoriaPorDescricao(@PathVariable String descricao) {
		return ResponseEntity.ok(repository.findByDescricao(descricao));
	}
	
	@PostMapping
	public ResponseEntity<CategoriaModel> postarCategoria(@RequestBody CategoriaModel categoria) {
		repository.save(categoria);
		return ResponseEntity.status(HttpStatus.CREATED).body(categoria);
	}
	
	@PutMapping("/atualizar")
	public ResponseEntity<CategoriaModel> atualizarCategoria(@RequestBody CategoriaModel categoria) {
		repository.save(categoria);
		return ResponseEntity.status(HttpStatus.OK).body(categoria);
	}
	
	@DeleteMapping("/deletar/{id}")
	public void deletarCategoriaPorId(@PathVariable Long id) {
		repository.deleteById(id);
	}
}
