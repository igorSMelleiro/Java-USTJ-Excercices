package j._raizesequacao;

import javax.swing.JOptionPane;

public class J_RaizesEquacao {

    public static void main(String[] args) {

        double a;//nosso A da equação. Por exemplo: 2X+3Y-10=0, nesse caso o “a” é o 2.

        double b;//nosso B da equação. Por exemplo: 2X+3Y-10=0, nesse caso o “b” é o 3.

        double c;//nosso C da equação. Por exemplo: 2X+3Y-10=0, nesse caso o “c” é o -10.

        double delta;//nosso Delta. Delta = “B” ao quadrado menos 4 vezes “A” vezes “C”. Lembra?

        double x1;//nossa primeira raiz da equação.

        double x2;//nossa segunda raiz da equação.

        a = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de A:"));//Menssagem e leitura do “a”

            while(a==0){
                JOptionPane.showMessageDialog(null,"O valor de A não pode ser zero a equação é do 2º grau !\n Digite outro valor !");
                a = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de A:"));//Menssagem e leitura do “a”
            }

            b = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de B:"));//Menssagem e leitura do “b”

            c = Double.parseDouble(JOptionPane.showInputDialog("Escreva o valor de C:"));//Menssagem e leitura do “c”

            delta = (b-(4*a*c));

            x1 = 0;//Definindo um valor inicial para o x1

            x2 = 0;//Definindo um valor inicial para o x2

            if (delta >= 0){
                x1 = (-b + Math.sqrt (delta)) / ( 2*a );//equação do x1

                x2 =   (-b - Math.sqrt (delta)) / ( 2*a ) ;//equação do x2  
                JOptionPane.showMessageDialog(null,"Delta vale :"+delta); //Mostra o valor de Delta
                JOptionPane.showMessageDialog(null,"\nx1 vale: "+ x1 + "\n x2 vale: "+ x2 );//mostra o x1 e x2.

            }
            else {
                JOptionPane.showMessageDialog(null,"Não há soluções que possam ser expressas com o conjunto dos números reais ");//avisa que o delta deu condição complexa
            }       
        
    }
    
}
