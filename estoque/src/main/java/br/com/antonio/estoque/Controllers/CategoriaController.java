package br.com.antonio.estoque.Controllers;

import br.com.antonio.estoque.model.Categoria;
import br.com.antonio.estoque.repositories.CategoriaRepository;
import br.com.antonio.estoque.services.CategoriaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/categorias")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;
    @Autowired
    private CategoriaRepository categoriaRepository;

    @GetMapping()
    public List<Categoria> ListarTodasCategorias(){
        return categoriaRepository.findAll(Sort.by("nome").ascending());
    }
@GetMapping("/{id}")
    public ResponseEntity<Categoria> buscarPeloCodigo(@PathVariable int id){
      Optional <Categoria> categoria = categoriaRepository.findById(id);
      return categoria.isPresent() ? ResponseEntity.ok(categoria.get()) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void remover(@PathVariable int id){
        categoriaRepository.deleteById(id);
    }

    @PostMapping()
    public ResponseEntity<Categoria> inserir(@RequestBody Categoria categoria) {
        Categoria categoriaSalva = categoriaService.salvar(categoria);
        return ResponseEntity.status(HttpStatus.CREATED).body(categoriaSalva);
    }

}
