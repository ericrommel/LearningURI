package data_struct_and_libraries._1023_drought;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Due to the continuous drought that happened recently in some regions of Brazil, the Federal
 * Government created an agency to assess the consumption of these regions in order to verify the
 * behavior of the population at the time of rationing. This agency will take some cities (for
 * sampling) and it will verify the consumption of each of the townspeople and the average
 * consumption per inhabitant of each town.
 *
 * Input
 * - The input contains a number of test cases. The first line of each test case contains an integer
 *   N (1 <= N <= 1 * 10^6), indicating the amount properties. The following N lines contains a pair
 *   of values X (1 <= X <= 10) and Y (	1 <= Y <= 200) indicating the number of residents of each
 *   property and its total consumption (m3). Surely, no residence consumes more than 200 m3 per
 *   month. The end of input is represented by zero.
 *
 * Output
 * - For each test case you must present the message "Cidade# n:", where n is the number of the city
 *   in the sequence (1, 2, 3, ...), and then you must list in ascending order of consumption, the
 *   amount people followed by a hyphen and the consumption of these people, rounding the value
 *   down. In the third line of output you should present the consumption per person in that town,
 *   with two decimal places without rounding, considering the total real consumption. Print a blank
 *   line between two consecutives test cases. There is no blank line at end of output.
 *
 * @author e.dantas
 *
 */
public class Main {
	static int[] residents = null;
	static int[]  consumptions = null;

	public static void main(String[] args) throws IOException {

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		String N = " "; // Quantidade de imoveis
		String[] str = null;
		int X=0, Y=0, sumR=0, sumC=0, city=0;// Quantidade de residentes e consumo total
		while ((N=in.readLine()) != null) {
			residents = new int[Integer.parseInt(N)];
			consumptions = new int[Integer.parseInt(N)];
			sumR = sumC = 0;
			if (N.equals("0")) {
				break;
			} else {
				out.write("Cidade# " + (++city) + " :\n");
				for (int i=0; i<Integer.parseInt(N); i++) {
					str = in.readLine().split(" ");
					X = Integer.parseInt(str[0]);
					sumR += X;
					Y = Integer.parseInt(str[1]);
					sumC += Y;
					residents[i] = X;
					consumptions[i] = Y/X;
				}
				sortLists();
				for (int j=0; j<residents.length; j++) {
					out.write(residents[j] + "-" + consumptions[j] + " ");
				}
				out.write("\nConsumo medio: " + (sumC/sumR) + " m3.\n");
			}
		}
		in.close();
		out.flush();
	}

	static void sortLists() {
		int auxR=0, auxC=0;
		for (int i=0; i<consumptions.length; i++) {
			for (int j=0; j<consumptions.length-1; j++) {
				if (consumptions[j] > consumptions[j+1]) {
					auxC = consumptions[j];
					consumptions[j] = consumptions[j+1];
					consumptions[j+1] = auxC;
					auxR = residents[j];
					residents[j] = residents[j+1];
					residents[j+1] = auxR;
				}
			}
		}
	}

	static double averageConsumption(int X, int Y) {
		double average=0.0;

		return average;
	}

}
