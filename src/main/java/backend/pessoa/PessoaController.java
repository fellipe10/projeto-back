package backend.pessoa;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(name = "pessoa")
public class PessoaController {
    private final PessoaService pessoaService;

    public PessoaController(PessoaService pessoaService) {
        this.pessoaService = pessoaService;
    }

    @GetMapping
    public List<Pessoa> listar() {
        return pessoaService.findAll();
    }
    @GetMapping(path = "/{nome}")
    public ResponseEntity<Pessoa> buscarPessoaPorNome(@PathVariable String nome) {
        return ResponseEntity.ok(pessoaService.findBynome(nome));
    }
    @PostMapping(path = "/id")
    public ResponseEntity <Pessoa> salvarPssoa(Pessoa pessoa) {
       return ResponseEntity.ok(pessoaService.salvarPessoa(pessoa));
    }
    @DeleteMapping
    public ResponseEntity<Pessoa> apagarPessoa(@RequestParam long id) {
        pessoaService.apagarPessoa(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
