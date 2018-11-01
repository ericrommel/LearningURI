package beginners._1037_interval;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

/**
 * The input file contain a float-point number. Your task is to print a message saying in which of
 * following intervals the number belongs: [0,25] (25,50], (50,75], (75,100]. If the input is less
 * than zero or greather than 100, the program must print the message "Fora de intervalo" that means
 * "Out of Interval".
 * Examples: [0,25] indicates numbers between 0 and 25.0000, including both.
 *           (25,50] indicates numbers greather than 25 (25.00001) up to 50.0000000.
 * 
 * Input
 * - The input file contains a floating-point number.
 * 
 * Output
 * - The output must be a message like following example.
 * 
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		float num = 0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		num = Float.parseFloat(in.readLine());

		if (num < 0 || num > 100) {
			out.write("Fora de intervalo\n");
		} else {
			if (num <= 25) {
				out.write("Intervalo [0,25]\n");
			} else if (num <= 50) {
				out.write("Intervalo (25,50]\n");
			} else if (num <= 75) {
				out.write("Intervalo (50,75]\n");
			} else {
				out.write("Intervalo (75,100]\n");
			}
		}
		in.close();
		out.flush();
	}
}
