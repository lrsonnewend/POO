
package Ex06;

public class Main {
    public static void main(String[] args) {
        FuncoesApp f = new FuncoesApp();
        java.util.Scanner reader = new java.util.Scanner(System.in);        
        
        boolean menu = true;
        String opcao;
        while(menu) {
            System.out.println("1- Adicionar pessoa\n2- Listar Pessoas\n3- Excluir pessoa\n0- Sair"); 
            opcao = reader.next();
			
            if(opcao.equals("0")) {
                menu = false;
            }
		
			
            else if(opcao.equals("1")) {
                f.cadastrarPessoa();
            }
			
            else if(opcao.equals("2")) {
                f.imprimirPessoa();
            }
                
            else if(opcao.equals("3")){                    
                f.excluirPessoa();
            }
        }
    }
}