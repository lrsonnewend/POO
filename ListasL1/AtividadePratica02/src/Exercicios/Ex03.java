
package Exercicios;


public class Ex03 {
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
        int n1, n2, n3, n4, n5;
        int maior = 0;
        int men = 0;
        
        System.out.println("Insira o primeiro número: ");
        n1 = reader.nextInt();
        maior = n1;
        System.out.println("Insira o segundo número: ");
        n2 = reader.nextInt();
        if(n2 > maior)
            maior = n2;
        
        else if (n2 < maior)
            men = n2;
        
        System.out.println("Insira o terceiro número: ");
        n3 = reader.nextInt();
        
        if(n3 > n2 && n3 > n1)
            maior = n3;
        
        
        
        else if (n3 < n2 && n3 < n1)
            men = n3;

        System.out.println("Insira o quarto número: ");
        n4 = reader.nextInt(); 
        if(n4 > n3 && n4 > n2 && n4 > n1)
            maior = n4;
        
        else if(n4 < n3 && n4 < n2 && n4 < n1)
            men = n4;
   
        System.out.println("Insira o quinto número: ");
        n5 = reader.nextInt();
        if(n5 > n4 && n5 > n3 && n5 > n2 && n5 > n1)
            maior = n5;
        
        else if(n5 < n4 && n5 < n3 && n5 < n2 && n5 < n1)
            men = n5;
        
        System.out.println("Menor: "+men);
        System.out.println("Maior: "+maior);
        
    
    }
    
}
