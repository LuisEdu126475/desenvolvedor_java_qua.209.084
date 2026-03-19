package com.atividade01.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
       
        String nome;
        double peso;
        double altura;
        double imc;
        String result;
        

        //Receber dados do usuário 
        System.out.println(" informe seu nome");
        nome = sc.nextLine();
        System.out.println(" informe seu peso em kg");
        peso = sc.nextDouble();
        System.out.println(" informe sua altura em metros");
        altura = sc.nextDouble();
        
        //declaracao de imc
        imc = (peso/(altura*altura));

        //mostra o imc par
        
        System.out.println(nome + " seu IMC é " + String.format("%.2f", imc) + ".");
        
        //recebendo resultado do imc do usuário
       result = (imc < 18.5) ? " está abaixo do peso.":
       (imc < 25) ? " está no peso ideal.":
       (imc < 30) ? " está acima do peso.":
        (imc < 35) ? " está obeso.":
        (imc < 40 ) ? " está com obesidade mórbida II":
        " está com obesidade mórbida.";

        //saída de dados
        System.out.println(nome + result);
       // fecha o objeto scanner
        sc.close();
    

    //crie um programa que receba do usuário: nome, peso e altura,
    // e exiba na tela o valor de seu IMC e o seu diagnóstico
    //e o seu diagnóstico
    //calculo do imc:peso/(altura*altura)
    //diagnósticos; imc menor que 18.5 e 25= peso ideal
    //imc entre 25 e 30= acima do peso
    //imc entre 30 e 35= obeso
    //imc entre 35 e 40= obesidade nível 2
    //imc maior que 40= obesidade mórbida

    }
}
