package modelo;

/**
 *
 * @author lucas
 */
public class Aluno extends Pessoa{
    private String ra;

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }
    
    
    
    @Override
    public String dadosFormatados(){
        String dadosFormatados = super.dadosFormatados();
        dadosFormatados = dadosFormatados+"\nMatricula: "+this.getRa();
    
        return dadosFormatados;
    }
}

