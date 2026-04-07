package com.atividade_06.models;

 final public class Carro extends Veiculo{
    //atributos
    private String bagageiro;

    public Carro( String bagageiro , String modelo , String cor , String ano , String placa , String fabricante , String categoria){
        super(fabricante, modelo, cor, ano, placa, categoria);
        this.bagageiro = bagageiro;

    }

    public String getBagageiro() {
        return this.bagageiro;
    }

    public void setBagageiro(String bagageiro) {
        this.bagageiro = bagageiro;
    }

    

}
