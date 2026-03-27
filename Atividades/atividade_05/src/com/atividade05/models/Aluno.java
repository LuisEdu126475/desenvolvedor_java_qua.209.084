package com.atividade05.models;

public class Aluno {
    //atributos
    public String nome;
    public String email;
    public int idade;

    //metodos
    public String dadosDoAluno() {
    return " Olá, meu nome é " + this.nome + " Meu email é  " + this.email + " e minha idade é " + this.idade + ".";
    }

}
