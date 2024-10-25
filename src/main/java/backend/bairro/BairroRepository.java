package backend.bairro;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BairroRepository  extends JpaRepository<Bairro, Integer> {
    List<Bairro> findByNome(String nome);
}
