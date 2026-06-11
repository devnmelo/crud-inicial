package crud.inicial.repositories;


import crud.inicial.models.Morador;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoradorRepository
        extends JpaRepository<Morador, Long> {
}
