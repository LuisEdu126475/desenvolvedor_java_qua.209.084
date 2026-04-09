package com.atividade_06.models;

final public class Onibus  extends Veiculo{

    private boolean leito;

    public Onibus(boolean leito , String fabricante, String modelo, String cor, String ano, String placa, String categoria) {
        super(fabricante, modelo, cor, ano, placa, categoria);
        this.leito = leito;
    }
    public boolean isLeito(){
        return this.leito;
    }

    public boolean getLeito() {
        return this.leito;
    }

    public void setLeito(boolean leito) {
        this.leito = leito;
    }



}
