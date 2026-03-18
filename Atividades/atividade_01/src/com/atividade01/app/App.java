package com.atividade01.app;

import java.util.Scanner;


public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        
        //declaração das variáveis
        String nome;
        double peso;
        double altura;
        double imc;
        

        //Receber dados do usuário 
        System.out.println(" informe seu nome");
        nome = sc.nextLine();
        System.out.println(" informe seu peso");
        peso = sc.nextDouble();
        System.out.println(" informe sua altura");
        altura = sc.nextDouble();
        
        //declaracao de imc
        imc = (peso/(altura*altura));

        //recebendo resultado do imc do usuário
        if  (imc <= 25) {
            System.out.println(" voçê está abaixo do peso");
        }
        else if (imc >= 18.5 && imc <=25) {
            System.out.println(" voçê está no peso ideal");
        }
        else if (imc >= 25 && imc <=30 ) {
         System.out.println(" Voçê está obeso");   
        }
        else if (imc >= 35 && imc <=40) {
        System.out.println(" Voçê está em obesidade nível 2");
        }
        else if (imc > 40 ) {
        System.out.println(" Voçê está em obesidade mórbida");    
        }

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
