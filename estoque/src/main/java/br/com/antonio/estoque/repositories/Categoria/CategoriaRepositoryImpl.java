package br.com.antonio.estoque.repositories.Categoria;

import br.com.antonio.estoque.model.Categoria;
import br.com.antonio.estoque.repositories.filter.CategotiaFilter;
import jakarta.persistence.PersistenceContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.function.Predicate;

public class CategoriaRepositoryImpl implements CategoriaRepositoryQuery{

    @PersistenceContext
    private EntityManager manager;
    @Persis
    @Override
    public Page<Categoria> filtar(CategotiaFilter categotiaFilter, Pageable pageable) {
        CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Categoria> criteria = builder.createQuery(Categoria.class);
        Root<Categoria> root = criteria.from(Categoria.class);

        Predicate[] predicates = criarRestricoes(categotiaFilter, builder, root);
        return null;
    }

    private Predicate[] criarRestricoes(CategotiaFilter categotiaFilter, CriteriaBuilder builder, Root<Categoria> root) {
    }
}
