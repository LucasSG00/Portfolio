package com.portfolio.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "tb_projeto")
public class Projeto {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idProjeto;
	
	@NotNull
	private String titulo;
	
	@NotNull
	private String descricao;
	
	@OneToMany(mappedBy = "projeto", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("projeto")
	private List<Imagem> imagens;

	@OneToMany(mappedBy = "projeto", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("projeto")
	private List<Linguagem> linguagens;
	
	public long getIdProjeto() {
		return idProjeto;
	}

	public void setIdProjeto(long idProjeto) {
		this.idProjeto = idProjeto;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public List<Imagem> getImagens() {
		return imagens;
	}

	public void setImagens(List<Imagem> imagens) {
		this.imagens = imagens;
	}

	public List<Linguagem> getLinguagens() {
		return linguagens;
	}

	public void setLinguagens(List<Linguagem> linguagens) {
		this.linguagens = linguagens;
	}
	
}
