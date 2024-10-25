package backend.profissao;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;

public class Profissao {
    @Id
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
