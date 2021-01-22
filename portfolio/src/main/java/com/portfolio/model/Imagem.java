package com.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "tb_imagem")
public class Imagem {

	@NotNull
	private Long id_projeto;

	@NotNull
	private String nome;
	
	@NotNull
	private String link;
	
	@ManyToOne
	@JsonIgnoreProperties ("imagem")
	private Projeto projeto;
	
	public Long getId_projeto() {
		return id_projeto;
	}

	public void setId_projeto(Long id_projeto) {
		this.id_projeto = id_projeto;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLink() {
		return link;
	}

	public void setLink(String link) {
		this.link = link;
	}
	
	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}
	
}
