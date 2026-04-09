package com.atividade07.models;

import com.atividade07.repository.OperacoesConta;

public class Conta implements OperacoesConta {
    private double saldo;
    private Pessoa titular;

    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }

    @Override
    public void sacar(double valor) {
      saldo =- valor;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }


    
   

}
