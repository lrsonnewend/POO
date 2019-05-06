package br.com.fatec;
/**
 Esta classe serve para fazer cálculos simples.
 Ela foi feita logo após a ressaca de carnaval. 
 */

public class Calculadora {
	private double n1, n2;

	
/**
 * Método construtor, responsável por construir o objeto. 
 * 
 * @param n1 - Este é o valor 1, será passado para o objeto.
 * 
 * @param n2 - Este é o valor 2, será pasasdo para o objeto.
 * 
 * @return Este método não retorna nada, pois é um construtor.
 */
	public Calculadora (double n1, double n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	
	
/**
 * Método soma, responsável por somar dois números
 * 
 * @return Retorna a soma dos dois valores passados para o objeto.
 */
	double soma() {
		return n1+n2;
	}
	
	
/**
 * Método subtração, responsável por subtrair dois números
 * 
 * @return Retorna a subtração dos dois valores passados para o objeto.
 */
	double sub() {
		return n1 - n2;
	}
	
	
/**
 * Método divisão, responsável por dividir dois números
 * 
 * @return Retorna a divisão dos dois valores passados para o objeto.
 */
	double div() {
		return n1/n2;
	}
	
	
/**
 * Método multiplicação, responsável por multiplicar dois números
 * 
 * @return Retorna a multiplicação dos dois valores passados para o objeto.
 */	
	double mult() {
		return n1*n2;
	}
	
	
	
}
