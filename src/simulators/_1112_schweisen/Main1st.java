package simulators._1112_schweisen;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

/**
 * Conan is an important member of the Desrugenstein Athletic Club, which has a football
 * professional team. Conan is the responsible for the the home matches field's grass. In 2048 years
 * of history, DAC's field has always been in perfect conditions for the matches, thanks to Conan.
 * He already earned many prizes for that. The most important was the "Golden Grass", prize won 1024
 * times by Conan.
 * Tomorrow CAD will play (and host) the Universal Football Championship finals. The match will be
 * at home, so Conan went to check the grass state and repair if necessary. When he arrived there,
 * he despaired when he saw many schweisen in the field, spoiling the grass!!
 * 
 * Now Conan needs your help to calculate how much money he will spend buying deswevileutssen to
 * kill all the schweisen. Each deswevileutssen kills one schweisen. Conan can send you messages of
 * two types: saying he found some schweisen, or asking how much he will spend to kill certain
 * schweisen.
 * 
 * Input
 * - Input contains several test cases. First line of a test case contains 3 integers X (<= 1000),
 *   Y (<= 1000) and P (<= 10) representing, respectively, field's size (X, Y) and the price for each
 *   deswevileutssen. Next line contains an integer Q (<= 10000). Next Q lines represent messages
 *   from Conan to you, and they are in one of the following two forms:
 * - A N X Y - "I found N (<= 10) schweisen at (X,Y) - (0 <= X < Width), (0 <= Y < Height)"
 * - P X Y Z W – "How much money do I need to kill every schweisen inside the rectangular area from
 *   (X, Y) to (Z, W)?"
 *   Consider that in the beginning no schweisen was seen.
 * - Input ends when X, Y and P = 0.
 * 
 * Output
 * - For each message of type "P", print the answer for the question. Leave a blank line after each
 *   test case.
 *   
 * @author Eric
 *
 */
public class Main1st {

	// DICA: Verificar a estrutura de dados Binary Indexed Tree
	public static void main(String[] args) throws IOException {
		int x=0, y=0, z=0, w=0, p=0, row=1, q=0, n=0, valor=0;
		String question="";
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String s = "";
		while ((s=in.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()) {
				if (row == 1) {
					x = Integer.parseInt(st.nextToken());
					y = Integer.parseInt(st.nextToken());
					p = Integer.parseInt(st.nextToken());
					if (x==0 & y==0 & p==0) {
						break;
					} 
					row++;
				} else if (row == 2) {
					q = Integer.parseInt(st.nextToken());
					q = q + ++row;
				} else if (row != q) {
					row++;
					question = st.nextToken();
					if (question.equals("A")) {
						n += Integer.parseInt(st.nextToken());
						x = Integer.parseInt(st.nextToken());
						y = Integer.parseInt(st.nextToken());
						break;
					} else {
						valor = p*n;
						x = Integer.parseInt(st.nextToken());
						y = Integer.parseInt(st.nextToken());
						z = Integer.parseInt(st.nextToken());
						w = Integer.parseInt(st.nextToken());						
						System.out.println(valor);
						break;
					}
				} else {
					row = 1;
				}
			}					
		}
		in.close();
	}
}
