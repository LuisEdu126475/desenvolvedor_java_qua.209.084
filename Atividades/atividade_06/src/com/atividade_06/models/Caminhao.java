package com.atividade_06.models;

final public class Caminhao extends Veiculo {
    private String carroceria;

    public Caminhao() {
    }

    public Caminhao(String carroceria) {
        super(carroceria, carroceria, carroceria, carroceria, carroceria);
        this.carroceria = carroceria;
    }

    public String getCarroceria() {
        return this.carroceria;
    }

    public void setCarroceria(String carroceria) {
        this.carroceria = carroceria;
    }



}
