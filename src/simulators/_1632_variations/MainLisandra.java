package simulators._1632_variations;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class MainLisandra {	 

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String linha = in.readLine();
		int nEventos = Integer.valueOf(linha);
		char palavra[];
		int total = 1;

		while (nEventos > 0) {
			linha = in.readLine();

			// le palavra
			palavra = linha.toCharArray();

			// verifica se eh variacao
			for (int i = 0; i < palavra.length; i++) {

				if ("aeiosAEIOS".contains(Character.toString(palavra[i]))) {
					total = total * 3;
				} else {
					total = total * 2;
				}
				//	                              System.out.println(total);
			}
			System.out.println(total);
			total = 1;
			nEventos--;
		}
	}
}
