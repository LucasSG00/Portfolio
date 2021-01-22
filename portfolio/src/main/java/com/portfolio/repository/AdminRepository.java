package com.portfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

import com.portfolio.model.Admin;

public interface AdminRepository extends JpaRepository<Admin, Long> {
	public Optional<Admin> findByUsuario(String usuario);
}
