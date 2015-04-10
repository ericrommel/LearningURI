package _1_beginners.page01._1007_Difference;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Make a simple program that reads four variables named A, B, C and D. Calculate and print the
 * difference of the product of A and B with the product of C and D (A * B - C * D).
 * 
 * Input
 * - The input file contains 4 integer numbers.
 * 
 * Output
 * - Print DIFERENCA (DIFFERENCE in portuguese) according to the following example, with a blank
 *   space before and after the equal signal.
 *   
 * @author e.dantas  
 *   
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int A, B, C, D, DIFERENCA;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		A = Integer.parseInt(in.readLine());
		B = Integer.parseInt(in.readLine());
		C = Integer.parseInt(in.readLine());
		D = Integer.parseInt(in.readLine());
		in.close();
		DIFERENCA = (A*B)-(C*D);
		System.out.println("DIFERENCA = " + DIFERENCA);
	}

}
