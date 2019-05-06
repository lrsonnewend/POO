
package Exercicios;

public class Ex01 {
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
        int n1, n2;
        
        System.out.println("Insira o primeiro número: ");
        n1 = reader.nextInt();
        
        System.out.println("Insira o segundo número: ");
        n2 = reader.nextInt();
        
        System.out.println("Soma: "+(n1+n2));
        System.out.println("Subtração: "+(n1-n2));
        System.out.println("Divisão: "+(n1/n2));
        System.out.println("Produto: "+(n1*n2));
        
    }
    
}
