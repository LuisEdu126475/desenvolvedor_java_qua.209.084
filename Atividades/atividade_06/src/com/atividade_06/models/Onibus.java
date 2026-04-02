package com.atividade_06.models;

final public class Onibus  extends Veiculo{

    private String leito;


    public Onibus() {
        
    }

    public Onibus(String leito) {
        super(leito, leito, leito, leito, leito);
        this.leito = leito;
    }

    public String getLeito() {
        return this.leito;
    }

    public void setLeito(String leito) {
        this.leito = leito;
    }



}
