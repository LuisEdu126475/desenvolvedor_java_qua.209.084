package com.classe.app;
 
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe pessoa
        Pessoa pessoa = new Pessoa(); //funcao metodo esse new Pessoa(); método construtor.
        Scanner sc = new  Scanner(System.in);

        //entrada de dados
        System.out.println(" Informe o nome da pessoa:");
        pessoa.nome = sc.nextLine();
        System.out.println(" Informe a idade da pessoa");
        pessoa.idade = sc.nextInt();
        System.out.println(" Informe a altura da pessoa em metros:");
        pessoa.altura = sc.nextDouble();
        System.out.println( " Informe o seu peso em Kg");
        pessoa.peso = sc.nextDouble();

        //limpeza de buffers
        sc.nextLine();
        
        System.out.println(" Informe o e-mail da pessoa");
        pessoa.email = sc.nextLine();

        //definir os valores dos atributos
        pessoa.nome ="Luís Eduardo Alves";
        pessoa.email = "Alucard66khs@gmail.com";
        pessoa.idade = 17;
        pessoa.altura = 1.84;

        //saida de dados
       
        pessoa.cumprimentar();
        pessoa.apresentar();

        sc.close();
    }
}
