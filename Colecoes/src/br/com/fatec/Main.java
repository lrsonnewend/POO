package br.com.fatec;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<String> lista = new ArrayList<String>();
		lista.add("Toninho Start");
		lista.add("Homi Aranha");
		lista.add("Bruci Breno");
		
		Collections.sort(lista);
		
		for (String nome: lista) {
			System.out.println(nome);
		}
	}

}
