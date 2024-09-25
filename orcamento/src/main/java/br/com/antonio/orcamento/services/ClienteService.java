package br.com.antonio.orcamento.services;

import br.com.antonio.orcamento.model.Cliente;
import br.com.antonio.orcamento.repositories.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class ClienteService {
    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvar(Cliente cliente){
        return clienteRepository.save(cliente);
    }
}
