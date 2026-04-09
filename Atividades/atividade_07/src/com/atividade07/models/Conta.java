package com.atividade07.models;

import com.atividade07.repository.OperacoesConta;

public class Conta implements OperacoesConta {
    private double saldo;

    @Override
    public void depositar(double valor) {
        saldo += valor;
        
    }

    @Override
    public void sacar(double valor) {
      saldo =- saldo;
    }

    @Override
    public double consultarSaldo() {
        return saldo;
    }


    
   

}
