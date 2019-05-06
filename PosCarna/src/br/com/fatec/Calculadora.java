package br.com.fatec;
/**
 Esta classe serve para fazer c�lculos simples.
 Ela foi feita logo ap�s a ressaca de carnaval. 
 */

public class Calculadora {
	private double n1, n2;

	
/**
 * M�todo construtor, respons�vel por construir o objeto. 
 * 
 * @param n1 - Este � o valor 1, ser� passado para o objeto.
 * 
 * @param n2 - Este � o valor 2, ser� pasasdo para o objeto.
 * 
 * @return Este m�todo n�o retorna nada, pois � um construtor.
 */
	public Calculadora (double n1, double n2) {
		super();
		this.n1 = n1;
		this.n2 = n2;
	}
	
	
	
/**
 * M�todo soma, respons�vel por somar dois n�meros
 * 
 * @return Retorna a soma dos dois valores passados para o objeto.
 */
	double soma() {
		return n1+n2;
	}
	
	
/**
 * M�todo subtra��o, respons�vel por subtrair dois n�meros
 * 
 * @return Retorna a subtra��o dos dois valores passados para o objeto.
 */
	double sub() {
		return n1 - n2;
	}
	
	
/**
 * M�todo divis�o, respons�vel por dividir dois n�meros
 * 
 * @return Retorna a divis�o dos dois valores passados para o objeto.
 */
	double div() {
		return n1/n2;
	}
	
	
/**
 * M�todo multiplica��o, respons�vel por multiplicar dois n�meros
 * 
 * @return Retorna a multiplica��o dos dois valores passados para o objeto.
 */	
	double mult() {
		return n1*n2;
	}
	
	
	
}
