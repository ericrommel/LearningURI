package beginners._1020_age_in_days;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Read an integer value corresponding to a person's age (in days) and print it in years, months
 * and days, followed by its respective message "ano(s)", "mes(es)", "dia(s)".
 * 
 * Note: only to facilitate the calculation, consider the whole year with 365 days and 30 days
 * every month. In the test cases never will have a situation that allows 12 months and some days,
 * like 360, 363 or 364. This is just an exercise for the purpose of testing simple mathematical
 * reasoning.
 * 
 * Input
 * - The input file contain 1 integer number.
 * 
 * Output
 * - Print the output like the following example.
 * 
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException{
		//int dd = 0; //aa = 0;

		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		int dd = Integer.parseInt(in.readLine());

		//aa = dd/365;
		out.write(dd/365 + " ano(s)\n");

		dd = dd%365;

		//mm = dd/30;

		//dd = dd%30;


		out.write(dd/30 + " mes(es)\n");
		out.write(dd%30 + " dia(s)\n");
		in.close();
		out.flush();
	}
}
