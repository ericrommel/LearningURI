package beginners._1044_multiples;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Read two values (A and B). After, the program should print the message "Sao Multiplos" (are
 * multiples) or "Nao sao Multiplos" (aren�t multiples), corresponding to the read values.
 * 
 * Input
 * - The input has two integer numbers.
 * 
 * Output
 * - Print the message relative to the input as stated above.
 * 
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = in.readLine().split(" ");
		if (Integer.parseInt(s[1])%Integer.parseInt(s[0])==0 ||
				Integer.parseInt(s[0])%Integer.parseInt(s[1])==0) {
			out.write("Sao Multiplos\n");
		} else {
			out.write("Nao sao Multiplos\n");
		}
		in.close();
		out.flush();
	}
}
