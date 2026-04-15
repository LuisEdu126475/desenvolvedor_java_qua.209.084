package com.atividade08.app;

import javax.swing.JOptionPane;

import com.atividade08.models.Pessoa;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new Pessoa(null, 0);
        

        //entrada de dados
        pessoa.setNome(JOptionPane.showInputDialog(" Informe o seu nome:"));
        pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog(" Informe a sua idade:")));

        if ( pessoa.getIdade()>= 18) {
            JOptionPane.showMessageDialog(null, pessoa.getIdade()+" ,Você é maior de idade");
            
        }
        else{
            JOptionPane.showMessageDialog(null, pessoa.getIdade()+ " ,Você tem que cresçer mais para usar esse programa");
        }
        

        //saida de dados
        JOptionPane.showMessageDialog(null,
            " Nome: " + pessoa.getNome() + 
            " Idade: " + pessoa.getIdade()
        );
        


            
    
}
}
