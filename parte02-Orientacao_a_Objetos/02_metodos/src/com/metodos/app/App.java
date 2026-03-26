package com.metodos.app;

import java.util.Scanner;

import com.metodos.models.Aluno;
import com.metodos.models.Professor;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
       Professor prof = new Professor();
        Aluno aluno = new Aluno();
       double x;
       double y;
       
       System.out.println(" informe o nome do aluno");
       aluno.nome = sc.nextLine();

       System.out.println(aluno.apresentar());
       
       



       prof.nome = " Luis o Gostosinho do momento";
        prof.materia = " Matemática";

        System.out.println(prof.darBoasVindas());
        
        System.out.println(" Informe o valor da base:");
        x = sc.nextDouble();
        System.out.println(" Informe o valor da altura:");
        y = sc.nextDouble();

        System.out.println(" Á área do quadrilátero é" + prof.areaQuadrilatero(x, y));
    sc.close();
    
    
    
    }
}
