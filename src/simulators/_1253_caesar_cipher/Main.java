package simulators._1253_caesar_cipher;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Julius Caesar used a system of cryptography, now known as Caesar Cipher, which shifted each
 * letter 2 places further through the alphabet (e.g. 'A' shifts to 'C', 'R' shifts to 'T', etc.).
 * At the end of the alphabet we wrap around, that is 'Y' shifts to 'A'. We can, of course, try
 * shifting by any number.
 * 
 * Input
 * - The input contains several test cases. The first line of input contains an integer N that
 *   indicates the number of test cases. Each test case is composed by two lines. The first line
 *   contais a string that is a codified sentence. This string will contain between 1 and 50
 *   characters, inclusive. Each character is an uppercase letter ('A'-'Z'), that is the codified
 *   sentence to this modified Caesar Cipher. The second line contains the number of right shift,
 *   this value is between 0 and 25, inclusive.
 *   
 * Output
 * - Given an encoded text and a number of shifted letters, decode it to the original sentence,
 *   acording to the explanation above and the following example.
 *   
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1253.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String caesar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		int indice=0, passe=0;

		int qtdRow = Integer.parseInt(in.readLine());
		String s = "";

		for (int i = 0; i<qtdRow; i++) {
			String changeStr="";
			//s = caesarCipher(in.readLine(), Integer.parseInt(in.readLine()));
			s = in.readLine();
			passe = Integer.parseInt(in.readLine());
			for (int j=0; j<s.length(); j++) {
				//indice = ((caesar.indexOf(s.charAt(j)) - passe)+26)%(caesar.length());
				out.write(caesar.charAt(((caesar.indexOf(s.charAt(j)) - passe)+26)%(caesar.length())));
				//changeStr += caesar.charAt(indice);
			}
			out.write("\n");			
		}		
		in.close();
		out.flush();
	}

	// 65 - 90 (alfabeto maiusculo ASCII)
//	static String caesarCipher(String str, int passe) {
//		String caesar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
//		String changeStr="";
//		int indice=0;
//		for (int i=0; i<str.length(); i++) {
//			indice = ((caesar.indexOf(str.charAt(i)) - passe)+26)%(caesar.length());
//			changeStr += caesar.charAt(indice);
//		}
//		return changeStr;
//	}
}