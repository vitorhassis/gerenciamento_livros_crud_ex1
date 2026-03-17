package Controller;

import Models.Livro;
import Service.LivroService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = "/livros")
public class LivroController {
    private final LivroService service;

    public LivroController(LivroService service) {
        this.service = service;
    }

    @PostMapping
    public Livro salvar(@RequestBody Livro livro){
        return service.adicionar(livro);
    }

    @GetMapping
    public List<Livro> listar(){
        return service.listar();
    }

    @GetMapping("/{id}")
    public Livro buscarPorId(@PathVariable Long id){
        return service.listarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPorId(@PathVariable long id) {
        service.deletarPorId(id);
    }
}
