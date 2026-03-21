package com.atividades03.app;
  import java.util.Scanner;
public class App {
       public static void main(String[] args) throws Exception {
        //recrie o programa da calculadora feito no dia 18/03/2026, mas
        //desta vez acrescentando a opção de encerrar o programa quando o
        //usuario quiser.
        Scanner sc = new Scanner(System.in);


        double num1;
        double num2;
        double result = 0;
        String operador;
        double opção = 0;


        System.out.println(" informe o primeiro número");
    num1 = sc.nextDouble();
    System.out.println(" informe o segundo número");
    num2 = sc.nextDouble();

    //limpeza de buffer
    sc.nextLine();
    
    //menu
    do{
        System.out.println(" Informe operação desejada");
    System.out.println(" 1 - some");
    System.out.println(" 2 - subtração ");
    System.out.println("3 - multiplicação");
    System.out.println(" 4 - divisão");  
    System.out.println(" 5 - sair do programa");
    operador = sc.nextLine();
    } while(opção !=0);
    

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
sc.close();
        
    }
}
    