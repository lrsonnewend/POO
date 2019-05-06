package br.com.fatec;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class Main {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Noé";
		p1.idade = 550;
	
		//para salvar arquivo binário
		/*FileOutputStream caminho = new FileOutputStream("F:\\pessoa.ser");
		
		ObjectOutputStream escreve = new ObjectOutputStream(caminho);
		Object makeLe = escreve.readObjetc();
		escreve.writeObject(p1);
		escreve.close();*
		
		//para ler arquivo binário
		/*FileInputStream leArq = new FileInputStream("C:\\Users\\Aluno\\Desktop\\people.txt");
		ObjectInputStream leObj = new ObjectInputStream(leArq);
		Object meuObj = leObj.readObject();
		
		Pessoa eu = (Pessoa)meuObj;
		System.out.println(eu.nome);
		leObj.close();*/
		
		//escrevendo arquivo txt
		/*FileWriter escritor = new FileWriter("C:\\Users\\Aluno\\Desktop\\zezinho.txt");
		escritor.write("escrevendo texto com o java");
		escritor.close();*/
		
		//lendo arquivo txt
		/*File arq = new File("C:\\Users\\Aluno\\Desktop\\zezinho.txt");
		FileReader leitor = new FileReader(arq);
		BufferedReader bufferLeitor = new BufferedReader(leitor);
		
		String linha = bufferLeitor.readLine();
		
		String elementos[];
		
		while(linha != null) {
			elementos = linha.split(" ");
			for(String elemento:elementos) {
				System.out.print(elemento+" ");
			}
			linha = bufferLeitor.readLine();
		}
		leitor.close();
	}*/
	}
}

