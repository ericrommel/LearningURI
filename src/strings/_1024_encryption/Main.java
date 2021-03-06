package strings._1024_encryption;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * You have been asked to build a simple encryption program. This program should be able to send
 * coded messages without someone been able to read them. The process is very simple. It is divides
 * into two parts.
 *
 * First, each uppercase or lowercase letter must be shifted three positions to the right, according
 * to the ASCII table: letter 'a' should become letter 'd', letter 'y' must become the character '|'
 * and so on. Second, each line must be reversed. After being reversed, all characters from the half
 * on (truncated) must be moved one position to the left in ASCII. In this case, 'b' becomes 'a' and
 * 'a' becomes '`'.
 *
 * For example, if the resulting word of the first part is "tesla", the letters "sla" should be
 * moved one position to the left. However if the resulting word of the first part is "t#$A", the
 * letters "A$" are to be displaced.
 *
 * Input
 * - The input contains a number of test cases. The first line of each test case contains an
 *   integer N (1 <= N <= 1 * 10^4), indicating the number of lines the problem should encrypt. The
 *   following N lines contains M characters each M (1 <= M <= 1 * 10�).
 *
 * Output
 * - For each test case, you must present the encrypted message.
 *
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1024.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));

		int qtdRow = 0;
		String s = "";


		qtdRow = Integer.parseInt(in.readLine());

		for (int i = 0; i<qtdRow; i++) {
			//s = in.readLine();
			//s = changeAscii(s, false);
			//s = reverseStr(s);
			s = new StringBuilder(changeAscii(in.readLine(), 3)).reverse().toString();
			s = s.substring(0, s.length()/2) + changeAscii(s.substring(s.length()/2), 1);
			out.write(s + "\n");
		}
		in.close();
		out.flush();
	}

	static String changeAscii(String str, int passe) {
		String changeStr="";
		int codAscii=0;
		for (int i=0; i<str.length(); i++) {
			codAscii = (int) str.charAt(i);
			if (passe == 1) {
				changeStr += (char) (codAscii-passe);
			} else {
				if (Character.isLetter(str.charAt(i))) {
					changeStr += (char) (codAscii+passe);
				} else {
					changeStr += str.charAt(i);
				}
			}
		}
		return changeStr;
	}

	//	static String changeAscii(String str, boolean half) {
	//		String changeStr="";
	//		int codAscii=0;
	//		int passe = 3;
	//		if (half) {
	//			passe = 1;
	//			for (int i=0; i<str.length(); i++) {
	//					codAscii = (int) str.charAt(i);
	//					changeStr += (char) (codAscii-passe);
	//			}
	//		} else {
	//			for (int i=0; i<str.length(); i++) {
	//				if (Character.isLetter(str.charAt(i))) {
	//					codAscii = (int) str.charAt(i);
	//					changeStr += (char) (codAscii+passe);
	//				} else {
	//					changeStr += str.charAt(i);
	//				}
	//			}
	//		}
	//		return changeStr;
	//	}

	static String reverseStr(String str) {
		String reverseStr = "";
		for (int i=str.length(); i>0; i--) {
			reverseStr += str.charAt(i-1);
		}
		return reverseStr;
	}
}
