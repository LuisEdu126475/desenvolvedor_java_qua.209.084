package com.atividade_06.models;

final public class Onibus  extends Veiculo{

    private String leito;

    public Onibus(String leito , String fabricante, String modelo, String cor, String ano, String placa, String categoria) {
        super(fabricante, modelo, cor, ano, placa, categoria);
        this.leito = leito;
    }

    public String getLeito() {
        return this.leito;
    }

    public void setLeito(String leito) {
        this.leito = leito;
    }



}
