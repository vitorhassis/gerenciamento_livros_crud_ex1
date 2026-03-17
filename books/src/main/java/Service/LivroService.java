package Service;

import Models.Livro;
import Repository.LivroRepository;

import java.util.List;

public class LivroService {
    private final LivroRepository _repository;

    public LivroService(LivroRepository livroRepository){
        _repository = livroRepository;
    }

    public Livro Adicionar(Livro livro) {
        return _repository.save(livro);
    }

    public List<Livro> Listar () {
        return _repository.findAll();
    }

    public void DeletarPorId(Long id){
        _repository.deleteById(id);
    }
}
