package com.portfolio.repository;

//import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.model.Imagem;

@Repository
public interface ImagemRepository extends JpaRepository<Imagem, Long> {
	
	//public List<Imagem> findAllById(String idImagem);

}
