package c._inteiromaior;

import javax.swing.JOptionPane;

public class C_InteiroMaior {

    public static void main(String[] args) {    
//  C) Faça um programa que recebe dois números inteiros distintos e exibe o maior. 
    
    int n1, n2; 
    
    n1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número"));
    n2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número"));
    
    if (n1 < n2) {
        JOptionPane.showMessageDialog(null, "O maior número é: " + n2);
    } else {
        JOptionPane.showMessageDialog(null, "O maior número é: " + n1);
    }
        
    }
    
}
