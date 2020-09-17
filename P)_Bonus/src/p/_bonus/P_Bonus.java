package p._bonus;

import javax.swing.JOptionPane;

public class P_Bonus {

    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Informe o nome do funcionário: ");
        int tempoDeCasa = Integer.parseInt(JOptionPane.showInputDialog("Informe o tempo de casa:"));
        char sexo = JOptionPane.showInputDialog("Informe o sexo: ").charAt(0);
        double salario = Double.parseDouble(JOptionPane.showInputDialog("Informe o salário"));
        
        if(tempoDeCasa > 15 && sexo == 'H'){
            double bonus = 0.20;
            double salarioNatal = (salario * bonus) + salario;
            JOptionPane.showMessageDialog(null, "Salário com bônus de natal: R$" +  salarioNatal);
        }else if(tempoDeCasa > 10 && sexo == 'M') {
            double bonus = 0.25;
            double salarioNatal = (salario * bonus) + salario;
            JOptionPane.showMessageDialog(null, "Salário com bônus de natal: R$" +  salarioNatal);
        }else {
            double salarioNatal = salario + 200;
            JOptionPane.showMessageDialog(null, "Salário com bônus de natal: R$" +  salarioNatal);
        }
    }
    
}
