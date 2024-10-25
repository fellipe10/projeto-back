package backend.bairro;


import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

public class BairroController {

    private BairroService bairroService;

    @GetMapping
    public List<Bairro> listar() {
        return bairroService.buscarBairros();
    }
}
