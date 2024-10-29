package backend.profissao;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


import java.math.BigDecimal;
@Entity
@Table(name = "profissao")
public class Profissao {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private String idprofissao;
    @NotNull
    private String nomeprofissao;
    @NotNull
    private BigDecimal salario;

    public String getIdprofissao() {
        return idprofissao;
    }

    public void setIdprofissao(String idprofissao) {
        this.idprofissao = idprofissao;
    }

    public String getNomeprofissao() {
        return nomeprofissao;
    }

    public void setNomeprofissao(String nomeprofissao) {
        this.nomeprofissao = nomeprofissao;
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
