package engine;

import java.io.FileWriter;
import javax.swing.JOptionPane;
import java.io.IOException;
import modelo.Produto;

public class Principal {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		int op;
		
		Metodos m1 = new Metodos();
		Produto p1 = new Produto();
		do {
		op = Integer.parseInt(JOptionPane.showInputDialog("CONTROLADOR DE ESTOQUE\n"
				+ "1 - Cadastrar produto\n2 - Visualizar produtos\n3 - Remover"
                        + " produto\n4 - Editar produto\n5 - Salvar dados em disco\n6 - Sair"));
		
		switch(op) {
		case 1:
                    m1.addProduto();
                    break;
		
		case 2:
                    m1.imprimirProd();
		    break;
			
		case 3:
                    m1.removeProd();
                    break;
	
                case 4:
                    m1.editProd();
                    break;
                
                case 5:
                    m1.salvaInfo();                                                  
                    break;
                
                case 6:
                    System.exit(0);
                    break;
            }
		
	}while(op != 6);
    }

}