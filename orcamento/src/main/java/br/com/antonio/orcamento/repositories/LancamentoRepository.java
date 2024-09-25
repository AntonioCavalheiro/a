package br.com.antonio.orcamento.repositories;
import br.com.antonio.orcamento.model.Lancamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LancamentoRepository extends JpaRepository<Lancamento, Integer>{
}
