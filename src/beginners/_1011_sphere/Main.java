package beginners._1011_sphere;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Make a program that calculates and print the volume of a sphere given the radius (R) of the
 * circle. The formula to calculate the volume is: (4/3) * pi * R3. For the purposes of this problem
 * the value of pi is 3.14159.
 * 
 * Tip: Use (4/3.0) or (4.0/3) in your formula, because some languages (including C++) assume that
 *      the result dividing two integers is another integer. :)
 * 
 * Input
 * - The input file contain an integer number.
 * 
 * Output
 * - The output file will contain a message like the following example. Remember the space before
 *   and after the equal signal. The value must be printed with 3 digits after the decimal point.
 *   
 * @author e.dantas
 *   
 */
public class Main {
	public static void main(String[] args) throws IOException {
		int R;
		double PI = 3.14159, VOLUME;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		R=Integer.parseInt(in.readLine());
		VOLUME = (4/3.0)*PI*Math.pow(R, 3);
		out.printf("VOLUME = %.3f\n", VOLUME);
		//System.out.println();
		in.close();
		out.flush();
	}

}
