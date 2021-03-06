package simulators._1212_primary_arithmetic;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Children are taught to add multi-digit numbers from right-to-left one digit at a time. Many find
 * the "carry" operation - in which a 1 is carried from one digit position to be added to the next
 * - to be a significant challenge. Your job is to count the number of carry operations for each of
 * a set of addition problems so that educators may assess their difficulty.
 * 
 * Input
 * - Each line of input contains two unsigned integers less than 10 digits. The last line of input
 *   contains 0 0.
 *   
 * Output
 * - For each line of input except the last you should compute and print the number of carry
 *   operations that would result from adding the two numbers, in the format shown below.
 *  
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int count=0, carry=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder num1 = new StringBuilder();
		StringBuilder num2 = new StringBuilder();
		String[] s = null;
		
		while ((s=in.readLine().split(" ")) != null) {
			// Condicao de parada
			if (s[0].equals("0") && s[1].equals("0")) {
				break;
			} else {
				// Estrategia utilizada: completar com zeros a esquerda o menor numero
				num1.append(s[0]);
				num2.append(s[1]);
				if (s[0].length() > s[1].length()) {
					for (int i=s[0].length()-1; i>0; i--) {
						if (num1.length() == num2.length()) {
							break;
						} else {
							num2.insert(0, "0");
						}
					}
				} else {
					for (int i=s[1].length()-1; i>0; i--) {
						if (num2.length() == num1.length()) {
							break;
						} else {
							num1.insert(0, "0");
						}
					}
				}
				
				// Soma-se cada um dos algarismos com o valor de carry encontrado da soma anterior.
				// Na primeira soma, o carry � ZERO. Nas somas seguintes, depende-se se houve carry
				// ou nao. Se houver, soma-se 1 unidade aquela soma. Para cada operacao de carry
				// ocorrida, incrementa-se um contador.
				for (int i=num1.length(); i>0; i--) {
					if (carry + Character.getNumericValue(num1.charAt(i-1)) + Character.getNumericValue(num2.charAt(i-1)) > 9) {
						carry = 1;
						count++;
					} else {
						carry = 0;
					}
				}
				
				// Apresenta-se a quantidade de carries ocorridos
				if (count == 0) {
					out.write("No carry operation.\n");
				} else {
					if (count == 1) {
						out.write(count + " carry operation.\n");
					} else {
						out.write(count + " carry operations.\n");
					}
				}
				
				// Zera-se as variaveis para pr�xima linha.
				carry = 0;
				count = 0;
				num1.setLength(0);
				num2.setLength(0);
			}
		}
		in.close();
		out.flush();
	}
}
