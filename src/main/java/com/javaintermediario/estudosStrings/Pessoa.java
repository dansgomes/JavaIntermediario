package com.javaintermediario.estudosStrings;

public class Pessoa {

    private int cod;
    private String nome;
    private  int idade;


    public Pessoa(){
        super();
    }
    public Pessoa(int cod, String nome, int idade) {
        this.cod = cod;
        this.nome = nome;
        this.idade = idade;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
