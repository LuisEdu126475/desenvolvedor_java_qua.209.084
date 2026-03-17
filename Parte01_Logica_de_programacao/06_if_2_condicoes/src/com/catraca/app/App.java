package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        //declaração de variaveis
        String nome;
        double peso;
        double altura;

        //instancia a classe Scanner
        Scanner sc = new Scanner(System.in);
        
        //entrada de dados
        System.out.println(" informe seu nome");
        nome = sc.nextLine();
        System.out.println(" informe seu peso em kg");
        peso = sc.nextDouble();
        System.out.println(" informe sua altura em metros");
        altura = sc.nextDouble();

        //condicional com operador booleano
        if (peso<=120 && altura>=1.25) {
            System.out.println("Entrada de "+ nome +" autorizada");
            }
            else{
                System.out.println("Entrada de "+ nome+" não autorizada.");
            }
            
            //fecha objeto Scanner
        sc.close();
    }
}
