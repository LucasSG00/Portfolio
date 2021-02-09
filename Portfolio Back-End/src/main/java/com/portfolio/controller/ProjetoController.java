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

import com.portfolio.model.Projeto;
import com.portfolio.repository.ProjetoRepository;

@RestController
@RequestMapping("/projeto")
@CrossOrigin("*")
public class ProjetoController {

	@Autowired
	private ProjetoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Projeto>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping ("/id/{id}")
	public ResponseEntity <Projeto> GetById(@PathVariable Long id){	
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Projeto>> GetByIdTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(repository.findAllByTituloContainingIgnoreCase(titulo));
	}
	
//	@PostMapping
//	public ResponseEntity<Projeto> post(@RequestBody Projeto projeto){
//		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(projeto));
//	}
//	
//	@PutMapping
//	public ResponseEntity<Projeto> put(@RequestBody Projeto projeto){
//		return ResponseEntity.status(HttpStatus.OK).body(repository.save(projeto));
//	}
//	
//	@DeleteMapping("/{id}")
//	public void delete(@PathVariable Long id) {
//		repository.deleteById(id);
//	}
	
}
