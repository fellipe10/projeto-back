package backend.bairro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface BairroRepository  extends JpaRepository<Bairro, Integer> {
    List<Bairro> findByNome(String nome);

    List<Bairro> findById(long id);
}
