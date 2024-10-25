package backend.pessoa;

import backend.endereco.Endereco;
import backend.profissao.Profissao;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import org.antlr.v4.runtime.misc.NotNull;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pessoa {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idpessoa;
    @NotNull
    private String nome;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    private String sexo;
    @NotNull
    private boolean portadorNecessidadeEspecial;
    @NotNull
    private BigDecimal altura;
    @NotNull
    private BigDecimal peso;
    @NotNull
    private String cpf;
    @NotNull
    private String tipoPessoa;
    @ManyToOne
    @NotNull
    private Endereco endereco;
    @ManyToOne
    @NotNull
    private Profissao profissao;


    public Pessoa(Endereco endereco, Profissao profissao) {
        this.endereco = endereco;
        this.profissao = profissao;
    }

    public Long getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(Long idpessoa) {
        this.idpessoa = idpessoa;
    }
    

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public boolean isPortadorNecessidadeEspecial() {
        return portadorNecessidadeEspecial;
    }

    public void setPortadorNecessidadeEspecial(boolean portadorNecessidadeEspecial) {
        this.portadorNecessidadeEspecial = portadorNecessidadeEspecial;
    }

    public BigDecimal getAltura() {
        return altura;
    }

    public void setAltura(BigDecimal altura) {
        this.altura = altura;
    }

    public BigDecimal getPeso() {
        return peso;
    }

    public void setPeso(BigDecimal peso) {
        this.peso = peso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
