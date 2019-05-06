package Ex06;
import java.util.ArrayList;
import java.util.List;
public class FuncoesApp {
    public List<Pessoa> listaPessoa;
    private java.util.Scanner scanner;
   
    public FuncoesApp(){
        listaPessoa = new ArrayList<>();
        
        scanner = new java.util.Scanner(System.in);
    }
    
    public void cadastrarPessoa(){
        System.out.println("Nome: ");
        String nome = scanner.next();
                
        System.out.println("Telefone: ");
        String tel = scanner.next();
                
        System.out.println("Email: ");
        String email = scanner.next();
                
        System.out.println("Quantidade de dinheiro gasto nos últimos 12 meses: ");
        double quantidadeGasta = scanner.nextDouble();
                
        Pessoa nova = new Pessoa(nome, tel, email, quantidadeGasta);
        listaPessoa.add(nova);
                
        System.out.println("Adicionado!");
                 
    }
    
    public void imprimirPessoa(){
        for(int i = 0; i < listaPessoa.size(); i++){
            if(listaPessoa.get(i) != null){
                System.out.println("*************************");
                System.out.println("Nome: "+listaPessoa.get(i).getNome()+
                    "\nTelefone: "+listaPessoa.get(i).getTelefone()+
                    "\nEmail: "+listaPessoa.get(i).getEmail()+
                    "\nQuantia gasta a cada mês: "+listaPessoa.get(i).getQuantGasta()+
                    "\nQuantia gasta nos 12 meses: "+listaPessoa.get(i).getQuantGasta()*12);
                System.out.println("*************************");
            }
        }
    }
    
    public void excluirPessoa(){
        System.out.println("Digite o índice a ser excluido: ");
        int i = scanner.nextInt();
        listaPessoa.remove(i);
    }
    
}
