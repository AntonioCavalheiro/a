package br.com.antonio.estoque.repositories;

import br.com.antonio.estoque.model.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Integer>{
}
