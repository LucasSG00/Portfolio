package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

import com.portfolio.model.Admin;

@Repository
public interface AdminRepository extends JpaRepository<Admin, Long> {
	public Optional<Admin> findByUsuario(String usuario);
}
