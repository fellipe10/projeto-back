package backend.bairro;


import org.springframework.stereotype.Service;

import java.util.List;

@Service

public class BairroService {

    private final BairroRepository bairroRepository;

    public BairroService(BairroRepository bairroRepository) {
        this.bairroRepository = bairroRepository;
    }

    public List<Bairro> buscarBairros() {
        return bairroRepository.findAll();
    }

    public List<Bairro> buscarBairroPorId(long id){
        return bairroRepository.findById(id);
    }

    public List<Bairro> buscarBairroPorNome(String nome) {
        return bairroRepository.findByNome(nome);
    }
    public Bairro inserirBairro(Bairro bairro) {
        return bairroRepository.save(bairro);
    }
    public void delete(long id) {
        Bairro bairro = (Bairro) buscarBairroPorId(id);
        bairroRepository.delete(bairro);
    }


}
