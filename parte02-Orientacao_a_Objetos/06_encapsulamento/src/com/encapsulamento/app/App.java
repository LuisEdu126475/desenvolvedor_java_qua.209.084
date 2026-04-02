package com.encapsulamento.app;
import java.util.Scanner;

import com.encapsulamento.models.PessoaJuridica;

import com.encapsulamento.models.PessoaFisica;



public class App {
    public static void main(String[] args) throws Exception {
        PessoaFisica usuario = new PessoaFisica(null, null, null, null);
        PessoaJuridica empresa = new PessoaJuridica(null, null, null, null);
        Scanner sc = new Scanner(System.in);
        
        //dados da empresa
        empresa.setNomeFantasia("Funerária você é próximo");
        empresa.setCnpj("09.780.602/0002-83");
        empresa.setEmail(" funeraria@contato.com.br");
        empresa.setTelefone("(61) 98765-4321");


        System.out.println(" Informe o seu nome");
        usuario.setnome(sc.nextLine());
        System.out.println(" Informe o seu cpf");
        usuario.setcpf(sc.nextLine());
        System.out.println(" Informe o e-mail");
        usuario.setEmail(sc.nextLine());
        System.out.println(" Informe o telefone");
        usuario.setTelefone(sc.nextLine());


        //saida de dados
        System.out.println(" \n Dados do Usuário\n");
        System.out.println("Nome do usuário: " + usuario.getnome());
        System.out.println("CPF do usuário: " + usuario.getcpf());
        System.out.println("E-mail do usuário: " + usuario.getEmail());
        System.out.println("Telefone do usuário: " + usuario.getelefone());
        System.out.println("\n DADOS DA EMPRESA\n");
        System.out.println("Nome da empresa: " + empresa.getNomeFantasia());
        System.out.println("E-mail da empresa: " + empresa.getEmail());
        System.out.println("Telefone da empresa: " + empresa.getelefone());
        System.out.println("CNPJ da empresa: " + empresa.getCnpj());
        sc.close();
    }
}
