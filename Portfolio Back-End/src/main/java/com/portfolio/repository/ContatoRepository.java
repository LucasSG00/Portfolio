package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.model.Contato;

public interface ContatoRepository extends JpaRepository<Contato, Long> {
	
}
