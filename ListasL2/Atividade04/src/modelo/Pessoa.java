package modelo;

public abstract class Pessoa implements Contato{
    private String nome, telefone, email;

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
    
    @Override
    public String dadosFormatados(){
        String dadosFormatados;
        dadosFormatados = "\nNome: "+this.getNome();
        dadosFormatados = dadosFormatados+"\nTelefone: "+this.getTelefone();
        dadosFormatados = dadosFormatados+"\nEmail: "+this.getEmail();
        
        return dadosFormatados;
    }
    
    
    
    
}
