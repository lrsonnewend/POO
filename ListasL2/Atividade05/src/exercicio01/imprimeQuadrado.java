package exercicio01;

public class imprimeQuadrado {
    public static void main(String[] args) {
        int ladoQuad;
        java.util.Scanner reader = new java.util.Scanner(System.in);
        
        do{
            System.out.println("Inisira o lado do quadrado (min = 1 max = 20):");
            ladoQuad = reader.nextInt();
    
            if(ladoQuad > 20)
            System.out.println("Tamanho inválido.");
    
        }while(ladoQuad > 20);
        
        for(int i = 0; i < ladoQuad; i++){
            for(int j = 0; j < ladoQuad*2; j++)
                System.out.print("*");
        
            System.out.print("\n");
        }
    }   
}
