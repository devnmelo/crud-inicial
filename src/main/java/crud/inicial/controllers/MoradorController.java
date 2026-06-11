package crud.inicial.controllers;

import crud.inicial.DTOS.MoradorRequestDTO;
import crud.inicial.models.Morador;
import crud.inicial.services.MoradorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/moradores")
public class MoradorController {

    private final MoradorService service;

    public MoradorController(MoradorService service) {
        this.service = service;
    }

    @PostMapping
    public Morador criar(@RequestBody MoradorRequestDTO dto) {
        return service.criar(dto);
    }

    @GetMapping
    public List<Morador> listar() {
        return service.listar();
    }

    @GetMapping("/{id}")
    public Morador buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id);
    }

    @PutMapping("/{id}")
    public Morador atualizar(@PathVariable Long id, @RequestBody MoradorRequestDTO dto) {
        return service.atualizar(id, dto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Long id) {
        service.deletar(id);
    }
}