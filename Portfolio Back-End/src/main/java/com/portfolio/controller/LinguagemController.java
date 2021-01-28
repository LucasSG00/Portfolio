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

import com.portfolio.model.Linguagem;
import com.portfolio.repository.LinguagemRepository;

@RestController
@RequestMapping("/linguagem")
@CrossOrigin("*")
public class LinguagemController {
	
	@Autowired
	private LinguagemRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Linguagem>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/nome/{nome}")
	public ResponseEntity<List<Linguagem>> GetByIdTitulo(@PathVariable String nome){
		return ResponseEntity.ok(repository.findAllByNome(nome));
	}
	
//	@PostMapping
//	public ResponseEntity<Linguagem> post(@RequestBody Linguagem linguagem){
//		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(linguagem));
//	}
//	
//	@PutMapping
//	public ResponseEntity<Linguagem> put(@RequestBody Linguagem linguagem){
//		return ResponseEntity.status(HttpStatus.OK).body(repository.save(linguagem));
//	}
//	
//	@DeleteMapping("/{nome}")
//	public void delete(@PathVariable String nome) {
//		repository.deleteByNome(nome);
//	}

}
