package br.com.fatec;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		double impares[] = {1, 3, 5, 7, 9, 11, 13};
		double pares[] = {2, 4, 6, 8, 10, 12, 14};
		Printer p1 = new Printer(impares);
		Printer p2 = new Printer(pares);
		
		p1.setPriority(2);
		p1.start();
		
		p1.sleep(3000);
	
		p2.start();
		
		
		
		
	}
}
