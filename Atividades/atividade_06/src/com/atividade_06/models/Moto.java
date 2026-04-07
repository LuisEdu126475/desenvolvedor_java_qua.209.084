package com.atividade_06.models;

 final public class Moto extends Veiculo{
    private String cilindradas;
 

    public Moto( String fabricante, String modelo, String cor, String ano, String placa , String categoria, String cilindradas) {
       super(fabricante, modelo, cor, ano, placa, categoria);
       this.cilindradas = cilindradas;
    }
    //getters e setters

    public String getCilindradas() {
        return this.cilindradas;
    }

    public void setCilindradas(String cilindradas) {
        this.cilindradas = cilindradas;
    }
    
}
