package n._nadador;

import javax.swing.JOptionPane;

public class N_Nadador {

    public static void main(String[] args) {
        int idade;
                
        idade = Integer.parseInt(JOptionPane.showInputDialog("Digite a idade do nadador"));
        
        if(idade <= 10){
            JOptionPane.showMessageDialog(null, "Categoria Infantil");
        } else if (idade <= 14 && idade >= 11 ) {
            JOptionPane.showMessageDialog(null, "Categoria Junior");
        } else if (idade <= 20 && idade >= 15) {
            JOptionPane.showMessageDialog(null, "Categoria Adolescente");
        } else if (idade <= 35 && idade >= 21) {
            JOptionPane.showMessageDialog(null, "Categoria Jovem");
        } else{
            JOptionPane.showMessageDialog(null, "Categoria Máster");
        }
        
    }
    
}
