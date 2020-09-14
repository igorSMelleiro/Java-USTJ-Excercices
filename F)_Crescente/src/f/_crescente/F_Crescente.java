package f._crescente;

import javax.swing.JOptionPane;

public class F_Crescente {

    public static void main(String[] args) {
//  F) Faça um programa que recebe três números reais e os exibe em ordem crescente.

    String num1, num2, num3;
    double n1, n2, n3;
    
//  Primeiro Número
    num1 = JOptionPane.showInputDialog("Digite o primeiro número");
    n1 = Double.parseDouble(num1);

//  Segundo Número
    num2 = JOptionPane.showInputDialog("Digite o segundo número");
    n2 = Double.parseDouble(num2);

//  Terceiro Número
    num3 = JOptionPane.showInputDialog("Digite o terceiro número");
    n3 = Double.parseDouble(num3);   
   
    if ((n1 <= n2) && (n1 <= n3)) {
        if (n2 <= n3) {
            JOptionPane.showMessageDialog(null, "A ordem Crescente é: "+"\n"+n1+" - "+n2+" - "+n3);
        } else {
            JOptionPane.showMessageDialog(null, "A ordem Crescente é: "+"\n"+n1+" - "+n3+" - "+n2);
        }
    } else if ((n2 <= n1) && (n2 <= n3)) {
        if (n1 <= n3) {
            JOptionPane.showMessageDialog(null, "A ordem Crescente é: "+"\n"+n2+" - "+n1+" - "+n3);
        } else {
            JOptionPane.showMessageDialog(null, "A ordem Crescente é: "+"\n"+n2+" - "+n3+" - "+n1);
        }
    } else if ( n1 <= n3 ) {
        JOptionPane.showMessageDialog(null, "A ordem Crescente é: "+"\n"+n3+" - "+n1+" - "+n2);
    } else {
        JOptionPane.showMessageDialog(null, "A ordem Crescente é: "+"\n"+n3+" - "+n2+" - "+n1);
    }
    
    }
    
}
