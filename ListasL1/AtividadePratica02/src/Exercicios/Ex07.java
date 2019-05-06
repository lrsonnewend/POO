package Exercicios;

public class Ex07 {
    public static void main(String[] args) {
        double valorHora;     
        int horaTrampo;
        double total, aux;
        
        java.util.Scanner reader = new java.util.Scanner(System.in);
        
        System.out.println("Digite o valor cobrado por hora: ");
        valorHora = reader.nextDouble();
        
        System.out.println("Digite o total de horas trabalhadas: ");
        horaTrampo = reader.nextInt();
        
        aux = (horaTrampo - 40) * (0.5*valorHora);
        total = (horaTrampo * valorHora) + aux;
        
        System.out.println("salário bruto: R$"+total);
        
    }
    
}
