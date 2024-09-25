package br.com.antonio.estoque.repositories.Categoria;

import br.com.antonio.estoque.model.Categoria;
import br.com.antonio.estoque.repositories.filter.CategoriaFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface CategoriaRepositoryQuery {
    public Page<Categoria> filtar(CategoriaFilter categotiaFilter, Pageable pageable);
}
