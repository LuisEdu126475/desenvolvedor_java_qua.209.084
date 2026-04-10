package com.atividade07.models;
import com.atividade07.repository.IJuros;

public class PessoaJuridica  extends Pessoa implements IJuros {
private String nomeFantasia;
private String cnpj;
private String razaoSocial;


    public PessoaJuridica(String nomeFantasia, String cnpj, String razaoSocial, String email) {
        super(email);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }



@Override
public double calcularTaxa(double valor){
    return valor * 0.001;
}
}
