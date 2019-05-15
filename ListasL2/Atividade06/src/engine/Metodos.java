package engine;

import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.io.*;
import java.lang.*;
import modelo.Produto;



public class Metodos {
        private int c = 0;
	private List <Produto> produtos = new ArrayList<Produto>();
        
	public List<Produto> getProdutos(){
		return produtos;
	}
	
	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
		
	}
	
	public void addProduto() {
		Produto p = new Produto();
		p.setNomeProd(JOptionPane.showInputDialog("Digite o produto a ser cadastrado:"));
		p.setQuant(Integer.parseInt(JOptionPane.showInputDialog("Insira a quantia deste produto:")));
		
		produtos.add(p);
              
                c+=1;
	}
	
	public void imprimirProd() {
            System.out.println("LISTA DE PRODUTOS");
            
            for(Produto produto:produtos) {        
                System.out.println("Produto\t"+"\tQuantidade");
                System.out.print(produto.getNomeProd()+"\t"+"\t"+produto.getQuant());
                System.out.print("\n");
            }
            System.out.println("Quantidade de produtos cadastrados: "+c);

        }
        
        public void removeProd(){
            String nome = JOptionPane.showInputDialog("Insira o nome do "
                    + "produto que deseja remover:");
            
            for (int i = 0; i < produtos.size(); i++){
                if(produtos.get(i).getNomeProd().equals(nome)){
                    produtos.remove(i);
                    JOptionPane.showMessageDialog(null, "Produto excluído com sucesso!"); 
                    break;
                }                
            } 
            c-=1;
        }    
        
        public void editProd(){
            String nome = JOptionPane.showInputDialog("Insira o nome do "
                    + "produto que deseja editar:");
            
            String editNome = JOptionPane.showInputDialog("Insira o novo nome "
                    + "do produto:");
            
            int editQuant = Integer.parseInt(JOptionPane.showInputDialog("Insira a quantidade "
                    + "do produto:"));
            
            for(int i = 0; i < produtos.size(); i++){
                if(produtos.get(i).getNomeProd().equals(nome)){
                    produtos.get(i).setNomeProd(editNome);
                    produtos.get(i).setQuant(editQuant);
                }
                    
            }
        }
        
        public void salvaInfo() throws IOException{
            BufferedWriter escreve = new BufferedWriter(new FileWriter("/home/lucas/Documentos/info.txt"));
            for (Produto produto:produtos){
                String prod = produto.getNomeProd();
                String quant = String.valueOf(produto.getQuant());
                escreve.write("Produto: "+prod);
                escreve.newLine();
                escreve.write("Quantidade: "+quant);
                escreve.newLine();
                escreve.newLine();
                           
            }
            
            escreve.write("Quantidade de produtos cadastrados: "+c);
            JOptionPane.showMessageDialog(null,"Dados salvos!");
            escreve.flush();
            escreve.close();
        }
    }
