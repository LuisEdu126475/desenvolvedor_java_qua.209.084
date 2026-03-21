package com.atividade02.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Todo: atividade 02
        // Crie um programa que receba do usuario o nome e a idade
        // e depois exiba uma lista de filme
        // sala 01 - a roda quadrada - livre
        // sala 02 a volta dos que nao foram- 12 anos
        // sala 03- poeira em alto mar - 14 anos
        // sala 04 as tranças do rei careca - 16 anos
        //sala 05- a vigança do peixe frito - 18 anos
        // o usuário deverá escolher o filme desejado. Se tiver a idade 
        // minima para ver o filme, o programa imprime o ingresso e
        // encerra. se o usuario nao tiver a idade minima, o programa
        // bloqueia a entrada de re-exibe a lista de filmes para o usuário
        // escolher outro filme.

         Scanner sc = new Scanner(System.in);

        String nome;
        int idade;
        int escolha;
        int opção =0;
        do{
            System.out.println(" informe seu nome");
            nome = sc.next();
            System.out.println(" informe sua idade");
            idade = sc.nextInt();
            
            System.out.println("--- LISTA DE FILMES---");
            System.out.println(" sala 01 - a roda quadrada - livre");
            System.out.println(" sala 02 a volta dos que nao foram- (12 anos) "); 
            System.out.println(" sala 03- poeira em alto mar - (14 anos) ");
            System.out.println(" sala 04 as tranças do rei careca - (16 anos) ");
            System.out.println(" sala 05- a vigança do peixe frito - (18 anos) ");
              System.out.println("/n Escolha seu filme de 1 a 5:");
              escolha= sc.nextInt();
        
            switch (escolha) {
                case 1:
                    if (idade>=0) {
                        System.out.println(" sala 1 a roda quadrada - livre");
                        System.out.println(" ingresso impresso! Bom filme.");
                    }
                    break;
                    case 2:
                        System.out.println(" sala 02 a volta dos que nao foram- 12 anos");
                        if (idade >= 12) {
                            System.out.println(" Ingresso Impresso!");
                        } else {
                            System.out.println(" Entrada Bloqueada: Idade minima é 12 anos.");
                        }
                        break;
                        case 3:
                            System.out.println(" sala 03- poeira em alto mar - 14 anos");
                            if (idade >= 14) {
                                System.out.println(" Ingresso Impresso");
                            }
                            else {
                                System.out.println(" Entrada Bloqueada: Idade minima é 14 anos.");
                            }
                            break;
                            case 4:
                                System.out.println("  sala 04 as tranças do rei careca - 16 anos");
                            if (idade >=16) {
                                System.out.println(" Ingresso Impresso ");
                            }
                            else{
                                System.out.println(" Entrada Bloqueada: Idade minima é 16 anos");
                            }
                            break;
                            case 5:
                                System.out.println(" sala 05- a vigança do peixe frito - 18 anos");
                                if (idade >=18) {
                                    System.out.println(" Ingresso Impresso");
                                }
                                else {
                                    System.out.println(" Entrada Bloqueada: idade minima é 18 anos");
                                }

                            
                                break;


            
                default:
                    System.out.println(" Opção Inválida! Tente Novamente");
            }        
                
        sc.close();
    } while (opção !=0);
} 
}

