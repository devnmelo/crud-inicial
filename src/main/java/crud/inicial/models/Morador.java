package crud.inicial.models;

import jakarta.persistence.*;

@Entity
@Table(name = "moradores")
public class Morador {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String apartamento;

    private String nome;

    private Boolean proprietario;

    private String foto;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getApartamento() {
        return apartamento;
    }

    public void setApartamento(String apartamento) {
        this.apartamento = apartamento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Boolean getProprietario() {
        return proprietario;
    }

    public void setProprietario(Boolean proprietario) {
        this.proprietario = proprietario;
    }

    public String getFoto() {
        return foto;
    }

    public void setFoto(String foto) {
        this.foto = foto;
    }

    public Morador() {
    }

    public Morador(Long id, String apartamento, String nome, Boolean proprietario, String foto) {
        this.id = id;
        this.apartamento = apartamento;
        this.nome = nome;
        this.proprietario = proprietario;
        this.foto = foto;
    }
}
