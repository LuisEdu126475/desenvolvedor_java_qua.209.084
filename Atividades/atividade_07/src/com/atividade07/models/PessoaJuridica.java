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

    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getRazaoSocial() {
        return this.razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }
    



@Override
public double calcularTaxa(double valor){
    return valor * 0.001;
}
}
