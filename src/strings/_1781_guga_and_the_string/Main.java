package strings._1781_guga_and_the_string;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Guga tem uma string S contendo apenas letras min�sculas e quer fazer opera��es nela. Cada
 * opera��o pode ser de um dos seguintes tipos:
 *    0 x, deslocar cada vogal de S x posi��es da esquerda pra direita (voltando para o come�o,
 *      caso necess�rio)
 *    1 x, deslocar cada consoante de S x posi��es da esquerda pra direita (voltando para o come�o,
 *      caso necess�rio)
 *    2, imprimir como S se encontra atualmente
 *    
 * As vogais que estamos considerando s�o as letras a, e, i, o e u.
 * Uma opera��o do tipo 0 s� desloca vogais por posi��es de S que possuem vogais.
 * Uma opera��o do tipo 1 s� desloca consoantes por posi��es de S que possuem consoantes.
 * Por exemplo:
 *  - A string "computador" ap�s a opera��o 1 2 fica "dorcumapot", ou seja, cada consoante vai para
 *    a posi��o em S da segunda pr�xima consoante.
 *  - A string "abe" ap�s a opera��o 0 1, fica "eba".
 *  
 * Entrada
 * - A primeira linha da entrada cont�m T (1 <= T <= 100), o n�mero de casos de teste. A primeira
 *   linha de cada caso de teste possui S (1 <= |S| <= 10^4), a string que Guga possui. A segunda
 *   linha de cada caso possui Q (1 <= Q <= 10^5), o n�mero de opera��es que Guga ir� executar em S.
 *   Cada uma das pr�ximas Q linhas possuem uma opera��o como explicado acima. Para cada opera��o,
 *   0 <= x <= |S|.
 *   
 * Sa�da
 * - Para cada caso imprima "Caso #X:", onde X � o n�mero do caso atual, come�ando em 1. Para cada
 *   opera��o 2, imprima em uma nova linha como a string S se encontra depois de todas as opera��es
 *   anteriores terem sido executadas. A sa�da possui aproximadamente 3*10^6 caracteres.
 *   
 * @author e.dantas
 *
 */
public class Main {
		
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		//PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int Q=0, sumDeslVogal=0, sumDeslCons=0;
		int T = Integer.parseInt(in.readLine()); // Numero de testes
		String[] op = null;
		String s = "";
		
		for (int i=0; i<T; i++) {
			s = in.readLine(); // String para manipulacao (Guga's string)
			Q = Integer.parseInt(in.readLine()); // Numero de operacoes sob a String
			out.write("Caso #" + (i+1) + ":\n");
			for (int j=0; j<Q; j++) {
				op = in.readLine().split(" "); // Operacoes a serem executadas
				switch (Integer.parseInt(op[0])) {
				case 2: 
					if (sumDeslVogal!=0) {
						//seq = ;
						s = changeString(new StringBuilder(s), "aeiou", sumDeslVogal);						
					}
					if (sumDeslCons!=0) {
						//seq = ;
						s = changeString(new StringBuilder(s), "bcdfghjklmnpqrstvwxyz", sumDeslCons);
					}
					out.write(s + "\n");
					sumDeslCons=0;
					sumDeslVogal=0;
					break;
				case 0: 
					sumDeslVogal+=Integer.parseInt(op[1]);
					break;
				case 1: 
					sumDeslCons+=Integer.parseInt(op[1]);
					break;
				}
			}
		}
		in.close();
		out.flush();
	}

	static String changeString(StringBuilder str, String seq, int pos) {
		List<Integer> idx = new ArrayList<Integer>();
		List<Character> ids = new ArrayList<Character>();

		int indice = 0;
		
		idx.clear();
		ids.clear();

		// Salva os indices e seus respectivos valores.
		for (int i=0; i<str.length(); i++) {
			if (seq.contains(Character.toString(str.charAt(i)))) {
				idx.add(i);
				ids.add(str.charAt(i));
			}
		}							

		// Muda o valor do indice salvo na string com o valor salvo na lista
		for (int i=0; i<idx.size(); i++) {
			indice = (i + pos)%(idx.size()); // para circular entre os indices da lista IDX
			str.setCharAt(idx.get(indice), ids.get(i));
		}
		
		return str.toString();
	}
}
