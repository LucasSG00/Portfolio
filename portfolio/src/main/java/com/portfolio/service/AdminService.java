package com.portfolio.service;

import java.nio.charset.Charset;
import java.util.Optional;

import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.portfolio.model.Admin;
import com.portfolio.model.UserLogin;
import com.portfolio.repository.AdminRepository;

public class AdminService {
	
	@Autowired
	private AdminRepository repository;
	
	// Criptografa a senha e salva ela dentro do banco de dados
	public Admin CadastrarAdmin(Admin admin) {
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		
		String senhaEncoder = encoder.encode(admin.getSenha());
		admin.setSenha(senhaEncoder);
		
		return repository.save(admin);
	}
	
	public Optional<UserLogin> Logar(Optional<UserLogin> user){
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		Optional<Admin> usuario = repository.findByUsuario(user.get().getUsuario());
		
		if(usuario.isPresent()) {
			if(encoder.matches(user.get().getSenha(), usuario.get().getSenha())) {
				String auth = user.get().getUsuario() + ":" + user.get().getSenha();
				byte[]  encoderAuth = Base64.encodeBase64(auth.getBytes(Charset.forName("US-ASCII")));
				String authHeader = "Basic " + new String(encoderAuth);
				
				user.get().setToken(authHeader);
				user.get().setUsuario(usuario.get().getUsuario());
				
				return user;
			}
		}
		
		return null;
	}

}
