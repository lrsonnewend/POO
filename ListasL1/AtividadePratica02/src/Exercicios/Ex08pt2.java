package Exercicios;

public class Ex08pt2 {
    public static void main(String[] args) {
        int n1, n2, n3, n4;
        
        java.util.Scanner reader = new java.util.Scanner(System.in);
        
        n1 = reader.nextInt();
        n2 = reader.nextInt();
        n3 = reader.nextInt();
        n4 = reader.nextInt();
        
        n1 = (n1-7)/(10 % n1);
        n2 = (n2-7)/(10 % n2);
        n3 = (n3-7)/(10 % n3);
        n4 = (n4-7)/(10 % n4);
        
        System.out.println("número discriptografado: "+n1+n2+n3+n4); 
        
    }
    
}
