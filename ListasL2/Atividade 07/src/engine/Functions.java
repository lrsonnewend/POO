package engine;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.*;
import java.lang.*;

public class Functions {
    private double saldo = 0.0;
    private List<Entrada> entradas = new ArrayList<Entrada>();
    private List<Saida> saidas = new ArrayList<Saida>();  
    
    public List<Saida> getSaidas() {
        return saidas;
    }

    public void setSaidas(List<Saida> saidas) {
        this.saidas = saidas;
    }
    
    public List<Entrada> getEntrada() {
        return entradas;
    }

    public void setEntrada(List<Entrada> entrada) {
        this.entradas = entradas;
    }
    
    
    
    public void addVenda(){
       Entrada ev = new Entrada();

        ev.setDataVenda(JOptionPane.showInputDialog("Data de venda:"));
        ev.setNomeProduto(JOptionPane.showInputDialog("Produto vendido:"));
        ev.setValorVenda(Double.parseDouble(JOptionPane.showInputDialog("Valor:")));
        saldo+= ev.getValorVenda();
        entradas.add(ev);
    }
    
    public void addRecibo(){
        Entrada er = new Entrada();
        er.setValorRecibo(Double.parseDouble(JOptionPane.showInputDialog("Valor do recibo:")));
        er.setDataRecibo(JOptionPane.showInputDialog("Data do recibo:"));
        saldo+=er.getValorRecibo();
        entradas.add(er);
        
    }
    
    public void addPagamento(){
        Saida sp = new Saida();
        sp.setDataPagamento(JOptionPane.showInputDialog("Data do pagamento:"));
        sp.setPagemento(Double.parseDouble(JOptionPane.showInputDialog("Valor:")));
        saidas.add(sp);
        saldo-=sp.getPagemento();
    }
    
    public void addDespesa(){
        Saida sd = new Saida();    
        sd.setDataDespesa(JOptionPane.showInputDialog("Data da despesa:"));
        sd.setDespesa(Double.parseDouble(JOptionPane.showInputDialog("Insira o valor da despesa:")));
        
        saidas.add(sd);
        saldo-=sd.getDespesa();
    }
    
    public void imprimiES(){
        System.out.println("VENDAS/RECIBOS");

        for(Entrada entrada: entradas){
            
            System.out.println("VENDAS:\nData: "+entrada.getDataVenda()+"\tProduto: "+entrada.getNomeProduto()+
                    "\tValor: R$"+entrada.getValorVenda()+"\n");
        }
        
        for(Entrada entrada: entradas){
            
            System.out.println("RECIBOS:\nData: "+entrada.getDataRecibo()+
                    "\tValor R$"+entrada.getValorRecibo()+"\n\n\n");
            
        }
        
        for (Saida saida: saidas){
            System.out.println("PAGAMENTOS:\n"+"Data: "+saida.getDataPagamento()+
                    "\tValor: R$"+saida.getPagemento()+"\n");
        }
        
        for (Saida saida: saidas){
            System.out.println("DESPESAS\n"+"Data: "+saida.getDataDespesa()+
                    "\tValor: R$"+saida.getDespesa());
        }
        System.out.println("Saldo: R$"+saldo);
        System.out.println("\n");
    }
    
    public void saveIn()throws IOException{
            BufferedWriter escreve = new BufferedWriter(new FileWriter("/home/lucas/Documentos/info.txt"));
            for (Entrada entrada:entradas){
                String prodV = entrada.getNomeProduto();
                String dataV = entrada.getDataVenda();
                String valorV = String.valueOf(entrada.getValorVenda());
                String dataR = entrada.getDataRecibo();
                String valorR = String.valueOf(entrada.getValorRecibo());
                escreve.write("Produto: "+prodV);
                escreve.newLine();
                escreve.write("Data de venda: "+dataV);
                escreve.newLine();
                escreve.write("Data do recibo: "+dataR);
                escreve.newLine();
                escreve.write("Valor do recibo: "+valorR);
                escreve.newLine();
                escreve.write("Saldo da empresa: R$"+saldo);
            }
            
            for (Saida saida: saidas){
                String vDesp = String.valueOf(saida.getDespesa());
                String vPg = String.valueOf(saida.getPagemento());
                String dataDesp = saida.getDataDespesa();
                String dataPg = saida.getDataPagamento();
                escreve.write("Valor das despesas: R$"+vDesp);
                escreve.newLine();
                escreve.write("Data de saída (despesa): "+dataDesp);
                escreve.newLine();
                escreve.write("Valor de pagamentos: R$"+vPg);
                escreve.newLine();
                escreve.write("Data do pagamento: "+dataPg);
                
            }
    }
}
