package com.portfolio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.portfolio.model.Imagem;
import com.portfolio.repository.ImagemRepository;

@RestController
@RequestMapping("/imagem")
@CrossOrigin("*")
public class ImagemController {

	@Autowired
	private ImagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Imagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping
	public ResponseEntity<Imagem> post(@RequestBody Imagem imagem){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(imagem));
	}
	
	@PutMapping
	public ResponseEntity<Imagem> put(@RequestBody Imagem imagem){
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(imagem));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
