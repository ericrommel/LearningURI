package simulators._1305_cut_off_rounder;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * Often, when we round a real valued number to an integer, we round up if the fractional part is
 * 0.5 or greater, and down if the fractional part is less than 0.5. In this problem, you are to
 * write a method round, which takes a real valued number as a String, num, and a cutoff as a
 * String, cutoff. cutoff will be formatted exactly as "0.####", where each '#' represents a digit
 * ('0'-'9'). At least one of the digits to the right of the decimal point in cutoff will be
 * non-zero. Your task is to round num up if its fractional part is greater than cutoff, and down
 * otherwise, and return the result as an int. To avoid issues with double imprecision, the
 * fractional part of num will not be exactly equal to cutoff. Hence, the traditional rounding
 * method described in the opening sentence would be represented by cutoff = "0.5000".
 * 
 * Input
 * - The input contains several test cases. Each one is given in two lines. The num string is at the
 * first line and the cutoff is at the second line. num will be a sequence of one or more digits
 * ('0'-'9'), with an optional decimal point ('.'). num will contain between 1 and 10 characters,
 * inclusive. cutoff will be formatted exactly as "0.####", where each '#' represents a digit
 * ('0'-'9'). The fractional part of num will NOT be exactly equal to cutoff.
 * The input is terminatted by EOF.
 * 
 * Output
 * - Your program should output one line to each test case. This line contains only the integer part
 * of num rounded up or down according to the given cutoff.
 * 
 * @author e.dantas
 *
 */
public class Main {

	public static void main(String[] args) throws IOException {
		String myPackage = Main.class.getPackage().getName().replace(".", "/");
		FileInputStream stream = new FileInputStream("src/" + myPackage + "/inputUri1305.txt");
		BufferedReader in = new BufferedReader(new InputStreamReader(stream));
		
		//BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter out = new PrintWriter(new OutputStreamWriter(System.out));
		
		String s = "";
		String num2 = "";
		String[] num=null;
		String cutoff="";
		
		while ((s=in.readLine()) != null) {
			cutoff = in.readLine();
			if (s.contains(".")) {
				num = s.split("\\.");
				if (num[0].equals("")) {
					num[0]="0";
				}
				if (num.length > 1) {
					s = num[0] + "." + num[1];
				} else {
					s = num[0] + ".0";
				}
				
				num2 = s.substring(0, s.indexOf("."));
				s = "0" + s.substring(s.indexOf("."));

			} else {
				num2 = s;
				s = "0";
			}
			if (Double.parseDouble(s) >= Double.parseDouble(cutoff)) {
				out.println(Integer.parseInt(num2)+1);
			} else {
				out.println(num2);
			}
		}
		out.flush();
		in.close();
	}

}
