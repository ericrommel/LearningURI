package simulators._1236_compressing_null_and_white;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Francisco is a teacher and need your help to compress some text files. As the files contain
 * basically white spaces and zeros (0), this program must be something very simple. The text
 * contains only uppercase and lowercase letters, spaces and numbers. You must to consider the $
 * like a symbol for compression of spaces and the symbol # like a symbol to compress zeros.
 * Remember 2 details:
 * - You must print the AscII char corresponding to the frequence, not the decimal number.
 * - If occurs more than 255 null or white chars, the output must be done in two or more parts,
 *   because the maximum size of a byte is 255. For example, to compress 380 successive '0' chars,
 *   the first block will compress the first 255 occurrences and the second one will compress the
 *   125 remaining, and so on. The result in this case would be "# #}". Note that the 255 char is
 *   invisible (seems like a space).
 *   
 * To understand a little more, consider the following ASCII table: for example, CHR(3) means "ETX"
 *  - View Image attached.
 *  
 * Note:
 * - Do not compress when only 2 repeated zeros or blank spaces occurs("*00*" ou "*  *"), because
 *   this compression will not result in any space optimization.
 * - Our toolkit may not print some special chars needed in the output of this problem.
 * 
 * Input
 * - The input contains many test cases. Each test case contains a number N that indicates the
 *   number of test cases. Each test case contains up to 2000 chars.
 * 
 * Output
 * - Each input line must produce a output line, that is the compressed input, like example above
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
		int space=0, zero=0;
		
		int qtdTC = Integer.parseInt(in.readLine());
		String s = "", charSet="";

		for (int i=0; i<qtdTC; i++) {
			s = in.readLine();
			for (int j=0; j<s.length(); j++) {
				if ( Character.toString(s.charAt(i)).equals("0") || Character.toString(s.charAt(i)).equals(" ")) {
					if (Character.toString(s.charAt(i)).equals(" ")) {
						space++;
					} else {
						zero++;
					}
					if (space<=3) {
						
					}
				}
			}
		}
		
		in.close();
		out.flush();
	}

}
