package br.com.antonio.orcamento.Controllers;

import br.com.antonio.orcamento.model.Lancamento;
import br.com.antonio.orcamento.repositories.LancamentoRepository;
import br.com.antonio.orcamento.services.LancamentoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/lançamentos")
public class LancamentoControler {

    @Autowired
    private LancamentoService lancamentoService;

    @Autowired
    private LancamentoRepository lancamentoRepository;

    @GetMapping()
    public List<Lancamento> ListaTodosLancamentos(){
        return lancamentoRepository.findAll(Sort.by("nome").ascending());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Lancamento> buscarPeloCodigo(@PathVariable int id){
        Optional<Lancamento> lancamento = lancamentoRepository.findById(id);
        return lancamento.isPresent() ? ResponseEntity.ok(lancamento.get()) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable int id){ lancamentoRepository.deleteById(id);
    }

    public ResponseEntity<Lancamento> inserir(@RequestBody Lancamento lancamento){
        Lancamento lancamentoSalva = lancamentoService.salvar(lancamento);
        return ResponseEntity.status(HttpStatus.CREATED).body(lancamentoSalva);
    }
}
