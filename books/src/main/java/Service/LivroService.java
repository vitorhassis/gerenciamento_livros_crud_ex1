package Service;

import Models.Livro;
import Repository.LivroRepository;

import java.util.List;

public class LivroService {
    private final LivroRepository repository;

    public LivroService(LivroRepository livroRepository){
        repository = livroRepository;
    }

    public Livro adicionar(Livro livro) {
        return repository.save(livro);
    }

    public List<Livro> listar () {
        return repository.findAll();
    }

    public Livro listarPorId(Long id){
        return repository.findById(id).get();
    }

    public void deletarPorId(Long id){
        repository.deleteById(id);
    }
}
