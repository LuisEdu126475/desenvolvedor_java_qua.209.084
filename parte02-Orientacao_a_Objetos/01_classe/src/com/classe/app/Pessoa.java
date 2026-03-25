package com.classe.app;

public class Pessoa {
    //atributos
    public String nome;
    public String email;
    public int idade;
    public double altura;
    public double peso;

    //método
    public void cumprimentar() {
        System.out.println(" Olá, boa noite!");
    }

    public void apresentar() {
        System.out.println(" Meu nome é " + this.nome+ ", Meu e-mail é " + this.email + " , tenho"+ this.idade + " anos, e " + this.altura + " metros de altura. " + " Meu peso "  + this.peso);
    }
}

