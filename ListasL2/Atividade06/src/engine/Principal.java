package engine;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int op, c = 0;
		
		Metodos m1 = new Metodos();
		
		do {
		op = Integer.parseInt(JOptionPane.showInputDialog("CONTROLADOR DE ESTOQUE\n"
				+ "1 - Cadastrar produto\n2 - Visualizar produtos\n3 - Remover"
                        + " produto\n4 - Editar produto\n5 - Sair"));
		
		switch(op) {
		case 1:
                    c+=1;
                    m1.addProduto();
                    break;
		
		case 2:
                    m1.imprimirProd();
                    System.out.println("Quantidade de produtos cadastrados: "+c);
		    break;
			
		case 3:
                    m1.removeProd();
                    c-=1;
                    break;
	
                case 4:
                    m1.editProd();
                    break;
                
                case 5:
                    System.exit(0);
                    break;
            }
		
	}while(op != 5);
    }

}