package engine;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import modelo.Produto;

public class Metodos {
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
	}
	
	public void imprimirProd() {
            System.out.println("LISTA DE PRODUTOS");
            for(Produto produto:produtos) {
                    
                System.out.println("|Produto             |"+"Quantidade           |");
                System.out.print(produto.getNomeProd());
                System.out.println("                 "+produto.getQuant());
                System.out.print("\n");
            }
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
    }
