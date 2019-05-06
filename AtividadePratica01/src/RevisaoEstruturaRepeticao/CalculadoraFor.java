package RevisaoEstruturaRepeticao;
import java.util.Scanner;

public class CalculadoraFor {
    public static void main(String[] args){
        Scanner reader = new java.util.Scanner(System.in);
        boolean exec = true;
        
        while(exec){
            System.out.println("Digite a opção desejada:\n1 - Soma\n2 - Subtração"
                    + "\n3- Multiplicação\n4 - Divisão\n5 - Sair");
            
            int opcao = reader.nextInt();
            
            if(opcao == 1){
                System.out.println("Digite os números:");
                int n1 = reader.nextInt();
                int n2 = reader.nextInt();
                
                System.out.println("Resultado da soma: "+(n1+n2));
            }
            
            
            if(opcao == 2){
                System.out.println("Digite os números:");
                int n1 = reader.nextInt();
                int n2 = reader.nextInt();
                
                System.out.println("Resultado da subtração: "+(n1-n2));
            }
            
            if(opcao == 3){
                System.out.println("Digite os números:");
                int n1 = reader.nextInt();
                int n2 = reader.nextInt();
                
                System.out.println("Resultado da multiplicação: "+(n1*n2));
            }
            
            if(opcao == 4){
                System.out.println("Digite os números:");
                int n1 = reader.nextInt();
                int n2 = reader.nextInt();
                
                System.out.println("Resultado da divisão: "+(n1/n2));
            }
            
            if(opcao == 5){
               exec = false;
            }
        }
    
    }
}
