package pesoideal;

import javax.swing.JOptionPane;

public class PesoIdeal {

    public static void main(String[] args) {
        
    double altura, pesoideal;
    String sexo;

    sexo = JOptionPane.showInputDialog("Informe o Sexo: m/f");

    altura = Double.parseDouble(JOptionPane.showInputDialog("Digite Sua Altura: "));

    if (sexo.equals("m")){
        pesoideal = (72.7 * altura - 58);
        JOptionPane.showMessageDialog(null, "Seu peso ideal é "+pesoideal +"kg");
        
        }else if(sexo.equals("f")){
        pesoideal = (62.1 * altura - 44.7);
        JOptionPane.showMessageDialog(null, "Seu peso ideal é "+pesoideal +"kg"); 
        
        } else {
        JOptionPane.showMessageDialog(null, "Informe um caracter correto"); 
        }
            
    }
    
}
