package ex_2_1;

import java.util.ArrayList;

public class Cliente {

	public static void main(String[] args) {

		ArrayList<String> nomes = new ArrayList<>();
		nomes.add("Gabriel Laranjeira");
		nomes.add("Tolentino, Laura");
		nomes.add("Junior, Neymar");
		nomes.add("Lionel Messi");
		NameParserCreator parser;
		
		for (String nome: nomes) {
			if(nome.contains(",")) {
				
				parser = new NomeInversoParser();
			}else {
				parser = new NomeDiretoParser();
			}
			parser.gravarNome(nome);
		}
	}

}
