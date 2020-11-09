package org.generation.repositories;

import java.util.List;

import org.generation.models.JogoModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface JogoRepository extends JpaRepository<JogoModel, Long> {

	List<JogoModel> findByNome(String nome);

}
