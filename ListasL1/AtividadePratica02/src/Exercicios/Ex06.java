package Exercicios;

public class Ex06 {
    public static void main(String[] args) {
        int numItem;
        double comissao = 200.00;
        
        java.util.Scanner reader = new java.util.Scanner(System.in);
        
        System.out.println("Insira o total de itens vendidos na semana");
        numItem = reader.nextInt();
        
        double rendimento = comissao + (0.9 * numItem);
        
        System.out.println("Seu rendimento com as vendas: R$"+rendimento);
        

    }
}
