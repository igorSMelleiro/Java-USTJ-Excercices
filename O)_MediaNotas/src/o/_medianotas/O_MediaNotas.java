package o._medianotas;

import javax.swing.JOptionPane;

public class O_MediaNotas {

    public static void main(String[] args) {
        double n1,n2,n3,n4,n5;
        double media;
        
        n1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nata da 1° prova"));
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nata da 2° prova"));
        n3 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nata da 1° trabalho"));
        n4 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nata da 2° trabalho"));
        n5 = Double.parseDouble(JOptionPane.showInputDialog("Digite a nata da 3° trabalho"));
        
        media = (n1 + n2 + n3 + n4 + n5) / 5  ;
        
        if(media >= 6 && media <= 10) {
            JOptionPane.showMessageDialog(null, "Aprovado!" + "\n" + media);
        } else if (media >= 4 && media < 6) {
            JOptionPane.showMessageDialog(null, "Exame" + "\n" + media);
        } else {
            JOptionPane.showMessageDialog(null, "Reprovado" + "\n" + media);
        }
    }
    
}
