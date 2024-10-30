package backend.pessoa;

import backend.endereco.Endereco;
import backend.profissao.Profissao;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;


import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "pessoa")
public class Pessoa {
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long idpessoa;
    @NotNull
    private String nome;
    @NotNull
    private LocalDate dataNascimento;
    @NotNull
    private String sexo;
    @NotNull
    @Column(name = "pcd")
    private boolean portadorNecessidadeEspecial;
    @NotNull
    private String altura;
    @NotNull
    private String peso;
    @NotNull
    private String tipoPessoa;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "idendereco")
    private Endereco endereco;
    @ManyToOne
    @NotNull
    @JoinColumn(name = "idprofissao")
    private Profissao profissao;


    public Pessoa(Endereco endereco, Profissao profissao) {
        this.endereco = endereco;
        this.profissao = profissao;
    }

    public Pessoa() {

    }

    public @NotNull Long getIdpessoa() {
        return idpessoa;
    }

    public void setIdpessoa(@NotNull Long idpessoa) {
        this.idpessoa = idpessoa;
    }

    public @NotNull String getNome() {
        return nome;
    }

    public void setNome(@NotNull String nome) {
        this.nome = nome;
    }

    public @NotNull LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(@NotNull LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public @NotNull String getSexo() {
        return sexo;
    }

    public void setSexo(@NotNull String sexo) {
        this.sexo = sexo;
    }

    @NotNull
    public boolean isPortadorNecessidadeEspecial() {
        return portadorNecessidadeEspecial;
    }

    public void setPortadorNecessidadeEspecial(@NotNull boolean portadorNecessidadeEspecial) {
        this.portadorNecessidadeEspecial = portadorNecessidadeEspecial;
    }

    public @NotNull String getAltura() {
        return altura;
    }

    public void setAltura(@NotNull String altura) {
        this.altura = altura;
    }

    public @NotNull String getPeso() {
        return peso;
    }

    public void setPeso(@NotNull String peso) {
        this.peso = peso;
    }

    public @NotNull String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(@NotNull String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }

    public @NotNull Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(@NotNull Endereco endereco) {
        this.endereco = endereco;
    }

    public @NotNull Profissao getProfissao() {
        return profissao;
    }

    public void setProfissao(@NotNull Profissao profissao) {
        this.profissao = profissao;
    }
}
