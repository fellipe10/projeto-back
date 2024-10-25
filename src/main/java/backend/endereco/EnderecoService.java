package backend.endereco;

import java.util.List;

public class EnderecoService {
    private EnderecoRepository enderecoRepository;
    public List<Endereco> findAll() {
        return enderecoRepository.findAll();
    }
}
