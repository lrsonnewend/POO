package Exercicios;

public class Ex04 {
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
        int n1 ,n2;
        
        n1 = reader.nextInt();
        
        n2= reader.nextInt();
        
        
        if(n1 % n2 == 0)
            System.out.println("primeiro é multiplo do segundo");
    }
}
