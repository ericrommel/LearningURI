package beginners._1038_snack_;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;

/**
 * Using the following table, write a program that reads a code and a amount of an item. After print
 * the value to pay. This is a very simple program with the only intention of practice of selection
 * commands.
 * 
 * Input
 * - The input file contains two integer numbers X and Y. X is the product code and Y is the
 *   quantity of this item according to the above table.
 *   
 * Output
 * - The output must be a message "Total: R$ " followed by the total value to be paid, with 2 digits
 *   after the decimal point.
 *   
 * @author Eric
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		int code=0;
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String[] s = in.readLine().split(" ");
		DecimalFormat df = new DecimalFormat("#.00");
		code = Integer.parseInt(s[0]);
		switch (code) {
		case 1:
			out.write("Total: R$ " + df.format(4*Integer.parseInt(s[1])) + "\n");
			break;
		case 2:
			out.write("Total: R$ " + df.format(4.5*Integer.parseInt(s[1])) + "\n");
			break;
		case 3:
			out.write("Total: R$ " + df.format(5*Integer.parseInt(s[1])) + "\n");
			break;
		case 4:
			out.write("Total: R$ " + df.format(2*Integer.parseInt(s[1])) + "\n");
			break;
		case 5:
			out.write("Total: R$ " + df.format(1.5*Integer.parseInt(s[1])) + "\n");
			break;
		}
		in.close();
		out.flush();
	}
}
