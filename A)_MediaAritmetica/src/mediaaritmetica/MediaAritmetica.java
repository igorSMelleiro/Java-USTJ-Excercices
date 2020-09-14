package mediaaritmetica;

import javax.swing.JOptionPane;

public class MediaAritmetica {

    public static void main(String[] args) {
        
        String n1, n2, nome;
        double nota1, nota2, media;

//      Nome do aluno
        nome = JOptionPane.showInputDialog("Digite seu nome");
    
//      Primeira nota
        n1 = JOptionPane.showInputDialog("Digite a primeira nota");
        nota1 = Double.parseDouble(n1);

//      Segunda nota
        n2 = JOptionPane.showInputDialog("Digite a segunda nota");
        nota2 = Double.parseDouble(n2);
        
        media = (nota1 + nota2)/2;
        
        if (media >= 6) {
            JOptionPane.showMessageDialog(null, "A media de "+nome+ " é:" +"\n"+media, "Aluno aprovado!", JOptionPane.INFORMATION_MESSAGE);
        } else {
            JOptionPane.showMessageDialog(null, "A media de "+nome+ " é:" +"\n"+media, "Aluno reprovado!", JOptionPane.WARNING_MESSAGE);
        }
    }
    
}
