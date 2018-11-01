package beginners._1006_average_2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Read three numbers (variables A, B and C), which are the test scores of a student. Then, calculate
 * the average, knowing that the note A has a weight of 2, the note B has a weight of 3 and the note C
 * has a weight of 5. Consider that each note can go from 0 to 10.0, always with one decimal place.
 * 
 * Input
 * - The input file contains 3 floating-point numbers with one digit after the decimal point.
 * 
 * Output
 * - Print MEDIA(average in portuguese) according to the following example, with a blank space
 *   before and after the equal signal.
 *   
 * @author e.dantas  
 *   
 */
public class Main {

	public static void main(String[] args) throws IOException {
		float A, B, C;
		double MEDIA;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
//		A = Float.parseFloat(in.readLine());
//		B = Float.parseFloat(in.readLine());
//		C = Float.parseFloat(in.readLine());
//		MEDIA = (Float.parseFloat(in.readLine())*2 + Float.parseFloat(in.readLine())*3 + Float.parseFloat(in.readLine())*5)/(10);
		System.out.printf("MEDIA = %.1f\n", (Float.parseFloat(in.readLine())*2 + Float.parseFloat(in.readLine())*3 + Float.parseFloat(in.readLine())*5)/(10));
		//System.out.println();
		in.close();
		out.flush();
	}

}
