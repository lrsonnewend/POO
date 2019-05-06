package RevisaoEstruturaSelecao;
import java.util.*;

public class RevIfElse {
    public static void main(String[] args){
        java.util.Scanner reader = new java.util.Scanner(System.in);
        
        int n1 = 0, n2 = 0;
        
        System.out.println("Insira um valor inteiro para o número 1:");
        n1 = reader.nextInt();
        
        System.out.println("Insira um valor inteiro para o número 2:");
        n2 = reader.nextInt();
        
        if(n1 < n2)
            System.out.println("Número 2 maior que número 1");
        
        if(n1 > n2)
            System.out.println("Número 1 maior que número 2");
        
        if(n1 == n2)
            System.out.println("Número 1 e número 2 são iguais");
        
        if(n1 != n2)
            System.out.println("Número 1 e número 2 são diferentes");
    }
    
}
