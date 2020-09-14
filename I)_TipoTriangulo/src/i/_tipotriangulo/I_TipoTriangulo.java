package i._tipotriangulo;

import java.util.Scanner;

public class I_TipoTriangulo {

    public static void main(String[] args) {
//  I) Faça um programa que recebe o valor de três arestas e exibe uma mensagem indicando se podem formar um 
//  triângulo. Em caso afirmativo, indique se ele é equilátero, isósceles ou escaleno. Lembre-se: Para que um 
//  triângulo exista, a medida de qualquer um dos lados deve ser menor que a soma das medidas dos outros dois.
    Scanner leitor = new Scanner(System.in);
    double a, b, c;
    System.out.println("Digite a 1° medida");
    a = leitor.nextDouble();
    System.out.println("Digite a 2° medida");
    b = leitor.nextDouble();
    System.out.println("Digite a 3° medida");
    c = leitor.nextDouble();
    
    if(a < (b+c) && b < (a+c) && c < (a+b)){
        if(a == b && b == c){
            System.out.println("Triângulo equilatero");
        } else if(a == b || b == c || a == c){
            System.out.println("Triângulo isoceles");
        } else {
            System.out.println("Triângulo escaleno");
        }
    } else {
        System.out.println("Triângulo não detectado");
        }
    
    }
}
