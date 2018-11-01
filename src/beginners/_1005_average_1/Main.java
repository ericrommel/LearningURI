package beginners._1005_average_1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Make a simple program that read two floating numbers corresponding to two tests for a student.
 * After, calculate the average between them, considering that the first number has 3.5 weight
 * and the second one have 7.5 weight. Each number can be from zero to ten, always with one digit
 * after the decimal point. Don't forget to print end line after the result otherwise you will
 * get "Presentation Error". Don't forget the space before and after the equal sign.
 * 
 * Input
 * - The input file will contain 2 floating-point numbers with one digit after the decimal point.
 * 
 * Output
 * - Print MEDIA(average in portuguese) according to the following example, with 5 digits after
 *   the decimal point and a blank space before and after the equal signal.
 *   
 * @author e.dantas  
 *   
 */
public class Main {

	public static void main(String[] args) throws IOException {
//		Locale.setDefault(Locale.US);
//		float A, B;
//		double MEDIA;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
//		A = Float.parseFloat(in.readLine());
//		B = Float.parseFloat(in.readLine());
//		MEDIA = (A*3.5 + B*7.5)/(11);
		out.printf("MEDIA = %.5f\n", ((Float.parseFloat(in.readLine())*3.5 + Float.parseFloat(in.readLine())*7.5)/(11)));
		//System.out.println();
		in.close();
		out.flush();
	}

}
