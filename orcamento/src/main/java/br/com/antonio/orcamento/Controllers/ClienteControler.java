package br.com.antonio.orcamento.Controllers;

import br.com.antonio.orcamento.model.Cliente;
import br.com.antonio.orcamento.repositories.ClienteRepository;
import br.com.antonio.orcamento.services.ClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/clientes")
public class ClienteControler {

    @Autowired
    private ClienteService clienteService;

    @Autowired
    private ClienteRepository clienteRepository;

    @GetMapping()
    public List<Cliente> ListarTodosClientes(){
        return clienteRepository.findAll(Sort.by("nome").ascending());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Cliente> buscarPeloCodigo(@PathVariable long id){
        Optional<Cliente> cliente = clienteRepository.findById(id);
        return cliente.isPresent() ? ResponseEntity.ok(cliente.get()) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable long id){
        clienteRepository.deleteById(id);
    }

    public ResponseEntity<Cliente> inserir(@RequestBody Cliente cliente){
        Cliente clienteSalva = clienteService.salvar(cliente);
        return  ResponseEntity.status(HttpStatus.CREATED).body(clienteSalva);
    }
}
