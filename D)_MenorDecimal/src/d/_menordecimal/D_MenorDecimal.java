package d._menordecimal;

import javax.swing.JOptionPane;

public class D_MenorDecimal {

    public static void main(String[] args) {
//  D) Faça um programa que recebe dois números reais e exibe o menor deles e com duas casas decimais.    
    
    float n1, n2;
    
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro número"));
    n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo número"));
    
    if (n1 < n2) {
        JOptionPane.showMessageDialog(null, "O menor número é: "+n1);
    } else {
        JOptionPane.showMessageDialog(null, "O menor número é: "+n2);
    }
    
    }
    
}
