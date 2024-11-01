package backend.endereco;

import backend.bairro.Bairro;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Builder
@Table(name = "endereco")
public class Endereco {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "idendereco")
    private Long idEndereco;
    @NotNull
    @Column(name = "logradouro")
    private String rua;
    @NotNull
    private String complemento;
    private String cep;
    private String numero;
   @ManyToOne
   @NotNull
   @JoinColumn(name = "idbairro")
    private Bairro bairro;

    public Endereco(Bairro bairro) {

        this.bairro = bairro;
    }

    public Endereco() {
    }

    public @NotNull Long getIdEndereco() {
        return idEndereco;
    }

    public void setIdEndereco(@NotNull Long idEndereco) {
        this.idEndereco = idEndereco;
    }

    public @NotNull String getRua() {
        return rua;
    }

    public void setRua(@NotNull String rua) {
        this.rua = rua;
    }

    public @NotNull String getComplemento() {
        return complemento;
    }

    public void setComplemento(@NotNull String complemento) {
        this.complemento = complemento;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public @NotNull Bairro getBairro() {
        return bairro;
    }

    public void setBairro(@NotNull Bairro bairro) {
        this.bairro = bairro;
    }
}
