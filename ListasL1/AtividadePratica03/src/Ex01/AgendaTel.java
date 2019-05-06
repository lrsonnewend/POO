package Ex01;

public class AgendaTel {
    private Pessoa[] pessoas;
    private java.util.Scanner scanner;

    public AgendaTel() {
        pessoas = new Pessoa[5];
        scanner = new java.util.Scanner(System.in);
    }
    
    public void cadastrarPessoa(){
        for(int i = 0; i < pessoas.length; i++){
            if(pessoas[i] == null){
                System.out.println("Nome: ");
                String nome = scanner.next();
                
                System.out.println("Telefone: ");
                String tel = scanner.next();
                
                System.out.println("Email: ");
                String email = scanner.next();
                
                Pessoa nova = new Pessoa(nome, tel, email);
                pessoas[i] = nova;
                
                System.out.println("Adicionado!");
                break;
            }
        }
    }
        
        public void imprimirOpcoes(){
            System.out.println("1-Listar contatos\n2- Incluir contatos\n3- Sair");
        }
        
        public void imprimirPessoa(){
            for(Pessoa pessoa:pessoas){
                if(pessoa != null){
                    System.out.println("Nome: "+pessoa.getNome()+"\nTelefone: "+pessoa.getTelefone()+
                            "\nEmail: "+pessoa.getEmail());
                }
            }
        }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }
        
        
        
}
