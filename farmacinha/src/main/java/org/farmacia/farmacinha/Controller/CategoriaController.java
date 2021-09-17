package org.farmacia.farmacinha.Controller;

import java.util.List;

import javax.validation.Valid;

import org.farmacia.farmacinha.Model.Categoria;
import org.farmacia.farmacinha.Repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
	
	@Autowired
	private CategoriaRepository repository;

	@GetMapping
	public ResponseEntity<List<Categoria>> GetAll (){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@PostMapping("/novacategoria")
	public ResponseEntity<Categoria> novaCategoria (@Valid @RequestBody Categoria categoria){
		return ResponseEntity.ok(repository.save(categoria));
	}
	
	@PutMapping("/atualizarcategoria")
	public ResponseEntity<Categoria> atualizarCategoria (@Valid @RequestBody Categoria categoria){
		return ResponseEntity.ok(repository.save(categoria));
	}
	
	@DeleteMapping("/deletar/{id}")
	public void Delete (@PathVariable Long id) {
		repository.deleteById(id);
	}
	
	@GetMapping("/buscarporid/{id}")
	public ResponseEntity<Categoria> FindById (@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/buscardescricao/{descricao}")
	public ResponseEntity<List<Categoria>> FindByDescricao (@PathVariable String descricao) {
		return ResponseEntity.ok(repository.findAllByDescricaoContainingIgnoreCase(descricao));
	}

}
