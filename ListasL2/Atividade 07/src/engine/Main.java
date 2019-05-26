package engine;
import java.io.IOException;
import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) throws IOException {
        Functions f = new Functions();
        int opcao;
        
        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1-Inserir valores de entrada"
                    + "\n2-Inserir valores de saída\n3-Imprimir dados\n5-Sair do programa"));

            switch(opcao){
                case 1:
                   int op = Integer.parseInt(JOptionPane.showInputDialog("1-Vendas\n2-Recibos"));
                   if (op == 1)
                       f.addVenda();
                   else if(op == 2)
                       f.addRecibo();

                   break;
                
                   
                case 2:
                    int selec= Integer.parseInt(JOptionPane.showInputDialog("1-Despesas\n2-Pagamento"));
                    
                    if (selec == 1)
                        f.addDespesa();
                    else if(selec == 2)
                        f.addPagamento();
                         
                    

                case 3:
                    f.imprimiES();
                    break;
                    
                
                case 4:
                    f.saveIn();
                    break;
                    
                                    
                case 5:
                    JOptionPane.showMessageDialog(null,"O programa será encerrado.");
                    System.exit(0);
                    break;
            }
            
        }while(opcao != 5);
    }
}





