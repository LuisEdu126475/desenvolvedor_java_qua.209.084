package com.encapsulamento.models;

 final public class PessoaFisica extends Pessoa {
//atributos
private String nome;
private String cpf;

    public PessoaFisica(String nome, String cpf, String email, String telefone) {
       super (email, telefone);
        this.nome = nome;
        this.cpf = cpf;
    }

 public String getnome(){ //esse recebe os dados
        return this.nome;
    }
    public void setnome(String nome){ //esse envia 
        this.nome = nome;
    }
    public String getcpf(){
        return this.cpf;

    }
    public void setcpf(String cpf){
        this.cpf = cpf;
    }











}
