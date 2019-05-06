package br.com.fatec;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "###### AGENDONA DAORA ######");
		Agenda ag = new Agenda();
		
		boolean menu = true;
		String opcao;
		while(menu) {
			opcao = JOptionPane.showInputDialog("1- Adicionar pessoa\n2- Listar contatos\n0- Sair");
			
			if(opcao.equals("0")) {
				menu = false;
			}
			
			else if(opcao.equals("1")) {
				ag.inserir();
			}
			
			else if(opcao.equals("2")) {
				ag.imprimirContatos();
			}
		}
	}
}