package beginners._1043_triangle;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Read three point floating values (A, B and C) and verify if is possible to make a triangle with
 * them. If it is possible, calculate the perimeter of the triangle and print the message:
 * Perimetro = XX.X
 * If it is not possible, calculate the area of the trapezium which basis A and B and C as height,
 * and print the message:
 * Area = XX.X
 * 
 * Input
 * - The input file has tree floating point numbers.
 * 
 * Output
 * - Print the result with one digit after the decimal point.
 * 
 * @author Eric
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		double A=0, B=0, C=0;//, perimeter=0, area=0;
//		DecimalFormat df = new DecimalFormat("#.0");
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		String[] s = in.readLine().split(" ");
		A = Double.parseDouble(s[0]);
		B = Double.parseDouble(s[1]);
		C = Double.parseDouble(s[2]);
		/**
		 * S� ir� existir um tri�ngulo se, somente se, os seus lados obedeceram � seguinte regra:
		 * um de seus lados deve ser maior que o valor absoluto (m�dulo) da diferen�a dos outros
		 * dois lados e menor que a soma dos outros dois lados.
		 * | b - c | < a < b + c
		 * | a - c | < b < a + c
		 * | a - b | < c < a + b
		 * 
		 * O per�metro � encontrado somando-se os lados de uma figura qualquer.
		 * A �rea de um trap�zio � encontrada seguindo a f�rmula: A = (h*(B + b))/2 
              2 
		 */
		if (
				(Math.abs(B-C) < A && A < (B+C)) &&
				(Math.abs(A-C) < B && B < (A+C)) &&
				(Math.abs(A-B) < C && C < (A+B))
			) {
			//perimeter = A + B + C;
			out.printf("Perimetro = %.1f\n", (A + B + C));
		} else {
			//area = (C*(B + A))/2;
			out.printf("Area = %.1f\n", (C*(B + A))/2);
		}
		in.close();
		out.flush();
	}
}
