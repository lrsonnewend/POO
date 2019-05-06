package Ex02;


public class Principal {
    public static void main(String[] args) {        
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        int quant;
        String codProduto;
        
        System.out.println("Digite o código e a quantidade do produto: ");
        codProduto = scanner.next();
        quant = scanner.nextInt();
        
        Produto p = new Produto(codProduto, quant);
       
        System.out.println("Total: "+p.calculaPreco(codProduto, quant));
                
        
    }
    
}
