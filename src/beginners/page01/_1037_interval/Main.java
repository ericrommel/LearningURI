package beginners.page01._1037_interval;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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
		num = Float.parseFloat(in.readLine());
		in.close();
		if (num < 0 || num > 100) {
			System.out.println("Fora de intervalo");
		} else {
			if (num <= 25) {
				System.out.println("Intervalo [0,25]");
			} else if (num <= 50) {
				System.out.println("Intervalo (25,50]");
			} else if (num <= 75) {
				System.out.println("Intervalo (50,75]");
			} else {
				System.out.println("Intervalo (75,100]");
			}
		}
	}
}
