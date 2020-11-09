package org.generation.models;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="tb_categorias")
public class CategoriaModel {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column
	@NotNull
	private String descricao;

	@OneToMany(mappedBy="categoria", cascade=CascadeType.ALL)
	@JsonIgnoreProperties("categoria")
	private List<JogoModel> jogos;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<JogoModel> getJogos() {
		return jogos;
	}

	public void setJogos(List<JogoModel> jogos) {
		this.jogos = jogos;
	}
	
}
