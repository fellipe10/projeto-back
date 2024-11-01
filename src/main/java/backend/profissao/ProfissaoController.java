package backend.profissao;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profissao")
@CrossOrigin
public class ProfissaoController {
    private final ProfissaoService profissaoService;

    public ProfissaoController(ProfissaoService profissaoService) {
        this.profissaoService = profissaoService;
    }

    @GetMapping
    public List<Profissao> listar() {
        return profissaoService.findAll();
    }
    @GetMapping(path = "/{nome}")
    public ResponseEntity<Profissao> buscarPorNome(String nome) {
       return ResponseEntity.ok(profissaoService.buscarProfissaoPorNome(nome));
    }
    @GetMapping(path = "/{id}")
    public ResponseEntity<Profissao> buscarPorId(@PathVariable Long id) {
        return ResponseEntity.ok(profissaoService.buscarProfissaoPorId(id));
    }
    @PostMapping
    public ResponseEntity<Profissao> salvarProfissao(@RequestBody Profissao profissao) {
        profissaoService.salvarProfissao(profissao);
        return ResponseEntity.ok(profissaoService.salvarProfissao(profissao));
    }
    @DeleteMapping(path = "/{id}")
    public ResponseEntity<Void> removerProfissao(@PathVariable long id) {
        profissaoService.removerProfissao(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
