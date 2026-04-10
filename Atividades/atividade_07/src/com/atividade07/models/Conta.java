package com.atividade07.models;

import com.atividade07.repository.IOperacoesConta;

public abstract class Conta implements IOperacoesConta {
    private double saldo;
    private String nConta;
    private String nAgencia;
    

    public Conta(double saldo, String nConta, String nAgencia) {
        this.saldo = saldo;
        this.nConta = nConta;
        this.nAgencia = nAgencia;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getNConta() {
        return this.nConta;
    }

    public void setNConta(String nConta) {
        this.nConta = nConta;
    }

    public String getNAgencia() {
        return this.nAgencia;
    }

    public void setNAgencia(String nAgencia) {
        this.nAgencia = nAgencia;
    }

    @Override
    public double fazerDeposito(double valor) {
       if( valor>= 0){
        this.saldo += valor;
       }
        return this.saldo;
       
    }

    @Override
    public double fazerSaque(double valor) {
      if( valor <= this.saldo){
        this.saldo -= valor;
      }
      return this.saldo;
    }

    @Override
    public void exibirDados() {
    System.out.println(" Conta:" + this.nConta);
    System.out.println(" Agencia:" + this.nAgencia);
    System.out.println(" Saldo" + this.saldo);
    }

    
   

}
