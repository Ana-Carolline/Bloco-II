package com.joguinho.jogos.Controller;

import java.util.List;

import javax.validation.Valid;

import com.joguinho.jogos.Model.Produto;
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

import com.joguinho.jogos.Repository.ProdutoRepository;

@RestController
@RequestMapping ("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository repository;
	
	@GetMapping
	public ResponseEntity<List<Produto>> findAllProdutos (){
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/idproduto/{id}")
	public ResponseEntity<Produto> findById(@PathVariable Long id){
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/categoriaproduto/{categoria}")
	public ResponseEntity<List<Produto>>FindByCategoria (@PathVariable String categoria){
		return ResponseEntity.ok(repository.findAllByCategoriaContainingIgnoreCase(categoria));
	}
	
	@PostMapping("/novoproduto")
	public ResponseEntity<Produto> postProduto (@Valid @RequestBody Produto produto) {
		return ResponseEntity.ok(repository.save(produto));
	}

	@PutMapping("/atualizarproduto")
	public ResponseEntity<Produto> putProduto (@Valid @RequestBody Produto produto){
		return ResponseEntity.ok(repository.save(produto));
	}
	
	@DeleteMapping("/deletarproduto/{id}")
	public void Delete (@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
