package exercicio02;
public class verificaTriangulo {
    public static void main(String[] args) {
        
    
        double lado1, lado2, hipotenusa;
    
        java.util.Scanner reader = new java.util.Scanner(System.in);
    
        System.out.println("Digite os lados do triângulo (catetos): ");
        
        lado1 = reader.nextDouble();
        lado2 = reader.nextDouble();
        
        System.out.println("Digite o valor da hipotenusa deste triângulo: ");
        hipotenusa = reader.nextDouble();
        
        if ((lado1*lado1)+(lado2*lado2) == (hipotenusa*hipotenusa))
            System.out.println("Triângulo retângulo!");
        
        else
            System.out.println("Não é um triângulo retângulo");
        
       
           
    }
}