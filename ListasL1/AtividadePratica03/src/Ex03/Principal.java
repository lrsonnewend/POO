package Ex03;

public class Principal {

    public static void calculaPreco(double hora, double horaMais){
         double resultado;
         
         resultado = (hora*2) + ((horaMais* 0.5));
         
         System.out.println("total: R$ "+resultado);    
    }
    public static void main(String[] args) {
        java.util.Scanner reader = new java.util.Scanner(System.in);
        double hora;
        double horaM;
        
        System.out.println("digite as horas que ficou estacionado: ");
        hora = reader.nextDouble();
        
        System.out.println("tempo adicional: ");
        horaM = reader.nextDouble();
                
        calculaPreco(hora, horaM);
                
    
        
    }
        
}
