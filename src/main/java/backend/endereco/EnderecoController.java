package backend.endereco;

import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/endereco")
@CrossOrigin
public class EnderecoController {

    private final EnderecoService enderecoService;

    public EnderecoController(EnderecoService enderecoService) {

        this.enderecoService = enderecoService;
    }

    @GetMapping
    public ResponseEntity<List<Endereco>> buscarTodosEndereco() {
        List<Endereco> enderecos = enderecoService.buscarendereco();
        return ResponseEntity.ok(enderecos);
    }
    @GetMapping(path = "/rua")
    public ResponseEntity<Endereco> buscarEnderecoPorRua(@RequestParam String rua) {

        return ResponseEntity.ok(enderecoService.buscarEnderecoPorRua(rua));
    }
    @GetMapping(path = "{id}")
    public ResponseEntity<Endereco> buscarId(@PathVariable Long id) {
        return ResponseEntity.ok(enderecoService.buscarPorId(id));
    }
    @PostMapping
    public ResponseEntity<Endereco> salvarEndereco(@RequestBody Endereco endereco) {
        return ResponseEntity.ok(enderecoService.salvarEndereco(endereco));
    }
    @DeleteMapping
    public ResponseEntity<Endereco> deletarEndereco(Endereco endereco) {
        enderecoService.apagar(endereco);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


}
