package Ex01;

public class Aplicacao {
    private static java.util.Scanner scanner;
    public static void main(String[] args) {
        scanner = new java.util.Scanner(System.in);
        
        AgendaTel agenda = new AgendaTel();
        
        int sair = 0;
        int opcao = 0;
        
        while(sair == 0){
            switch(opcao){
                case 0:
                    agenda.imprimirOpcoes();
                    opcao = scanner.nextInt();
                    break;
                
                case 1:
                    agenda.imprimirPessoa();
                    opcao = 0;
                    break;
                  
                case 2:
                    agenda.cadastrarPessoa();
                    opcao = 0;
                    break;
                    
                case 3:
                    sair = 1;
                    System.out.println("saindo...");
                    break;
                    
                default:
                    agenda.imprimirOpcoes();
                    opcao = scanner.nextInt();
                    break;
               
            } 
        }
    }
}

