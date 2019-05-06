package modelo;

public class Professor extends Pessoa {
    private String numeroRegistro, quantHA;

    public String getNumeroRegistro() {
        return numeroRegistro;
    }

    public void setNumeroRegistro(String numeroRegistro) {
        this.numeroRegistro = numeroRegistro;
    }

    public String getQuantHA() {
        return quantHA;
    }

    public void setQuantHA(String quantHA) {
        this.quantHA = quantHA;
    }
    
    
    @Override
    public String dadosFormatados(){
        String dadosFormatados = super.dadosFormatados();
        dadosFormatados = dadosFormatados+"\nRegistro: "+this.getNumeroRegistro();
        dadosFormatados = dadosFormatados+"\nHora/Aula"+this.getQuantHA();
        
        return dadosFormatados;
    }
}
