package beginners._1021_banknotes_and_coins;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Read a floating point value with two decimal places. This represents a monetary value. Next,
 * calculate the fewest possible notes and coins in which the value can be decomposed. The
 * considered notes are of 100, 50, 20, 10, 5, 2. The possible coins are of 1, 0.50, 0.25, 0.10,
 * 0.05 and 0.01. Print the message “NOTAS:�? followed by the list of notes and the message "MOEDAS:"
 * followed by the list of coins.
 * 
 * Input
 * - The input file contain float point number N (0 ≤ N ≤ 1000000.00).
 * 
 * Output
 * - Print the minimum quantity of banknotes and coins necessary to change the initial value, like
 *   as the given example.
 *   
 * @author Eric
 *
 */
public class Main {
	
	public static void main(String[] args) throws IOException {
		float value=0;
		int aux=0;
		
		List<Double> notes = new ArrayList<Double>(Arrays.asList(100.0, 50.0, 20.0, 10.0, 5.0, 2.0));
		List<Double> coins = new ArrayList<Double>(Arrays.asList(1.0, 0.50, 0.25, 0.10, 0.05, 0.01));
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		value = Float.parseFloat(in.readLine());
		
		out.println("NOTAS:");
		for (double d : notes) {
			aux = (int) (value/d);
			value = (float) (value%d);
			out.printf("%d nota(s) de R$ %.2f\n", aux, d);
		}
		out.println("MOEDAS:");
		for (double d : coins) {
			aux = (int) (value/d);
			value = (float) (value%d);

			if (value!=0.0 & value > 0.005 & value < 0.01) {
				aux++;
			}
			out.printf("%d moeda(s) de R$ %.2f\n", aux, d);
		}
		in.close();
		out.flush();
	}
}
