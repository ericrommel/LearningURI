package beginners._1045_triangle_types;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * Read 3 double numbers (A, B and C) representing the sides of a triangle and arrange them in
 * decreasing order, so that the side A is the biggest of the three sides. Next, determine the type
 * of triangle that they can make, based on the following cases always writing an appropriate
 * message:
 * if A >= B + C, write the message: NAO FORMA TRIANGULO
 * if A^2 = B^2 + C^2, write the message: TRIANGULO RETANGULO
 * if A^2 > B^2 + C^2, write the message: TRIANGULO OBTUSANGULO
 * if A^2 < B^2 + C^2, write the message: TRIANGULO ACUTANGULO
 * if the three sides are the same size, write the message: TRIANGULO EQUILATERO
 * if only two sides are the same and the third one is different, write the message: TRIANGULO ISOSCELES
 * 
 * Input
 * - The input contains three double numbers, A (0 < A) , B (0 < B) and C (0 < C).
 * 
 * Output
 * - Print all the classifications of the triangle presented in the input.
 * 
 * @author Eric
 *
 */
public class Main {
	public static void main(String[] args) throws IOException {
		String aux="";
		double A=0, B=0, C=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = in.readLine().split(" ");
		for (int i=0; i<s.length;i++) {
			for (int j=0;j<s.length-1;j++) {
				if (Double.parseDouble(s[j]) < Double.parseDouble(s[j+1])) {
					aux = s[j];
					s[j] = s[j+1];
					s[j+1] = aux;
				}
			}
		}
		A = Double.parseDouble(s[0]);
		B = Double.parseDouble(s[1]);
		C = Double.parseDouble(s[2]);

		if (A >= (B + C)) {
			out.write("NAO FORMA TRIANGULO\n");
		} else {
			if (Math.pow(A,2) == (Math.pow(B,2) + Math.pow(C,2))) {
				out.write("TRIANGULO RETANGULO\n");
			}
			if (Math.pow(A,2) > (Math.pow(B,2) + Math.pow(C,2))) {
				out.write("TRIANGULO OBTUSANGULO\n");
			}
			if (Math.pow(A,2) < (Math.pow(B,2) + Math.pow(C,2))) {
				out.write("TRIANGULO ACUTANGULO\n");
			}
			if (A==B & B==C) {
				out.write("TRIANGULO EQUILATERO\n");
			}
			if ((A==B & B!=C) || (A==C & C!=B) || (B==C & C!=A)){
				out.write("TRIANGULO ISOSCELES\n");
			}
		}
		in.close();
		out.flush();
	}
}
