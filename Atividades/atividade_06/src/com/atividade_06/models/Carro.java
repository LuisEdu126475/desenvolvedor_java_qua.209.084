package com.atividade_06.models;

 final public class Carro extends Veiculo{
    //atributos
    private String bagageiro;

    public Carro( String bagageiro){
        this.bagageiro = bagageiro;

    }

    public Carro(String bagageiro) {
        super(bagageiro, bagageiro, bagageiro, bagageiro, bagageiro);
        this.bagageiro = bagageiro;
    }

    public String getBagageiro() {
        return this.bagageiro;
    }

    public void setBagageiro(String bagageiro) {
        this.bagageiro = bagageiro;
    }

    

}
