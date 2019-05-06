package Ex02;

public class Produto {
    
    private String codProd;
    private int quant;
    
    public Produto(String codProd, int quant){
        this.codProd = codProd;
        this.quant = quant;
    }


    public String getCodProd() {
        return codProd;
    }

    public void setCodProd(String codProd) {
        this.codProd = codProd;
    }

    public int getQuant() {
        return quant;
    }

    public void setQuant(int quant) {
        this.quant = quant;
    }
    
    
    public double calculaPreco(String codProd, int quant){
        double total = 0;
        
        if(codProd == "P1")
            total = 1.00 * quant;
        
        
        else if(codProd == "P2")
            total = 2.98 * quant;
        
        
        
        else if(codProd == "P3")
            total = 9.98 * quant;
     
        
        else if(codProd == "P4")
            total = 4.49 * quant;
        
        
        else if (codProd == "P5")
            total = 6.87 * quant;
            
        return total;
    }
}