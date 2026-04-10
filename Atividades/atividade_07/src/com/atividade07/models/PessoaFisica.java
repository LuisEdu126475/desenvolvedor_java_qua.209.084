package com.atividade07.models;




public class PessoaFisica extends Pessoa {
    //atributos
    private String cpf;
    private String nome;
    

    public PessoaFisica(String cpf, String nome , String email) {
        super(email);
        this.cpf = cpf;
        this.nome = nome;
    }


    public String getCpf() {
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
  
}
