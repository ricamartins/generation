package org.generation.repositories;

import java.util.List;

import org.generation.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<UsuarioModel, Long> {

	List<UsuarioModel> findByNome(String nome);
	
}
