package beginners.page01._1002_area_of_a_circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * The area of the circle is defined as A = PI . R2, having PI as 3.14159.
 * Calculate the area using the formula given in the problem description.
 * 
 * Input
 * - Read the variable R (double precision), that is the radius of the circle.
 * 
 * Output
 * - Print the variable A, rounded to four decimal digits.
 *
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
        double pi = 3.14159;
        double A, R;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        R = Double.parseDouble(in.readLine());
        in.close();
        A = pi*Math.pow(R,2);
        System.out.printf("A=%.4f", A);
        System.out.println();
	}

}
