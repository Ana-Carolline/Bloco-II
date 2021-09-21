package com.joguinho.jogos.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.joguinho.jogos.Model.Usuario;
import java.util.List;
import java.util.Optional;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {

	/**
	 * Método utilizado para pesquisar coluna nome ContainigIgnoreCase
	 * 
	 * @param nome do tipo String
	 * @return List de Usuarios
	 * @author Dev Ana Carolline
	 * @since 1.0
	 * 
	 */
	
	List <Usuario> findAllByNomeContainingIgnoreCase (String nome);
	
	/**
	 * Método utilizado para pesquisar coluna email
	 * 
	 * @param email do tipo String
	 * @return Optional com Usuario
	 * @author Dev Ana Carolline
	 * @since 1.0
	 * 
	 */
	
	Optional<Usuario> findByEmail (String email);
}
