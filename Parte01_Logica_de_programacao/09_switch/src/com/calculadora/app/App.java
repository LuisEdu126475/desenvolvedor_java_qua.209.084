package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //instancia a classe scanner
        Scanner sc = new Scanner(System.in);
        
        //declarando variaveis

        double num1;
        double num2;
        double result = 0;
        String operador;

        //emtrada de dados
    System.out.println(" informe o primeiro número");
    num1 = sc.nextDouble();
    System.out.println(" informe o segundo número");
    num2 = sc.nextDouble();

    //limpeza de buffer
    sc.nextLine();
    
    //menu
    System.out.println(" informe operação desejada");
    System.out.println("1 - some");
    System.out.println("2 - subtração");
    System.out.println("3 - multiplicação");
    System.out.println("4 - divisão");
    operador = sc.nextLine();

    //verifica a operação desejada

    switch (operador) {
        case "1":
            result = num1 + num2;
            System.out.println(" o valor da soma é" + result);
            break;
            case "2":
                result = num1-num2;
                System.out.println(" o valor da subtração é " + result);
                break;
                case "3":
                    result = num1*num2;
                    System.out.println(" o valor da multiplicação é " + result);
                    break;
                    case "4":
                        result = num1/num2;
                        System.out.println(" O valor da divisão é" + result);
                        break;   
        default:
            System.out.println(" Operação inválida.");
    }
       

        //fechar objeto Scanner
        sc.close();
    }
}
