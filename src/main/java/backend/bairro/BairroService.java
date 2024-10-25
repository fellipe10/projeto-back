package backend.bairro;

import java.util.List;

public class BairroService {

    private BairroRepository bairroRepository;

    public List<Bairro> buscarBairros() {

        return bairroRepository.findAll();
    }

}
