package Exercicios;
public class Ex05 {
    public static void main(String[] args) {
        
    
	String cc;
	double saldoInicio, novoSaldo, limiteAutorizado, totalItem;
	int totalCredito;
	
        java.util.Scanner reader = new java.util.Scanner(System.in);
	
	System.out.println("Insira o número da conta:");
	cc = reader.next();
	
	System.out.println("Insira o saldo do início do mês:");
	saldoInicio = reader.nextDouble();
	
	System.out.println("Insira o total de itens cobrados no mês:");
	totalItem = reader.nextDouble();

	System.out.println("Insira o total de créditos aplicados ao cliente no mês:");
	totalCredito = reader.nextInt();
	
	System.out.println("Insira o limite de crédito autorizado:");
	limiteAutorizado = reader.nextDouble();
	
	novoSaldo = (saldoInicio + totalItem) - totalCredito;
	
	System.out.println("Novo saldo: "+novoSaldo);
	
	if(novoSaldo > totalCredito)
		System.out.println("Crédito do cliente foi excedido");
    }

}
	