package m._cilindradas;

import javax.swing.JOptionPane;

public class M_Cilindradas {

    public static void main(String[] args) {
        double cilindradas;
        
        cilindradas = Double.parseDouble(JOptionPane.showInputDialog("Digite o numero de cilindradas:"));
        
        
        if(cilindradas <= 120){
            JOptionPane.showMessageDialog(null, "Sub Production" + "\n" + cilindradas);
        } else if (cilindradas <= 240 && cilindradas >= 121) {
            JOptionPane.showMessageDialog(null, "Production" + "\n" + cilindradas);
        } else {
            JOptionPane.showMessageDialog(null, "Super Production" + "\n" + cilindradas);
        }
    }
    
}
