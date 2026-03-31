package com.construtor.app;

import java.util.Scanner;

import com.construtor.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa pessoa = new Pessoa();
        Pessoa usuario = new Pessoa(
            null,
            null,
            null,
            null,
            0,
            0

        );

        System.out.println(" Informe o seu nome:");
        usuario.nome = sc.nextLine();
        System.out.println(" Informe o seu email");
        usuario.email = sc.nextLine();
        System.out.println(" Informe o seu telefone");
        usuario.telefone = sc.nextLine();
        System.out.println(" Informe o seu cpf");
        usuario.cpf = sc.nextLine();
        System.out.println(" Informe a sua idade");
        usuario.idade = sc.nextInt();
        System.out.println(" Informe a sua altura em metros");
        usuario.altura = sc.nextDouble();

        System.out.println("Nome:"+ usuario.nome);
        System.out.println("E-mail:"+ usuario.email);
        System.out.println("Telefone:"+ usuario.telefone);
        System.out.println("CPF:" + usuario.cpf);
        System.out.println("Idade:" + usuario.idade);
        System.out.println("Altura:" + usuario.altura);



        sc.close();

        
    }
}
