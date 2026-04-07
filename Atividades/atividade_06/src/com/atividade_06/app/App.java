package com.atividade_06.app;

import java.util.Scanner;
import com.atividade_06.models.Caminhao;
import com.atividade_06.models.Onibus;
import com.atividade_06.models.Carro;
import com.atividade_06.models.Moto;



public class App {
    public static void main(String[] args) throws Exception {
      //A partir da superclasse abstrata Veiculo, crie as subclass finais:
      //Moto, Carro, Onibus e Caminhao, todas no package models. Instancie cada 
      // uma das subclasses na classe principal e peça para o usuário informar
      //os seguintes atributos privados de um veiculo escolhido pelo o proprio 
      //usuário: fabricantes, modelo, cor, ano, placa. O atributo privado
      //categoria deverá ser informado pelo próprio progama.
      // Diferenças entre as classes: carro terá bagageiro, onibus poderá ser leito ou não, e caminhao terá carroceria.
      //ao final, o programa exibirá os dados do veiculo escolhido por ele
      // Note: utilize os 4 pilares da orientação a objetos para codar

     String tipoVeiculo;
     
    Scanner sc = new Scanner(System.in);
   

    System.out.println(" Informe o tipo de veiculo");
    System.out.println(" A - Moto");
    System.out.println(" B - Carro");
    System.out.println(" C - Caminhão");
    System.out.println(" D - Ônibus");
    tipoVeiculo = sc.nextLine();
  
    switch (tipoVeiculo) {
      case "A":
        Moto moto = new Moto(null, null , null , null , null , "A" , null );
        
        break;
    
      default:
        break;
    }
    
}
}