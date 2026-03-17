package com.maioridade;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        // declaracao de variaveis
        String nome;
       int idade;
        //instancia a classe scanner
        Scanner sc= new Scanner(System.in);
        //input
        System.out.println("informe o seu nome");
        nome= sc.nextLine();
        System.out.println("informe sua idade");
        idade = sc.nextInt();
            //verificar a idade
            if (idade>=18) {
            System.out.println(nome+ " é maior de idade");
            }
            else{
                System.out.println(nome + " é menor de idade");
            }
    }
}