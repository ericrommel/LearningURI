package beginners.page01._1004_simple_product;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Make a simple problem that only read two integer values. After that, calculate the product between
 * them and store the result in a variable named PROD. Print the result like the sample below. Do not
 * forget to print the end line after the result otherwise you will get "Presentation Error".
 * 
 * Input
 * - The input file will contain 2 integer numbers.
 * 
 * Output
 * - Print PROD according to the following example, with a blank space before and after the equal signal.
 * 
 * @author e.dantas
 * 
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int A, B, PROD;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		A = Integer.parseInt(in.readLine());
		B = Integer.parseInt(in.readLine());
		PROD = A*B;
		System.out.println("PROD = " + PROD);
	}

}
