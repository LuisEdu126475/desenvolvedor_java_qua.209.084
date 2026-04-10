package com.atividade07.models;

public class ContaPF extends Conta{
    private PessoaFisica pf;

    public ContaPF(double saldo, String nConta, String nAgencia, PessoaFisica pf) {
        super(saldo, nConta, nAgencia);
        this.pf = pf;
    }

    public PessoaFisica getPf() {
        return this.pf;
    }

    public void setPf(PessoaFisica pf) {
        this.pf = pf;
    }

    

}
