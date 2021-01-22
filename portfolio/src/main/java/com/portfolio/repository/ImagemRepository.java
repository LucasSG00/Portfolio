package com.portfolio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.model.Imagem;

public interface ImagemRepository extends JpaRepository<Imagem, Long> {
	
	public List<Imagem> findAllById(String idImagem);

}
