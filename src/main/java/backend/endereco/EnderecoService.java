package backend.endereco;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EnderecoService {
    private final EnderecoRepository enderecoRepository;

    public EnderecoService(EnderecoRepository enderecoRepository) {
        this.enderecoRepository = enderecoRepository;
    }
    public List<Endereco> buscarendereco() {
        return enderecoRepository.findAll();
    }
    public Endereco salvarEndereco(Endereco endereco) {
        return enderecoRepository.save(endereco);
    }
    public Endereco buscarEnderecoPorRua(String rua) {
        return enderecoRepository.findByRua(rua);
    }
    public Endereco buscarPorId(Long id) {
        return enderecoRepository.findById(id).orElse(null);
    }
    public void apagar(Endereco endereco) {
        enderecoRepository.delete(endereco);
    }
}