package beginners._1002_area_of_a_circle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

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
        double R;
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
    	PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
        R = Double.parseDouble(in.readLine());
//        A = pi*(R*R);
        out.printf("A=%.4f\n", pi*(R*R));
        in.close();
        out.flush();
//        System.out.println();
	}

}
