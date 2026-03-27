package com.atividade05.models;

public class Professor {
    public String nome;
    public String matrícula;
    public String calculo;

    //métodos
    public String dadosDoProfessor(){
        return " Olá aluno, meu nome é " + this.nome + " e minha matrícula é " + this.matrícula + ".";
    }

    public double areaDoTriangulo (double x, double y){
        return x*y/2;
    }
    public double equacaoDoCirculo( double r, double pi){
        return pi*Math.pow(r,2);
    }
    public double equacaoDoPrimeiroGrau (double xEquacao, double aEquacao, double bEquacao){
        return xEquacao = -bEquacao/aEquacao;
    }


}
