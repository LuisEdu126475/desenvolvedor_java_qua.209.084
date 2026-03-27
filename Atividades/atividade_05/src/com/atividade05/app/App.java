package com.atividade05.app;

import java.util.Scanner;

import com.atividade05.models.Professor;
import com.atividade05.models.Aluno;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Professor prof = new Professor();
        Aluno  aluno = new Aluno();
        
        double x = 0;
        double y = 0;
        double result = 0;
        String resultado;
        double pi;
        double r;
        double xEquacao = 0;
        double bEquacao;
        double aEquacao;
        
        

        System.out.println(" Informe o nome do aluno");
        aluno.nome = sc.nextLine();
        System.out.println(" Informe o seu email");
        aluno.email = sc.nextLine();
        System.out.println(" Informe sua idade");
        aluno.idade = sc.nextInt();

        System.out.println(aluno.dadosDoAluno());

        prof.nome = "Luis o Sabor de mel da matemática";
        prof.matrícula = "298098087";
        
        System.out.println(prof.dadosDoProfessor());

        //limpeza de buffer
        sc.nextLine();

        System.out.println(" Informe a operação desejada");
        System.out.println(" 1- calcular a área do triangulo");
        System.out.println(" 2- Calcular área do circulo");
        System.out.println(" 3- Equação do primeiro grau");
        resultado = sc.nextLine();

        switch (resultado) {
            case "1":
            System.out.println(" Informe a base do triangulo");   
            x = sc.nextDouble();
            System.out.println(" Informe a altura do triangulo");
            y = sc.nextDouble();
            System.out.println(" A area do triangulo é "+ prof.areaDoTriangulo(x, y));
            break;
            case "2":
                System.out.println(" Informe o raio do circulo");
                r = sc.nextDouble();
                System.out.println(" Considere o numero de pi como 3,14.");
                pi = sc.nextDouble();
                System.out.println(" A área do circulo é "+ prof.equacaoDoCirculo(r, pi));
              break;
                case"3":
                System.out.println(" Informe o valor de a");
                aEquacao = sc.nextDouble();
                System.out.println("Informe o valor de b");
                bEquacao = sc.nextDouble();
                System.out.println(" Sua equação do primeiro grau é" + prof.equacaoDoPrimeiroGrau(xEquacao, aEquacao, bEquacao));

              if (aEquacao!=0) {
                System.out.println("O seu resultado é" + prof.equacaoDoPrimeiroGrau(xEquacao, aEquacao, bEquacao));  
              }
              else {
                System.out.println("O a não pode ser 0 seu burro");
              }
                
                break;
                
        
            default:
              System.out.println(" Operação invalida");
        }
        sc.close();





        
    }
}
