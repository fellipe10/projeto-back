package backend.bairro;


import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity
@Table(name = "bairro")
public class Bairro {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String nome;

    private BigDecimal valorIptu;

    public Bairro(Long id, String nome, BigDecimal valorIptu) {
        this.id = id;
        this.nome = nome;
        this.valorIptu = valorIptu;
    }

    public Bairro() {

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public BigDecimal getValorIptu() {
        return valorIptu;
    }

    public void setValorIptu(BigDecimal valorIptu) {
        this.valorIptu = valorIptu;
    }
}