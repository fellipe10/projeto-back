package backend.bairro;


import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bairro")
@Log4j2

public class BairroController {

    private final BairroService bairroService;

    public BairroController(BairroService bairroService) {
        this.bairroService = bairroService;
    }

    @GetMapping
    public List<Bairro> listar() {
        return bairroService.buscarBairros();
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<List<Bairro>> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(bairroService.buscarBairroPorId(id));
    }
    @PostMapping (path = "nome")
    public ResponseEntity<Bairro> adicionar(@RequestBody Bairro bairro) {
        List<Bairro> bairros = bairroService.buscarBairros();
        return ResponseEntity.ok((Bairro) bairros);
    }
    @PostMapping
    public ResponseEntity<Bairro> atualizar(@RequestBody Bairro bairro) {
        return new ResponseEntity<>(bairroService.inserirBairro(bairro), HttpStatus.CREATED);
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> delete(@PathVariable Long id) {
        bairroService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
