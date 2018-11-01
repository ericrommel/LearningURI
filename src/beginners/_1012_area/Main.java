package beginners._1012_area;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.StringTokenizer;

/**
 * Make a program that reads three floating-point values: A, B and C. Then calculate and print:
 * - a) the area of the rectangled triangle that has base A and height C.
 * - b) the area of the circle of radius C. (pi = 3.14159)
 * - c) the area of the trapezium which has base A and B and C by height.
 * - d) the area of the square that has side B.
 * - e) the area of the rectangle that has sides A and B.
 * 
 * Input
 * - The input file contains three double numbers with one digit after the decimal point.
 * 
 * Output
 * - The output file contains 5 lines of data. Each line correspond to one of the areas described
 *   above, always with a corresponding message (in portuguese) and one space after the ":" and
 *   before the calculated number. All calculated number must be printed with 3 digits after the
 *   decimal point.
 *   
 * @author e.dantas
 *   
 */
public class Main {

	public static void main(String[] args) throws IOException {
		double A=0, B=0, C=0, PI=3.14159, TRIANGLE, CIRCLE, TRAPEZIUM, SQUARE, RECTANGLE;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String s;
		while ((s = in.readLine()) != null) {
			StringTokenizer st = new StringTokenizer(s);
			while (st.hasMoreTokens()){
				A = Double.parseDouble(st.nextToken());
				B = Double.parseDouble(st.nextToken());
				C = Double.parseDouble(st.nextToken());							
			}
		}
		TRIANGLE = (A*C)/2;
		CIRCLE = PI*Math.pow(C, 2);
		TRAPEZIUM = (C*(A+B))/2;
		SQUARE = B*B;
		RECTANGLE = A*B;
		out.printf("TRIANGULO: %.3f\n", TRIANGLE);
		out.printf("CIRCULO: %.3f\n", CIRCLE);
		out.printf("TRAPEZIO: %.3f\n", TRAPEZIUM);
		out.printf("QUADRADO: %.3f\n", SQUARE);
		out.printf("RETANGULO: %.3f\n", RECTANGLE);
		in.close();
		out.flush();
	}

}
