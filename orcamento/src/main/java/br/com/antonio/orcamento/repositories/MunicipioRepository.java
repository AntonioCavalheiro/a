package br.com.antonio.orcamento.repositories;
import br.com.antonio.orcamento.model.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface MunicipioRepository extends JpaRepository<Municipio, Integer>{
}
