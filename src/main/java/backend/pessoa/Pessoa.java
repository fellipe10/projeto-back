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

    public String getAltura() {
        return altura;
    }

    public void setAltura(String altura) {
        this.altura = altura;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String peso) {
        this.peso = peso;
    }

    public String getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(String tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
}
