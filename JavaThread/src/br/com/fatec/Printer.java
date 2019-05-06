package br.com.fatec;

public class Printer extends Thread{
	public double valores[];
	
	public Printer(double[] valores) {
		this.valores = valores;
	}
	
	public void makeList() {
		for (int i = 0; i < valores.length; i++) {
			System.out.println(valores[i]);
		}
		
	}


	@Override
	public void run() {
		makeList();
	}

}
