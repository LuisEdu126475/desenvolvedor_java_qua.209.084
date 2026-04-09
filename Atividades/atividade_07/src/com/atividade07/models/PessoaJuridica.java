package com.atividade07.models;
import com.atividade07.repository.Juros;

public class PessoaJuridica extends Pessoa implements Juros {
private String nomeFantasia;
private String cnpj;
private String razaoSocial;

@Override
public double calcularTaxa(double valor){
    return valor * 0.001;
}
}
