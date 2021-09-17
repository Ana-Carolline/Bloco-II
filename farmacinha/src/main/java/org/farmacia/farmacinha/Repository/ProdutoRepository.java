package org.farmacia.farmacinha.Repository;

import java.util.List;

import org.farmacia.farmacinha.Model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List<Produto> findAllByExibicaoContainingIgnoreCase(String exibicao);
	
}
