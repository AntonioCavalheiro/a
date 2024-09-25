package br.com.antonio.orcamento.repositories.Municipio;

import br.com.antonio.orcamento.model.Municipio;
import br.com.antonio.orcamento.repositories.filter.MunicipioFilter;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface MunicipioRpositoryQuery {
    public Page<Municipio> filtrar(MunicipioFilter municipioFilter, Pageable pageable);
}
