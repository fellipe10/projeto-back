package backend.pessoa;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PessoaService {
    private final PessoaRepository pessoaRepository;

    public PessoaService(PessoaRepository pessoaRepository) {
        this.pessoaRepository = pessoaRepository;
    }

   public List<Pessoa> findAll() {
        return pessoaRepository.findAll();
   }
   public Pessoa findBynome(String nome) {
        return pessoaRepository.findByNome(nome);
   }
   public Pessoa findById(Long id) {
        return pessoaRepository.findById(id).orElse(null);
   }
   public Pessoa salvarPessoa(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
   }
   public Pessoa atualizar(Pessoa pessoa) {
        return pessoaRepository.save(pessoa);
   }
   public void apagarPessoa(Long id) {
        pessoaRepository.deleteById(id);
   }
}
