package com.apresentar.app;

import javax.swing.JOptionPane;

import com.apresentar.models.Pessoa;
public class App {
    public static void main(String[] args) throws Exception {
        Pessoa pessoa = new com.apresentar.models.Pessoa(null, null, 0);

        //entrada de dados
      pessoa.setNome(JOptionPane.showInputDialog("Informe seu nome:"));
      pessoa.setIdade(Integer.parseInt(JOptionPane.showInputDialog(" Informe a sua idade")));
      pessoa.setEmail(JOptionPane.showInputDialog("Informe o seu email"));

      //saida de dados
      JOptionPane.showMessageDialog(null, pessoa);
    }
}
