package com.atividade07.models;




public class ContaPJ extends Conta  {
    private PessoaJuridica pj;
    

    public ContaPJ(double saldo, String nConta, String nAgencia,  PessoaJuridica pj) {
        super(saldo, nConta, nAgencia);
        this.pj = pj;
       
    }

    public PessoaJuridica getPj() {
        return this.pj;
    }

    public void setPj(PessoaJuridica pj) {
        this.pj = pj;
    }
    
    @Override
    public double fazerSaque(double valor){
        double taxa = pj.calcularTaxa(valor);
        double total = valor + taxa;
        if (total <= this.getSaldo()) {
            this.setSaldo(this.getSaldo() - total);
        }
        return this.getSaldo();
    }
}
