package com.atividade09.app;

import javax.swing.JOptionPane;

import com.atividade09.models.Usuario;
public class App {
    public static void main(String[] args) throws Exception {

        Usuario usuario = new Usuario(0, 0);

        String opçaoSelecionada = "";
        Object opcao;
        String [] opcoes = {"Etanol", "Gasolina", "Calcular", "Sair"};

        do {
            opcao = JOptionPane.showInputDialog(
                null, 
                " Escolha uma opção",
                "Melhor combustivel", 
                JOptionPane.QUESTION_MESSAGE,
                null, 
                opcoes, 
                opcoes[0]

            );
            
            opçaoSelecionada = (String) opcao;
            

            switch (opçaoSelecionada) {
                case "Etanol":
                   usuario.setEtanol(Double.parseDouble(JOptionPane.showInputDialog(" Informe o valor do etanol"). replace("," , ".")));

                   break;
                   case "Gasolina":
                    usuario.setGasolina(Double.parseDouble(JOptionPane.showInputDialog(" Informe o valor da gasolina"). replace(",", ".")));
                    break;
                    case "Calcular":
                        JOptionPane.showMessageDialog(null, usuario.melhorCombustivel());
                        break;
                    
                 
                  
                    
                    
            }
        } while (opcao != "Sair");

        
    }
    
}
















































//Faça um programa com JOptionPane que receba do usuario os valores dos combustiveis etanol e gasolina, e exiba qual o melhor combustivel para abastecer. O programa deverá mostrar a opção de entrar com o valor do etanol, da gasolina, mostrar melhor combustivel ou sair do programa 