package com.portfolio.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name= "tb_linguagem")
public class Linguagem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idLinguagem;
	
	@NotNull
	private String nome;

	@ManyToOne
	@JsonIgnoreProperties ("linguagem")
	private Projeto projeto;
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Projeto getProjeto() {
		return projeto;
	}

	public void setProjeto(Projeto projeto) {
		this.projeto = projeto;
	}

	public long getIdLinguagem() {
		return idLinguagem;
	}

	public void setIdLinguagem(long idLinguagem) {
		this.idLinguagem = idLinguagem;
	}
	
}
