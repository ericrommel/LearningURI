package beginners.page01._1044_multiples;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Read two values (A and B). After, the program should print the message "Sao Multiplos" (are
 * multiples) or "Nao sao Multiplos" (aren’t multiples), corresponding to the read values.
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
		String[] s = in.readLine().split(" ");
		if (Integer.parseInt(s[1])%Integer.parseInt(s[0])==0 ||
				Integer.parseInt(s[0])%Integer.parseInt(s[1])==0) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}
}
