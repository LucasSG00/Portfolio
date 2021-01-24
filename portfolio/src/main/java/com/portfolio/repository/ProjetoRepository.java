package com.portfolio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.portfolio.model.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

	public List<Projeto> findAllByTituloContainingIgnoreCase(String titulo);
	
}
