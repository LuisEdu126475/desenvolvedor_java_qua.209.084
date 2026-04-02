package com.encapsulamento.models;



abstract public class Pessoa {
 //atributos
 private String email;
 private String telefone;
//construtor 
    public Pessoa(String email, String telefone) {
        this.email = email;
        this.telefone = telefone;
    }

    //métodos de acesso(getters e setters)
    public String getEmail(){ //esse recebe os dados
        return this.email;
    }
    public void setEmail(String email){ //esse envia 
        this.email = email;
    }
    public String getelefone(){
        return this.telefone;

    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }


}
