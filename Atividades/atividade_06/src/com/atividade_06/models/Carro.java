package com.atividade_06.models;

 final public class Carro extends Veiculo{
    //atributos
    private boolean bagageiro;

    public Carro( boolean bagageiro , String modelo , String cor , String ano , String placa , String fabricante , String categoria){
        super(fabricante, modelo, cor, ano, placa, categoria);
        this.bagageiro = bagageiro;

    }
    public boolean isbagageiro(){
        return this.bagageiro;
    }

    public boolean getBagageiro() {
        return this.bagageiro;
    }

    public void setBagageiro(boolean bagageiro) {
        this.bagageiro = bagageiro;
    }

    

}
