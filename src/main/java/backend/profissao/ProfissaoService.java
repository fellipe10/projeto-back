package backend.profissao;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfissaoService {
    private final ProfissaoRepository repository;

    public ProfissaoService(ProfissaoRepository repository) {
        this.repository = repository;
    }

    public List<Profissao> findAll() {
        return repository.findAll();
    }
    public Profissao salvarProfissao(Profissao profissao) {
        return repository.save(profissao);
    }
    public Profissao buscarProfissaoPorId(Long id) {
        return repository.findById(id).orElse(null);
    }
    public Profissao buscarProfissaoPorNome(String nome) {
        return repository.findByNomeprofissao(nome);
    }
    public List<Profissao> buscarProfissao() {
        return repository.findAll();
    }
    public void removerProfissao(Long id) {
        repository.deleteById(id);
    }
}
