package org.generation.blogPessoal.repository;

import java.util.List;

import org.generation.blogPessoal.model.Postagem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	public List<Postagem> findAllByTituloContainingIgnoreCase(String titulo);
	
	@Query(value = "select * from tb_postagens where ano > 2011", nativeQuery = true)
	public List<Postagem> findAllMaior();
	
	@Query(value = "select * from tb_postagens where ano > 2011 order by ano desc", nativeQuery = true)
	public List<Postagem> anosDesc();
	
	@Query(value = "select * from tb_postagens where ano > 2011 order by ano asc", nativeQuery = true)
	public List<Postagem> anosAsc();
	
	@Query(value = "select * from tb_postagens where ano >= 2011 and ano <= 2013", nativeQuery = true)
	public List<Postagem> anosIntervalo();
	
	@Query(value = "select * from tb_postagens where ano = ?1", nativeQuery = true)
	public List<Postagem> postagensPorAno(int ano);
}
