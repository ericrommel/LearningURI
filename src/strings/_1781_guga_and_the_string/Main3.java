package strings._1781_guga_and_the_string;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

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
public class Main3 {
	
//	static List<Integer> idx = new ArrayList<Integer>();
//	static List<Character> ids = new ArrayList<Character>();
	static Map<Integer, Character> maps = new HashMap<Integer, Character>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int T = Integer.parseInt(in.readLine());
        
		for (int i=0; i<T; i++) {
			String s = in.readLine();
			int Q = Integer.parseInt(in.readLine());
			out.printf("Caso #%d:\n",i+1);
			for (int j=0; j<Q; j++) {
				String[] op = in.readLine().split(" ");
				if (op.length==1) {
					out.println(s);
				} else {
					s = changeString(s, Integer.parseInt(op[0]), Integer.parseInt(op[1]));	
				}				
			}
		}
		in.close();
		out.flush();
	}

	static String changeString(String str, int op, int pos) {
		int indice = 0;
		StringBuilder sb = new StringBuilder(str);
		String seq = "aeiou";
//		idx.clear();
//		ids.clear();
		maps.clear();

		// Se for pra usar consoante, muda o valor de seq 
		if (op==1) {
			seq = "bcdfghjklmnpqrstvwxyz";	
		}

		// Salva os indices e seus respectivos valores.
		for (int i=0; i<sb.length(); i++) {
			if (seq.contains(Character.toString(sb.charAt(i)))) {
//				idx.add(i);
//				ids.add(sb.charAt(i));
				maps.put(i, sb.charAt(i));
			}
		}							


		// Muda o valor do indice salvo na string com o valor salvo na lista
		for (int i=0; i<maps.size(); i++) {
			Set<Integer> keys = maps.keySet();
			Object[] idkeys = keys.toArray();
			indice = (i + pos)%(maps.size()); // para circular entre os indices da lista IDX
			sb.setCharAt((int)idkeys[i], maps.get((int)idkeys[indice]));
		}
//		int idx=0;
//		for (Integer key : maps.keySet()) {
//			//Capturamos o valor a partir da chave
//			indice = (idx + pos)%(maps.size()); // para circular entre os indices da lista IDX
//			sb.setCharAt(key. , maps.get(indice));
//			idx++;
//		}

		
		return sb.toString();
	}
}
