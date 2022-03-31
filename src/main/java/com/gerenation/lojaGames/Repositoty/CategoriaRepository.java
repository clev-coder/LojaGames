package com.gerenation.lojaGames.Repositoty;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gerenation.lojaGames.model.Categoria;



@Repository
public interface CategoriaRepository extends JpaRepository <Categoria,Long> {
	
	public List<Categoria> findAllByTipoContainingIgnoreCase(String tipo);
	
}
