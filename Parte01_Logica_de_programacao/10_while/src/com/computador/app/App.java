package com.computador.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
         Scanner sc = new Scanner(System.in);
         int numero;
         

         System.out.println(" informe um número inteiro");
         numero = sc.nextInt();
        
         //laço de repetição while
         while (numero >=0) {
            System.out.println(numero);
            
            
            numero--;
            
         }









         sc.close();
    
    }
}
