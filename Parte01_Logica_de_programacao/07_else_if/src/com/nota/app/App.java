package com.nota.app;

import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        //declaração de variavel
        String nome;
        double nota;

    
        //instancia a classe Scanner
        Scanner sc = new Scanner(System.in);
    
        //entrada de dados
        System.out.println("informe o nome do aluno");
        nome = sc.nextLine();
        System.out.println("informe a nota entre 0 e 10");
        nota = sc.nextDouble();

        //verifica se a nota é valida
        if (nota>= 0 && nota <= 10  ) {
            if (nota>=7) {
                System.out.println(nome + " está aprovado.");
            }
            else if (nota >= 5) {
                System.out.println(nome + " está de recuperação");
            }
            else{
                System.out.println(nome + " está reprovado.");
            }
        }
            else{
            System.out.println("Nota inválida.");
        }

        //fechar objeto scanner
        sc.close();
    }

}

