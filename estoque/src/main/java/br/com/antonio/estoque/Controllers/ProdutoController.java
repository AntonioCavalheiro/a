package br.com.antonio.estoque.Controllers;
import br.com.antonio.estoque.model.Produto;
import br.com.antonio.estoque.repositories.ProdutoRepository;
import br.com.antonio.estoque.services.ProdutoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoService produtoservice;
    @Autowired
    private ProdutoRepository produtoRepository;

    @GetMapping
    public List<Produto> ListarTodasProdutos(){
        return  produtoRepository.findAll(Sort.by("nome").ascending());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Produto> buscarPeloCodigo(@PathVariable long id){
        Optional <Produto> produto = produtoRepository.findById(id);
        return produto.isPresent() ? ResponseEntity.ok(produto.get()) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable long id){
        produtoRepository.deleteById(id);
    }

    @PostMapping()
    public ResponseEntity<Produto> inserir(@RequestBody Produto produto){
        Produto produtoSalva = produtoservice.salvar(produto);
        return ResponseEntity.status(HttpStatus.CREATED).body(produtoSalva);
    }
}
