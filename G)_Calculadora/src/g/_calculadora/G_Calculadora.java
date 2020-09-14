package g._calculadora;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class G_Calculadora {

    public static void main(String[] args) {
//  G) Faça um programa que mostre um menu com as opções "adição", "subtração", "multiplicação" e "divisão", 
//  recebe dois valores reais, a operação escolhida pelo usuário e exibe o resultado da operação sobre os valores.
    
        double n1;
	double n2;
	
	String  operacao = "";
	double control=0;
	
	Scanner entrada = new Scanner(System.in);
	
	System.out.print("Digite a operação desejada (+, -, *, /): ");
	operacao = entrada.nextLine();
	
	System.out.println("Digite um valor: ");
	n1 = Double.parseDouble(entrada.nextLine());
	
	System.out.println("Digite um valor: ");
	n2 = Double.parseDouble(entrada.next());
	
	if(operacao.equals("+")) {
		System.out.println("O resultado da subtração é: " +(n1 + n2));
		control++;			
	}
	
	if(operacao.equals("-")) {
		System.out.println("O resultado da subtração é: " +(n1 - n2));
		control++;		
	}
	
	if(operacao.equals("*")) {
		System.out.println("O resultado da multiplicação é: " +(n1 * n2));
		control++;			
	}
	
	if(operacao.equals("/")) {
		System.out.println("O resultado da divisão é: " +(n1 / n2));
		control++;			
	}
	
	if(control == 0) {
		System.out.println("Opração inválida, Tente novamente!");
					
	}
	
}
}