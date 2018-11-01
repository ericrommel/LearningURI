package beginners._1003_simple_sum;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

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
		//int A, B;//, SOMA;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		//A = Integer.parseInt(in.readLine());
		//B = Integer.parseInt(in.readLine());
		//SOMA = A + B;
		out.write("SOMA = " + (Integer.parseInt(in.readLine())+Integer.parseInt(in.readLine())) + "\n");
		in.close();
		out.flush();
	}

}
