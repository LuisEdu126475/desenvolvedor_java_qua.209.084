package com.ternario.app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //Declaração de variáveis
        String nome;
        String result;
        int idade;

        //instancia a classe Scanner
        Scanner sc = new Scanner(System.in);

        //entrada de dados
        System.out.println(" informe seu nome");
        nome = sc.nextLine();
        System.out.println(" informe sua idade");
        idade = sc.nextInt();

        //verifica a idade do usuário
        result=(idade>= 18)? " é maior de idade." : " é menor de idade.";

        //saída de dados
        System.out.println(nome + result);

        //fecha objeto Scanner
        sc.close();
  
   }
}
