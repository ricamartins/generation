package org.generation.repositories;

import java.util.List;

import org.generation.models.CategoriaModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<CategoriaModel, Long> {

	List<CategoriaModel> findByDescricao(String descricao);

}
