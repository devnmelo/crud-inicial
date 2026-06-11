package crud.inicial.services;

import crud.inicial.DTOS.MoradorRequestDTO;
import crud.inicial.models.Morador;
import crud.inicial.repositories.MoradorRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoradorService {

    private final MoradorRepository repository;

    public MoradorService(MoradorRepository repository) {
        this.repository = repository;
    }

    public Morador criar(MoradorRequestDTO dto) {

        Morador morador = new Morador();

        morador.setNome(dto.getNome());
        morador.setApartamento(dto.getApartamento());
        morador.setProprietario(dto.getProprietario());
        morador.setFoto(dto.getFoto());

        return repository.save(morador);
    }

    public List<Morador> listar() {
        return repository.findAll();
    }

    public Morador buscarPorId(Long id) {
        return repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Morador não encontrado"));
    }

    public Morador atualizar(Long id, MoradorRequestDTO dto) {

        Morador morador = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Morador não encontrado"));

        morador.setNome(dto.getNome());
        morador.setApartamento(dto.getApartamento());
        morador.setProprietario(dto.getProprietario());
        morador.setFoto(dto.getFoto());

        return repository.save(morador);
    }

    public void deletar(Long id) {

        Morador morador = repository.findById(id)
                .orElseThrow(() -> new RuntimeException("Morador não encontrado"));

        repository.delete(morador);
    }
}