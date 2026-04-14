package com.entrada.app;

import javax.swing.JOptionPane;
public class App {
    public static void main(String[] args) throws Exception {
        String nome;

        //entrada de dados
        nome = JOptionPane.showInputDialog(" Informe o seu nome");

        //saída de dados
        JOptionPane.showMessageDialog(null, "Meu nome é " + nome);
    }
}
