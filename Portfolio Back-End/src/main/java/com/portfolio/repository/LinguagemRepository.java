package com.portfolio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.model.Linguagem;

@Repository
public interface LinguagemRepository extends JpaRepository<Linguagem, Long> {
	
	public List<Linguagem> findAllByNome(String nome);
	
//	public Long deleteByNome(String nome);

}
