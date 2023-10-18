package br.com.helton.domain;

public class Pet {
    private Long id;
    private String nome;
    private String tipo;
    private String raca;
    private Integer idade;
    private String cor;
    private Float peso;

    public Pet(){}
    public Pet(String nome, String tipo, String raca, Integer idade, String cor, Float peso) {
        this.nome = nome;
        this.tipo = tipo;
        this.raca = raca;
        this.idade = idade;
        this.cor = cor;
        this.peso = peso;
    }

    public Long getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getTipo() {
        return tipo;
    }

    public String getRaca() {
        return raca;
    }

    public Integer getIdade() {
        return idade;
    }

    public String getCor() {
        return cor;
    }

    public Float getPeso() {
        return peso;
    }
}
