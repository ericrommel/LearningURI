package beginners.page01._1003_simple_sum;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Read two variables A and B. Next, calculate the sum between them and assign it to the variable SOMA.
 * Write the value of this variable.
 * 
 * Input
 * - The input file will contain 2 integer numbers.
 * 
 * Output
 * - Print SOMA according to the following example, with a blank space before and after the equal signal.
 * 
 * @author e.dantas
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int A, B, SOMA;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		A = Integer.parseInt(in.readLine());
		B = Integer.parseInt(in.readLine());
		SOMA = A + B;
		System.out.println("SOMA = " + SOMA);
	}

}
