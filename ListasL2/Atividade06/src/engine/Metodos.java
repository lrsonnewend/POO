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
		for(Produto produto:produtos) {
			System.out.println("Produto: "+produto.getNomeProd()+
					"\nQuantidade: "+produto.getQuant());
		}
	}
}
