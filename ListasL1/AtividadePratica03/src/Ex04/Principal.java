package Ex04;

public class Principal {
    public static boolean multiplo(int n1, int n2){
        return (n2%n1 == 0);
    }
   
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
        
        int n1,n2;
        
        n1 = reader.nextInt();
        n2 = reader.nextInt();
        
        System.out.println(multiplo(n1,n2));
                
    }
    
}
