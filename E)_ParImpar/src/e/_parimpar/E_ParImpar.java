package e._parimpar;

import javax.swing.JOptionPane;

public class E_ParImpar {

    public static void main(String[] args) {
//  E) Faça um programa que recebe um número inteiro e exibe uma mensagem indicando se ele é par ou ímpar (use o 
//  operador % para obter o resto de uma divisão inteira).

    int n1;
    
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número"));
    
    if (n1 % 2 ==0 ) {
        JOptionPane.showMessageDialog(null, "Seu número é par!");
    } else {
        JOptionPane.showMessageDialog(null, "Seu número é Impar!");
    }
    
    }
    
}
