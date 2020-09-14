package h._areatriangulos;

import javax.swing.JOptionPane;

public class H_AreaTriangulos {

    public static void main(String[] args) {
//  H) Desenvolva um programa que recebe a base e a altura de três triângulos e 
//  exibe a maior área. Lembre-se da ;
//  fórmula: Área = Base × Altura / 2

    int b, a, b2, a2, b3, a3;
    double A, A2, A3;
  
//  Primeiro Triângulo
    b = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do triângulo"));
    a = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do triângulo"));
    A = ((b*a)/2);
//  Segundo Triângulo    
    b2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do 2° triângulo"));
    a2 = Integer.parseInt(JOptionPane.showInputDialog("Digite a altura do 2° triângulo"));
    A2 = ((b2*a2)/2);
//  Terceiro Triângulo
    b3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do 3° triângulo"));
    a3 = Integer.parseInt(JOptionPane.showInputDialog("Digite a base do 3° triângulo"));
    A3 = ((b3*a3)/2);
    
        if ((A <= A2) && (A <= A3)){
            if (A2 <= A3) {
                JOptionPane.showMessageDialog(null, "A área do maior triângulo é: "+A3);
            } else {
                JOptionPane.showMessageDialog(null, "A área do maior triângulo é: "+A2);
            }
        } else if ((A2 <= A) && (A2 <= A3)) {
            if (A <= A3){
                JOptionPane.showMessageDialog(null, "A área do maior triângulo é: "+A3);
            } else {
                JOptionPane.showMessageDialog(null, "A área do maior triângulo é: "+A);
            }
        } else if (A <= A3){
                JOptionPane.showMessageDialog(null, "A área do maior triângulo é: "+A2);
        } else {
                JOptionPane.showMessageDialog(null, "A área do maior triângulo é: "+A);
        }
    }
}
