package Exercicios;

public class Ex08 {
    public static void main(String[] args) {
        
    java.util.Scanner reader = new java.util.Scanner(System.in);
    int n1,n2,n3,n4;
    
    n1 = reader.nextInt();
    n2 = reader.nextInt();
    n3 = reader.nextInt();
    n4 = reader.nextInt();
    
    n1 = (n1+7)%10;
    n2 = (n2+7)%10;
    n3 = (n3+7)%10;
    n4 = (n4+7)%10;
    
    System.out.println("numero criptografado: "+n3+n4+n1+n2);
    
    
    }
    
}
