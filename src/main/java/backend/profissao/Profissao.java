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
    private int idprofissao;
    @NotNull
    @Column(name = "nome")
    private String nomeprofissao;
    @NotNull
    private BigDecimal salario;

    public int getIdprofissao() {
        return idprofissao;
    }

    public void setIdprofissao(int idprofissao) {
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
