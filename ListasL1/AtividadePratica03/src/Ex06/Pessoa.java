package Ex06;

public class Pessoa {
    private String nome, email, endereco, telefone;
    private double quantGasta;  
    
    public Pessoa(String nome, String telefone, String email, double quantGasta) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.quantGasta = quantGasta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public double getQuantGasta(){
        return quantGasta;
    }
    
    public void setQuantGasta(double quantGasta){
        this.quantGasta = quantGasta;
    }
}
   
