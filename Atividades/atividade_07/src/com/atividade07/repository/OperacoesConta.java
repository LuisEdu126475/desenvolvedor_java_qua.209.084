package com.atividade07.repository;

public interface OperacoesConta {
    public void depositar(double valor);
    public void sacar(double valor);
    double consultarSaldo();
}
