package br.com.antonio.orcamento.services;

import br.com.antonio.orcamento.model.Lancamento;
import br.com.antonio.orcamento.repositories.LancamentoRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class LancamentoService {
    @Autowired
    private LancamentoRepository lancamentoRepository;

    public Lancamento salvar(Lancamento lancamento){
        return lancamentoRepository.save(lancamento);
    }
    }

