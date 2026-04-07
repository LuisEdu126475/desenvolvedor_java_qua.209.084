package com.atividade_06.models;

final public class Caminhao extends Veiculo {
    private int carroceria;

    public Caminhao(int carroceria , String modelo , String cor , String ano , String placa , String fabricante , String categoria) {
        super(fabricante, modelo, cor, ano, placa, categoria);
        this.carroceria = carroceria;

        
    }

    public int getCarroceria() {
        return this.carroceria;
    }

    public void setCarroceria(int carroceria) {
        this.carroceria = carroceria;
    }



}
