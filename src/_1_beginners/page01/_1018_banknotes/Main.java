package _1_beginners.page01._1018_banknotes;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * In this problem you have to read an integer number and calculate the smallest possible number of
 * notes in which the value may be decomposed. The notes are of 100, 50, 20, 10, 5, 2 e 1. Print the
 * value read and the list of notes.
 * 
 * Input
 * - The input file contain an integer number N (0 < N < 1000000).
 * 
 * Output
 * - Print the read number and the minimum quantity of each necessary banknotes, like as the given
 *   example. Do not forget to print the end line after each line, otherwise you will get
 *   "Presentation Error".
 *   
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int X=0, N=0;
		List<Integer> bankNotes = new ArrayList<Integer>(Arrays.asList(100, 50, 20, 10, 5, 2, 1));
		
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(in.readLine());
		in.close();
		System.out.println(N);
		for (int d : bankNotes) {
			X = N/d;
			N = N%d;
			System.out.printf("%d nota(s) de R$ %d,00\n", X, d);
		}
	}

}
