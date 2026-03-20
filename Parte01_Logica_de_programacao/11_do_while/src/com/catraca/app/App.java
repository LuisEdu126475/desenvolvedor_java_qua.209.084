package com.catraca.app;

import java.util.Scanner;
public class App {

    
    public static void main(String[] args) throws Exception {
        Scanner sc =new Scanner(System.in);


        String nome;
        double peso;
        double altura;
        int opção;


      do {
        // entrada de dados
        
        System.out.println("Deseja registrar nova entrada");
        System.out.println(" 1 - registrar nova entrada");
        System.out.println("2 - Sair do programa");
        opção = sc.nextInt();

        if (opção == 1 ) {
            sc.nextLine();
            System.out.println(" informe o nome.");
            nome = sc.nextLine();
            System.out.println(" informe o peso em Kg:");
            peso = sc.nextDouble();
            System.out.println(" Informe a altura em metros");
            altura = sc.nextDouble();
            if (peso < 120 && altura >= 1.25) {
                System.out.println("entrada de " + nome + " autorizada");
                }
             
                else {
                    System.out.println(" entrada de " + nome + " não autorizada");
                }
                
            
        }
        else if (opção== 2) {
            System.out.println(" obrigado pela a preferência");
        }
        else {
            System.out.println(" Opção inválida.");

        }
      } while(opção != 2);





        sc.close();
        
    }
}
