package com.atividade07.app;

import com.atividade07.models.Conta;
import com.atividade07.models.PessoaFisica;
import com.atividade07.models.Pessoa;
import com.atividade07.models.ContaPJ;
import com.atividade07.models.ContaPF;
import com.atividade07.models.PessoaJuridica;

import java.nio.channels.Pipe.SourceChannel;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int tipoConta;
        String opções;

        System.out.println(" === SISTEMA BANCARIO ===");
        System.out.println(" Escolha o tipo de conta");
        System.out.println(" 1- PESSOA FISÍCA");
        System.out.println(" 2- PESSOA JURIDICA");
        tipoConta = sc.nextInt();
        sc.nextLine();

        System.out.println(" Informe o e-mail:");
        String email = sc.nextLine();

        System.out.println(" Informe o numero da conta");
        String nConta = sc.nextLine();

        System.out.println(" Informe a agência");
        String nAgencia = sc.nextLine();

        System.out.println(" Informe o saldo inicial");
        Double saldo = sc.nextDouble();

        sc.nextLine();
        
        if (tipoConta == 1) {
            System.out.println(" Informe o seu nome");
            String nome = sc.nextLine();

            System.out.println(" Informe o numero da conta");
            String numeroConta = sc.nextLine();

            System.out.println(" Informe a agência");
            String numeroAgencia = sc.nextLine();

            System.out.println(" Informe o valor do saldo da conta");
            Double numeroDoSaldo = sc.nextDouble();

            sc.nextLine();
        }
    }
}





























































// - atividade 07
//crie um programa de aplicativo de banco: o usuário poderá escolher se 
//desejar entrar como pessoa fisica ou pessoa juridica, devera informar o 
// nome, email e cpf (classe PessoaFisica), ou nome fantasia, razao social,
//email e cnpj(Classe PessoaJuridica), e o programa devera informar a 
//agência e conta (classe Conta ) do titular(uma unica vez durante todo o programa)
//Em seguida, o programa devera exibir as opções para o
//usuario: consultar dados da conta, fazer saque, fazer depósito,sair do programa
//O programa deverá cobrar uma taxa de 0,01% em cima de cada saque feito pela pessoa juridica.
//Qualquer saque só podera ser feito caso o valor do saque seja menor ou igual ao saldo da conta
//NOTE - use os 4 pilares da orientação objeto, mais interface e 
//composição. E o mais importante: SE LASQUEM
