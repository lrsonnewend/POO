package br.com.fatec;
import java.util.*;

import javax.swing.JOptionPane;

/**
 * Classe com m�todos para inserir, gerar listas de contatos e imprimi-los.
 */


public class Agenda {
	
	/**
	 * Gerando lista para contatos.
	 */
	public List <Pessoa> contatos;
	
	
	/**
	 * M�todo construtor
	 */
	public Agenda() {
		contatos = new ArrayList<>();
	}
	
	
	/**
	 * M�todo para inserir pessoas na lista
	 * @param p instancia uma nova pessoa.
	 * @param t instancia um novo telefone para a pessoa cadastrada.
	 * @method add() adiciona uma pessoa � lista.
	 */
	public void inserir() {
		Pessoa p = new Pessoa();
		Telefone t = new Telefone();
		
		p.nome = JOptionPane.showInputDialog("Insira o nome do contato:");
		p.email = JOptionPane.showInputDialog("Coloque o email do contato:");
		
		t.ddd = JOptionPane.showInputDialog("DDD:");
		t.numero = JOptionPane.showInputDialog("N�mero:");
		p.tel = t;
		
		contatos.add(p);
	}
		
	/**
	 * M�todo utilizado para imprimir contatos
	 * 
	 * @return n�o retorna nada, apenas imprime na tela.
	 */
	public void imprimirContatos() {
		
		for(int i = 0; i < contatos.size(); i++) {  
				JOptionPane.showMessageDialog(null, "#### Lista de contatos ####"+"\nNome: "+contatos.get(i).nome+"\nEmail: "+contatos.get(i).email
						+"\nTelefone: "+contatos.get(i).tel.ddd+contatos.get(i).tel.numero+"\n************************");
			}
		}
	}