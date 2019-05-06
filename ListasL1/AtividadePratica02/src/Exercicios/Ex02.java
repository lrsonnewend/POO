package Exercicios;

public class Ex02 {
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
        int n1, n2;
        
        System.out.println("Insira o primeiro número: ");
        n1 = reader.nextInt();
        
        System.out.println("Insira o segundo número: ");
        n2 = reader.nextInt();
        
        System.out.println("Soma: "+(n1+n2));
        System.out.println("Média: "+((n1+n2)/2));
        
        if(n1 > n2)
            System.out.println("Ordem crescente: "+n2+", " +n1);
        else
            System.out.println("Ordem crescente: "+n1+", " +n2);

    }
    
}
