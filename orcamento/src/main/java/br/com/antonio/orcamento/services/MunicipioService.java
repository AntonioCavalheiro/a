package br.com.antonio.orcamento.services;
import br.com.antonio.orcamento.model.Municipio;
import br.com.antonio.orcamento.repositories.MunicipioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
@Repository
public class MunicipioService {
    @Autowired
    private MunicipioRepository municipioRepository;

    public Municipio salvar(Municipio municipio){
        return municipioRepository.save(municipio);
    }
}
