package com.atividade04.app;
import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        Veiculo veiculo = new Veiculo();
        Scanner sc = new Scanner(System.in);
        //Atividade 04
        //desenvolva um programa que crie um objeto da classe veiculo
        //(pode ser qualquer veiculo) com os atributos:
        // - fabricante
        // - modelo 
        // - placa
        // - ano 
        // - cor
        // o programa deverá mostrar os dados do veículo(obs: veiculo nao)
        // obs: mostrar dados,portanto nao pode ser via método
        // note: usuário deverá informar os dados do veículo


        //entrada de dados
        System.out.println(" Informe o fabricante do carro");
        veiculo.nome = sc.nextLine();
        System.out.println(" Informe o modelo do carro");
        veiculo.modelo = sc.nextLine();
        System.out.println(" Informe a placa do carro");
        veiculo.placa = sc.nextLine();
        System.out.println(" Informe o ano do carro");
        veiculo.ano = sc.nextInt();
        System.out.println(" Informe a cor do carro");
        veiculo.cor = sc.nextLine();

        //limpeza de buffer
        

    // definir os valores dos atributos
  
    System.out.println(" A fabricante do seu carro é:" + veiculo.nome);
    System.out.println(" O modelo do seu carro é:" + veiculo.modelo);
    System.out.println(" A placa do seu carro é:" + veiculo.placa);
    System.out.println(" O ano do seu carro é:" + veiculo.ano);
    System.out.println(" A cor do seu carro é:"+ veiculo.cor);


    sc.close();



    }
}
