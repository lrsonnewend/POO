package br.com.fatec;

public class Executor {
	public static void main(String[] args) {
	
		Calculadora calc = new Calculadora(35, 12);
		
		
		System.out.println(calc.soma());
		System.out.println(calc.sub());
		System.out.println(calc.div());
		System.out.println(calc.mult());
		
		
		System.exit(0);
	}
}
